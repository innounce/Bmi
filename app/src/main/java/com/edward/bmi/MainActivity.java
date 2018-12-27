package com.edward.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText height;
    private EditText weight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

    }

    private void findViews() {
        height = findViewById(R.id.ed_height);
        weight = findViewById(R.id.ed_weight);
        result = findViewById(R.id.result);
        Button help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this).setTitle(R.string.help).setMessage(R.string.explan).setPositiveButton(R.string.ok,null).show();
            }
        });
    }

    public void calc(View v){
        String h = height.getText().toString();
        String w = weight.getText().toString();
        float hf = Float.parseFloat(h);
        float wf = Float.parseFloat(w);
        float bmi = wf / ( hf * hf);
//        Log.d("MainActivity", "bmi: "+bmi);
//        Toast.makeText(this, "BMI is " + bmi, Toast.LENGTH_LONG).show();
        result.setText("Your BMI is " + bmi);
        new AlertDialog.Builder(this).setTitle("MBI").setMessage("BMI is " + bmi).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                height.setText("");
                weight.setText("");
            }
        }).show();
    }
}
