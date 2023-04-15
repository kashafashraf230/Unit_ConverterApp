package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText userValue = findViewById(R.id.UserValue);
        Button button = findViewById(R.id.resultButton);
        TextView resultValue = findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String kgs = userValue.getText().toString();
                Double kilograms = Double.parseDouble(kgs);

                double pounds = (Double) kilograms * 2.20462;
                resultValue.setText("" + pounds);
            }
        });
    }
}