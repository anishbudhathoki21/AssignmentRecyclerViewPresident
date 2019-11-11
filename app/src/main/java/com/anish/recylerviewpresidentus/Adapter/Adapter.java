package com.anish.recylerviewpresidentus.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anish.recylerviewpresidentus.Activity.SecondActivity;
import com.anish.recylerviewpresidentus.Model.ModelPresident;
import com.anish.recylerviewpresidentus.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    Context context;
    List<ModelPresident> modelList;

    public Adapter(Context context, List<ModelPresident> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout, parent, false);

        return new ViewHolder(view, context, modelList);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelPresident president = modelList.get(position);
        holder.txtName.setText(president.getName());
        holder.imgPresident.setImageResource(president.getImgId());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        CircleImageView imgPresident;
        TextView txtName;
        Context context;
        List<ModelPresident> list;

        public ViewHolder(@NonNull View itemView, Context context, List<ModelPresident> list) {
            super(itemView);
            imgPresident = itemView.findViewById(R.id.presidentImage);
            txtName = itemView.findViewById(R.id.presidentName);
            itemView.setOnClickListener(this);
            this.context = context;
            this.list = list;
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, SecondActivity.class);
            ModelPresident model;
            model = list.get(getAdapterPosition());
            intent.putExtra("image", model.getImgId());
            intent.putExtra("name", model.getName());
            intent.putExtra("detail", model.getDetail());
            context.startActivity(intent);
        }
    }
}
