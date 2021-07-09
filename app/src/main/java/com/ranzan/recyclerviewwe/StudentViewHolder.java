package com.ranzan.recyclerviewwe;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvStudentImg;
    private TextView mTvName;
    private TextView mTVAge;
    private TextView mTvDob;
    private TextView mTvAddress;
    private RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;


    public StudentViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        mIvStudentImg = itemView.findViewById(R.id.ivStudentImg);
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAddress = itemView.findViewById(R.id.tvAddress);
        mTvDob = itemView.findViewById(R.id.tvDOB);
        mTVAge = itemView.findViewById(R.id.tvDOB);
        relativeLayout = itemView.findViewById(R.id.relative);


    }

    public void setData(StudentModel studentModel) {
        mIvStudentImg.setImageResource(studentModel.getImageID());
        mTvName.setText(studentModel.getName());
        mTVAge.setText(studentModel.getAge() + "");
        mTvAddress.setText(studentModel.getAddress());
        mTvDob.setText(studentModel.getDOB());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(studentModel, getAdapterPosition());
            }
        });
    }
}