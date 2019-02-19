package com.example.lumo.handson15;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.example.lumo.handson15.R;

public class MainActivity extends AppCompatActivity {
    TableRow row2;
    Button red;
    Button yellow;
    Button blue;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        row2 = findViewById(R.id.row_change);
        red = findViewById(R.id.cor1);
        yellow = findViewById(R.id.cor2);
        blue = findViewById(R.id.cor3);
        clear = findViewById(R.id.clear);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row2.setBackgroundColor(Color.GRAY);
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row2.setBackgroundColor(Color.RED);
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row2.setBackgroundColor(Color.YELLOW);
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row2.setBackgroundColor(Color.BLUE);
            }
        });

    }
}
