package com.jetpack.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Num1, Num2;
    TextView textRes;
    Button Add, Sub, Mul, Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = findViewById(R.id.etNum1);
        Num2 = findViewById(R.id.etNum2);
        textRes = findViewById(R.id.textView);
        Add = findViewById(R.id.btnAdd);
        Sub = findViewById(R.id.btnSub);
        Mul = findViewById(R.id.btnMul);
        Div = findViewById(R.id.btnDiv);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstVal, secondVal, result;

                firstVal = Integer.parseInt(Num1.getText().toString());
                secondVal = Integer.parseInt(Num2.getText().toString());

                result = firstVal + secondVal;
                textRes.setText("Sum is: " + result);

            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int firstVal, secondVal, result;

                    firstVal = Integer.parseInt(Num1.getText().toString());
                    secondVal = Integer.parseInt(Num2.getText().toString());

                    result = firstVal - secondVal;
                    textRes.setText("Difference is: " + result);

                }

        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstVal, secondVal, result;

                firstVal = Integer.parseInt(Num1.getText().toString());
                secondVal = Integer.parseInt(Num2.getText().toString());

                result = firstVal * secondVal;
                textRes.setText("Product is: " + result);

            }

        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float firstVal, secondVal, result;

                firstVal = Integer.parseInt(Num1.getText().toString());
                secondVal = Integer.parseInt(Num2.getText().toString());

                result = firstVal / secondVal;
                textRes.setText("Division is: " + result);

            }

        });

    }
}