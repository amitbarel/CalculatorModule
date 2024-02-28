package com.example.a24_10221_l08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mycalculator.Calculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int result = Calculator.add(2,2);
    }
}