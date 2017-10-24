package com.example.user.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void bmi(View view) {
        Log.d("MainActivity","testing bmi method");
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);
        Log.d(''MainActivity'', ''You BMI is:'' + bmi);

    }
}