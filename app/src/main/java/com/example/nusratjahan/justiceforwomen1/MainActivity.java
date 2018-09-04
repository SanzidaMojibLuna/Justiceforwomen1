package com.example.nusratjahan.justiceforwomen1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button,gov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);
        gov = findViewById(R.id.gov);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity();
            }
        });
        gov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });
    }

    public void openactivity() {

        Intent intent = new Intent(this,lawyerhomepage.class);
        startActivity(intent);
    }
    public void openactivity2() {

        Intent intent = new Intent(this,govhomepage.class);
        startActivity(intent);
    }
}
