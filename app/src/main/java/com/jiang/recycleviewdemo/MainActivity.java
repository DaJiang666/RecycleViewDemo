package com.jiang.recycleviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //设置布局管理器
        recyclerView.setLayoutManager(layoutManager);
        //设置为垂直布局，这也是默认的
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        List<TestBean> list = new ArrayList<>();

        TestBean testBean0 = new TestBean();

        for (int i = 1; i < 30; i++) {
            TestBean bean = new TestBean();
            bean.name = "Main" + i;
            list.add(bean);
        }

        MainAdapter mainAdapter = new MainAdapter(getApplicationContext(), list);
        recyclerView.setAdapter(mainAdapter);
    }
}
