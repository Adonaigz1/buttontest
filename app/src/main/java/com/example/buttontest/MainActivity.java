package com.example.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button clickme;
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickme=findViewById(R.id.bt1);
        text=findViewById(R.id.t11);
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setTypeface(Typeface.SANS_SERIF);
                text.setTextSize(24);
                text.setTextColor(Color.BLUE);
                text.setText("button click");
                text.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this,"You Clicked the button",Toast.LENGTH_LONG).show();

            }
        });
    }
}