package com.example.hw2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MessageViewHolder extends RecyclerView.ViewHolder {

    public CardView Card;
    public ImageView Avatar;
    public TextView Name;
    public TextView Text;

    public MessageViewHolder(@NonNull View itemView) {
        super(itemView);
        Card = itemView.findViewById(R.id.card);
        Avatar = itemView.findViewById(R.id.avatar);
        Name = itemView.findViewById(R.id.name);
        Text = itemView.findViewById(R.id.text);
    }
}
