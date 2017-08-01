package com.example.oops.hello;

import android.content.Context;
import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Oops on 2017-07-26.
 */

public class MyAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<String> items;

    public MyAdapter(Context context, ArrayList<String> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false);
        VH vh= new VH(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        VH vh= (VH) holder;
        vh.tv.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class VH extends RecyclerView.ViewHolder{

        TextView tv;

        public VH(View itemView) {
            super(itemView);
            tv= itemView.findViewById(android.R.id.text1);
        }
    }
}
