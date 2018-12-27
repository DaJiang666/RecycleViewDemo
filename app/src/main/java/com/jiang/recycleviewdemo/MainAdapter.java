package com.jiang.recycleviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainBaseHolder> {

    private Context mContext;
    private List<TestBean> mList;

    public MainAdapter(Context context, List<TestBean> typeList) {
        this.mContext = context;
        this.mList = typeList;
    }

    private static int MAIN_TYPE = 1;
    private static int BASE_TYPE = 2;


    @NonNull
    @Override
    public MainBaseHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        if (viewType == MAIN_TYPE) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_main, viewGroup, false);
            return new MainBaseHolder(view);
        } else {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_main, viewGroup, false);
            return new MainBaseHolder(view);
        }

    }


    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return MAIN_TYPE;
        } else {
            return BASE_TYPE;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull MainBaseHolder s, int i) {

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
