package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

import java.nio.FloatBuffer;

public class MainActivity extends AppCompatActivity {

    EditText fcText, scText;
    TextView resultText;
    Button sumButton, subtractButton, divideButton, multiplyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fcText = findViewById(R.id.first_count);
        scText = findViewById(R.id.second_count);
        resultText = findViewById(R.id.result);
        sumButton = findViewById(R.id.sum);
        subtractButton = findViewById(R.id.subtract);
        divideButton = findViewById(R.id.divide);
        multiplyButton = findViewById(R.id.multiply);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float fc = Float.parseFloat(fcText.getText().toString());
                float sc = Float.parseFloat(scText.getText().toString());
                float res = fc + sc;
                resultText.setText(Float.valueOf(res).toString());
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float fc = Float.parseFloat(fcText.getText().toString());
                float sc = Float.parseFloat(scText.getText().toString());
                float res = fc - sc;
                resultText.setText(Float.valueOf(res).toString());
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float fc = Float.parseFloat(fcText.getText().toString());
                float sc = Float.parseFloat(scText.getText().toString());
                float res = fc / sc;
                resultText.setText(Float.valueOf(res).toString());
            }
        });
       multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float fc = Float.parseFloat(fcText.getText().toString());
                float sc = Float.parseFloat(scText.getText().toString());
                float res = fc * sc;
                resultText.setText(Float.valueOf(res).toString());
            }
        });
    }
}