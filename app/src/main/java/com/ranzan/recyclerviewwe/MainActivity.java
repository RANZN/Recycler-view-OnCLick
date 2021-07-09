package com.ranzan.recyclerviewwe;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    private RecyclerView recyclerView;
    private ArrayList<StudentModel> studentList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        StudentAdapter articleAdapter = new StudentAdapter(studentList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(articleAdapter);
    }

    private void buildList() {
        for (int i = 0; i < 100; i++) {
            StudentModel studentModel = new StudentModel("Ranzan-" + i, 22,
                    "xyz abd-" + i + i, "8-7-21", R.drawable.jeff);
            studentList.add(studentModel);
        }
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public void onItemClick(StudentModel studentModel, int position) {

        new AlertDialog.Builder(this)
                .setTitle(studentModel.getName()).
                setMessage(studentModel.getAge() + "\n"
                        + studentModel.getDOB() + "\n"
                        + studentModel.getAddress()
                ).
                setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Toast.makeText(this, studentModel.getName() + " pos= " + (position + 1), Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}