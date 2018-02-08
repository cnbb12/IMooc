package com.example.lenovo.moocclass.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.moocclass.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2018/2/7.
 */

public class MineAdapter extends RecyclerView.Adapter<MineAdapter.ViewHolder> {

    private List<MineItem> listItems = new ArrayList<>();

    public MineAdapter(List<MineItem> listItems){
        this.listItems = listItems;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mine_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MineItem mineItem = listItems.get(position);
        holder.mineTitle.setText(mineItem.getText());


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mineTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            mineTitle = (TextView) itemView.findViewById(R.id.mine_items_title);

        }
    }
}
