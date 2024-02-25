package com.cscorner.calcdevj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText num1;
EditText num2;
Button Add;
Button Subtract;
Button Multiply;
Button Divide ;
TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        result=findViewById(R.id.result);
        Add = findViewById(R.id.add);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                double numb1 = Double.parseDouble(n1);
                String n2 = num2.getText().toString();
                double numb2 = Double.parseDouble(n2);
                double add = add(numb1,numb2);
                result.setText(""+add);
            }
        });
        Subtract = findViewById(R.id.subtract);
        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                double numb1 = Double.parseDouble(n1);
                String n2 = num2.getText().toString();
                double numb2 = Double.parseDouble(n2);
                double subtract = subtract(numb1,numb2);
                result.setText(""+subtract);

            }
        });
        Multiply=findViewById(R.id.multiply);
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                double numb1 = Double.parseDouble(n1);
                String n2 = num2.getText().toString();
                double numb2 = Double.parseDouble(n2);
                double multiply = multipy(numb1,numb2);
                result.setText(""+multiply);

            }
        });
        Divide=findViewById(R.id.divide);
        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                double numb1 = Double.parseDouble(n1);
                String n2 = num2.getText().toString();
                double numb2 = Double.parseDouble(n2);
                double divide = divide(numb1,numb2);
                result.setText(""+divide);
            }
        });
    }

    public double add(double a ,double b){
        return a+b;
    }
    public double subtract(double a , double b){
        return a-b;
    }
    public double multipy(double a , double b){
        return a*b;
    }
    public double divide(double a , double b){
        return a/b;
    }
}