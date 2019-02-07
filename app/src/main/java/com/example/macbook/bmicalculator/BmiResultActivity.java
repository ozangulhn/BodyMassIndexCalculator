package com.example.macbook.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.DecimalFormat;

public class BmiResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_result_activity);
        TextView resultText = findViewById(R.id.resultTextView);
        Intent intent = getIntent();
        String Bmi = intent.getStringExtra("BMIVAL");
        resultText.setText( getString(R.string.resultLabel , new DecimalFormat("##.#").format(Double.parseDouble(Bmi))));
    }
}
