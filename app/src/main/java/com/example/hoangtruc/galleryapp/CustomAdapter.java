package com.example.hoangtruc.galleryapp;

import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private List<String> mListImage;

    public CustomAdapter(List<String> mListImage) {
        this.mListImage = mListImage;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
         View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_image,viewGroup,false);
        CustomViewHolder vHolder=new CustomViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i) {
          customViewHolder.imageView.setImageBitmap(BitmapFactory.decodeFile(mListImage.get(i)));
    }

    @Override
    public int getItemCount() {
        return mListImage.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_);
        }
    }
}
