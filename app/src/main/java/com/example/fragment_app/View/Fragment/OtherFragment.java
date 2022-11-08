package com.example.fragment_app.View.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
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

    private static RecyclerView rvOtherRecycleView = null;
    private static List<ContactModel> other = new ArrayList<ContactModel>();
    private OtherAdapter otherAdapter = null;
    private View myOtherView;


    public OtherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        dataInitialize();
        myOtherView = inflater.inflate(R.layout.fragment_other, container, false);
        rvOtherRecycleView = myOtherView.findViewById(R.id.rvOtherView);
        rvOtherRecycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        rvOtherRecycleView.setHasFixedSize(true);

        return myOtherView;
    }

    /**
     * 概要：コンデイションが変化した際の初期化処理
     */
    public void changeConditionInit() {
        otherAdapter = new OtherAdapter(getContext(), other);
        rvOtherRecycleView.setAdapter(otherAdapter);

    }

    /**
     * 概要：データ初期化処理
     */
    private void dataInitialize() {

        other = new ArrayList<>();
        other = ContactModel.createContactsList(20);
    }
}