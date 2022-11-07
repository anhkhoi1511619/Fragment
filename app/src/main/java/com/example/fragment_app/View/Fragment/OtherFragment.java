package com.example.fragment_app.View.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment_app.Data.ContactModel;
import com.example.fragment_app.R;
import com.example.fragment_app.View.OtherRecycleView.OtherAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class OtherFragment extends Fragment {

    private OtherAdapter adapter = null;
    private static RecyclerView rvOtherRecycleView = null;
    private static List<ContactModel> other = new ArrayList<ContactModel>();
    private View myOtherButton;


//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//
//        rvOtherRecycleView.findViewById(R.id.frame_other_layout);
//        other = ContactModel.createContactsList(20);
//        adapter = new OtherAdapter(other);
//        rvOtherRecycleView.setAdapter(adapter);
//        rvOtherRecycleView.setLayoutManager(new LinearLayoutManager(this));
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        other = ContactModel.createContactsList(20);
        adapter = new OtherAdapter(other);
        rvOtherRecycleView.setAdapter(adapter);
        myOtherButton = inflater.inflate(R.layout.fragment_other, container, false);
        rvOtherRecycleView.findViewById(R.id.frame_other_layout);
        rvOtherRecycleView.setHasFixedSize(true);
        rvOtherRecycleView.setLayoutManager(new LinearLayoutManager(myOtherButton.getContext()));
        return myOtherButton;
    }

//    @Override
//    public void displayList(Context context) {
//        other = ContactModel.createContactsList(20);
//        adapter = new OtherAdapter(other);
//        rvOtherRecycleView.setAdapter(adapter);
//        rvOtherRecycleView.setLayoutManager(new LinearLayoutManager(context));
//    }
}