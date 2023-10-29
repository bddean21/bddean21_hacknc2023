package com.example.skeletonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int image = getIntent().getIntExtra("image", 0);
        String title = getIntent().getStringExtra("title");
        String text = getIntent().getStringExtra("text");
        ImageView imageView = findViewById(R.id.image);
        TextView titleView = findViewById(R.id.title);
        TextView textView = findViewById(R.id.text);
        imageView.setImageResource(image);
        titleView.setText(title);
        textView.setText(text);

    }

    public void back(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}