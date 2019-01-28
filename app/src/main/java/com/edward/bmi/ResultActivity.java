package com.edward.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = findViewById(R.id.result);
        Float bmi = getIntent().getFloatExtra("Bmi", 0);
        result.setText(getString(R.string.your_bmi_is) + bmi);
    }
}
