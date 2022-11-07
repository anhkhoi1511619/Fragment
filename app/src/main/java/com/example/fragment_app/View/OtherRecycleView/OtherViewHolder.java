package com.example.fragment_app.View.OtherRecycleView;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment_app.R;

public class OtherViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView nameTxtView;
    public Button messengerBtn;
    private Context mContext;

    public OtherViewHolder(Context context, View itemView) {
        super(itemView);
        nameTxtView = (TextView) itemView.findViewById(R.id.contact_name);
        messengerBtn = (Button) itemView.findViewById(R.id.message_button);
        mContext = context;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int pos =getAdapterPosition();
        if (pos != RecyclerView.NO_POSITION) {
            Toast.makeText(mContext, nameTxtView.getText(), Toast.LENGTH_LONG).show();
        }
    }
}
