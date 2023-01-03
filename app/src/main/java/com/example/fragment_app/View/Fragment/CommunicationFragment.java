package com.example.fragment_app.View.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.fragment_app.Data.Database.StudentClassModel;
import com.example.fragment_app.Data.Database.iSendDataListener;
import com.example.fragment_app.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class CommunicationFragment extends Fragment {
    private TextView tvComContactName;
    private Button btnDisplay;
    private View mComView;
    private static iSendDataListener iSendDataListener;


    public static CommunicationFragment getInstance(StudentClassModel studentClassModel, iSendDataListener listener) {
        iSendDataListener = listener;
        CommunicationFragment communicationFragment = new CommunicationFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("object_contactmodel", studentClassModel);
        communicationFragment.setArguments(bundle);
        return communicationFragment;
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mComView = inflater.inflate(R.layout.fragment_communication, container, false);
        initUI();
        return mComView;
    }

    private void initUI() {
        tvComContactName = (TextView) mComView.findViewById(R.id.contact_name_com);
        btnDisplay = (Button) mComView.findViewById(R.id.message_button_com);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDataToActivity();
            }
        });

        try {
            StudentClassModel studentClassModel = (StudentClassModel) getArguments().get("object_contactmodel");
            tvComContactName.setText(studentClassModel.getFullName());
            btnDisplay.setEnabled(studentClassModel.isMale());
        } catch (NullPointerException exception) {

        }
//        if (getArguments().get("object_contactmodel") != null) {
//            ContactModel contactModel = (ContactModel) getArguments().get("object_contactmodel");
//            tvComContactName.setText(contactModel.getName());
//            btnDisplay.setEnabled(contactModel.isDisplay());
//        }
    }

    private void sendDataToActivity() {
        String strName = tvComContactName.getText().toString().trim();
        Boolean isDisplay = btnDisplay.isEnabled();

        StudentClassModel studentClassModel = new StudentClassModel(strName, "Khoi", isDisplay, "Japan");
        iSendDataListener.sendData(studentClassModel);
    }
}