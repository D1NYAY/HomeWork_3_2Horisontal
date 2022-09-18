package com.example.homework_3_2horisontal;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView tvAnimal;
    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAnimal = itemView.findViewById(R.id.tv_animal);
    }
     public void bind (String animals) {
        tvAnimal.setText(animals);

     }
}
