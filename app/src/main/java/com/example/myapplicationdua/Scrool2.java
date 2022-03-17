package com.example.myapplicationdua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Scrool2 extends AppCompatActivity {
    TextView morning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrool2);
        morning=(TextView)findViewById(R.id.morningduas);
    }
}