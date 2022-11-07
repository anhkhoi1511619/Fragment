package com.example.fragment_app.View.OtherRecycleView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment_app.Data.ContactModel;
import com.example.fragment_app.R;

import java.util.List;

public class OtherAdapter extends RecyclerView.Adapter<OtherViewHolder> {

    private final List<ContactModel> contactModelList;

    public OtherAdapter(List<ContactModel> contactModelList) {
        this.contactModelList = contactModelList;
    }


    @NonNull
    @Override
    public OtherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View contactView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        OtherViewHolder otherViewHolder = new OtherViewHolder(parent.getContext(), contactView);
        return otherViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OtherViewHolder holder, int position) {
        ContactModel contactModel = contactModelList.get(position);
        TextView textView = holder.nameTxtView;
        textView.setText(contactModel.getName());
        Button button = holder.messengerBtn;
        button.setText(contactModel.isOnline() ? "Messenger" : "Offline");
        button.setEnabled(contactModel.isOnline());
    }

    @Override
    public int getItemCount() {
        return contactModelList.size();
    }
}
