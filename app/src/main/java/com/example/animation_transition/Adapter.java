package com.example.animation_transition;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class Adapter extends RecyclerView.Adapter<Adapter.holder> {

    private LinkedList<Singer> singers;
    private LayoutInflater inflater;
    private Context context;
    private Activity activity;

    public Adapter(LinkedList<Singer> singers, Context context, Activity activity) {
        this.singers = singers;
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.activity = activity;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycleview, parent, false);
        return new holder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        Singer singer = singers.get(position);
        holder.tvNameSinger.setText(singer.getNameSinger());
        holder.tvNameSong.setText(singer.getNameSong());
        holder.img.setImageResource(singer.getImg());
    }

    @Override
    public int getItemCount() {
        return singers.size();
    }

    public class holder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private Adapter adapter;
        ImageView img;
        TextView tvNameSong, tvNameSinger;

        public holder(@NonNull View itemView, Adapter adapter) {
            super(itemView);

            tvNameSinger = itemView.findViewById(R.id.tv_tencasi);
            tvNameSong = itemView.findViewById(R.id.tv_tenbainhac);
            img = itemView.findViewById(R.id.img_taylor);

            this.adapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, MainActivity3.class);
            Singer singer= singers.get(getLayoutPosition());

            Bundle bundle = new Bundle();
            bundle.putSerializable("singer", singer);
            intent.putExtra("entity", bundle);

            context.startActivity(intent);
            activity.overridePendingTransition(R.anim.enter_x, R.anim.exit_x);
        }
    }
}
