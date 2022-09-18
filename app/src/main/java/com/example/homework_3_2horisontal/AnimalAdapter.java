package com.example.homework_3_2horisontal;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    public AnimalAdapter(ArrayList<String> animaList) {
        this.animaList = animaList;
    }

    private ArrayList<String> animaList;

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animals, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
holder.bind(animaList.get(position));
    }

    @Override
    public int getItemCount() {
        return animaList.size();
    }
}
