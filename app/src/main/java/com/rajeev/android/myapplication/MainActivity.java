package com.rajeev.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    CardView c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CardView)findViewById(R.id.c1);
        c1.setOnClickListener(v -> {
            Intent n1 =new Intent (MainActivity.this,itr20.class);
            startActivity(n1);
        });
    }
}