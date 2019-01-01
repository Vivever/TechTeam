package com.example.android.techteam;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public  class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private List<String> list;


    RecyclerAdapter(@NonNull List<String> list) {
        this.list = list;
    }

    @NonNull
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        TextView textView =(TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.notification_list_item,viewGroup,false);
        return new MyViewHolder(textView);
    }


    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        viewHolder.textView.setText(list.get(i));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;

        MyViewHolder(@NonNull TextView itemView) {
            super(itemView);
            textView=itemView;
        }
    }

}
