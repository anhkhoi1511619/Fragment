package com.example.fragment_app.View.OtherRecycleView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment_app.Data.Database.StudentClassModel;
import com.example.fragment_app.R;

import java.util.List;

public class OtherAdapter extends RecyclerView.Adapter<OtherViewHolder> {

    Context context;

    private List<StudentClassModel> studentClassModelList;

    /**
     * 概要：コンストラクタ
     *
     * @param studentClassModelList:ボタン名の配列
     */
    public OtherAdapter(Context context, List<StudentClassModel> studentClassModelList) {
        this.context = context;
        this.studentClassModelList = studentClassModelList;
    }
    public void setData(List<StudentClassModel> studentClassModels) {
        this.studentClassModelList = studentClassModels;
        notifyDataSetChanged();
    }


    /**
     * 概要：ビューホルダーのインスタンスを生成
     *
     * @param parent:レイアウト(LinearLayoutなど)
     * @param viewType:ビューの形式(ImageViewなど)
     * @return ビューホルダーのインスタンス
     */
    @NonNull
    @Override
    public OtherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View contactView = LayoutInflater.from(context).inflate(R.layout.item_contact, parent, false);
        OtherViewHolder otherViewHolder = new OtherViewHolder(context, contactView, studentClassModelList);
        return otherViewHolder;
    }

    /**
     * 概要:ビューホルダーから適切なボタン名を見つけ、ボタン名をセットする
     *
     * @param holder:                    ビューホルダー
     * @param position:ボタンの位置(一番上のボタンが0）
     */
    @Override
    public void onBindViewHolder(@NonNull OtherViewHolder holder, int position) {
        StudentClassModel studentClassModel = studentClassModelList.get(position);
        holder.nameTxtView.setText(studentClassModel.getName());
        holder.messengerBtn.setText(studentClassModel.isDisplay() ? "Display" : "No Display");
        holder.messengerBtn.setEnabled(studentClassModel.isDisplay());
    }

    /**
     * 概要:ボタンの総数を出力する
     */
    @Override
    public int getItemCount() {
        return studentClassModelList.size();
    }
}
