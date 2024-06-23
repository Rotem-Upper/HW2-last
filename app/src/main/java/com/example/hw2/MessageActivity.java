package com.example.hw2;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Bundle bundle = getIntent().getExtras();
        Message message = (Message) bundle.getSerializable("message");


        TextView Name = findViewById(R.id.name);
        TextView Text = findViewById(R.id.text);
        ImageView Avatar = findViewById(R.id.avatar);

        Avatar.setImageURI(Uri.parse(message.Avatar));
        Glide.with(this).load(message.Avatar).into(Avatar);
        Name.setText(message.Name);
        Text.setText(message.Text);
    }
}