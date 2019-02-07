package com.example.macbook.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText weightText = findViewById(R.id.weightEditText);
        weightText.setInputType(2 | 8192 );
        final EditText heightText = findViewById(R.id.heightEditText);
        heightText.setInputType(2 | 8192 );
        Button calculateButton = findViewById(R.id.buttonCalculate);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double weight,height,Bmi;
                weight = Double.parseDouble(weightText.getText().toString());
                height = Double.parseDouble(heightText.getText().toString());
                Bmi = weight / (height * height);
                Intent intent = new Intent(MainActivity.this,BmiResultActivity.class);
                intent.putExtra("BMIVAL" , Bmi.toString() );
                startActivity(intent);
            }
        });
    }
}
