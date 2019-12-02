package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView first_image;
    private boolean sm=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_image = (ImageView) findViewById(R.id.imageView);
        first_image.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        first_image.setImageDrawable(getResources().getDrawable(R.drawable.second, null));
        if (sm)
            first_image.setImageDrawable(getResources().getDrawable(R.drawable.second, null));
        else
            first_image.setImageDrawable(getResources().getDrawable(R.drawable.first, null));
        sm= !sm;
    }

    }

