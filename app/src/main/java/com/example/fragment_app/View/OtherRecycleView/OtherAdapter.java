package com.example.fragment_app.View.OtherRecycleView;

import android.content.Context;
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

    Context context;

    private final List<ContactModel> contactModelList;

    /**
     * 概要：コンストラクタ
     * @param contactModelList:ボタン名の配列
     */
    public OtherAdapter(Context context, List<ContactModel> contactModelList) {
        this.context = context;
        this.contactModelList = contactModelList;
    }


    /**
     * 概要：ビューホルダーのインスタンスを生成
     * @param parent:レイアウト(LinearLayoutなど)
     * @param viewType:ビューの形式(ImageViewなど)
     * @return ビューホルダーのインスタンス
     */
    @NonNull
    @Override
    public OtherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View contactView = LayoutInflater.from(context).inflate(R.layout.item_contact, parent, false);
        OtherViewHolder otherViewHolder = new OtherViewHolder(context, contactView, contactModelList);
        return otherViewHolder;
    }

    /**
     * 概要:ビューホルダーから適切なボタン名を見つけ、ボタン名をセットする
     * @param  holder: ビューホルダー
     * @param position:ボタンの位置(一番上のボタンが0）
     */
    @Override
    public void onBindViewHolder(@NonNull OtherViewHolder holder, int position) {
        ContactModel contactModel = contactModelList.get(position);
        TextView textView = holder.nameTxtView;
        textView.setText(contactModel.getName());
        Button button = holder.messengerBtn;
        button.setText(contactModel.isDisplay() ? "Display" : "No Display");
        button.setEnabled(contactModel.isDisplay());
    }

    /**
     * 概要:ボタンの総数を出力する
     */
    @Override
    public int getItemCount() {
        return contactModelList.size();
    }
}
