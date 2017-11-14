package com.example.user.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String s = new String("abc");
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            new AlertDialog.Builder(MainActivity.this)
            .setTitle("bmi是一種計算的東西")
            .setMessage("體重/身高平方")
                    .setPositiveButton("OK",null)
                    .show();

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bHelp = (Button) findViewById(R.id.b_help);
        bHelp.setOnClickListener(listener);


    }

    public void bmi(View view) {
        Log.d("MainActivity","testing bmi method");
        EditText edHeight = (EditText) findViewById(R.id.height);
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);
        new AlertDialog.Builder(this)
                .setMessage(getString(R.string.Your_BMI_is)+bmi)
                .setMessage(getString(R.string.bmi_title))
                .setPositiveButton(R.string.OK, null)
                .show();
        TextView dia = (TextView)findViewById(R.id.b_bmi);// 取得 顯示診斷 物件

        if (bmi<20)
            dia.setText("請多吃點");
        else if (20<= bmi && bmi< 24)
            dia.setText("正常範圍");
        else if (24 <=bmi && bmi < 27)
            dia.setText("過    重");
        else if (27 <=bmi && bmi < 30)
            dia.setText("輕度肥胖");
        else if (30 <= bmi && bmi < 35)
            dia.setText("中度肥胖");

        if (height>3)
            dia.setText("身高單位應為公尺");
    }


//        Log.d("MainActivity","You BMI is:"+bmi);
//        Toast.makeText(this,
//                "You BMI is:"+bmi,ToastLENGTH_SHORT).show();



    }
}