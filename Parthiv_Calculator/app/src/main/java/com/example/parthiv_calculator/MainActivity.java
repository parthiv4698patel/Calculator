package com.example.parthiv_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonAC, buttonEqual, buttonDot;
    EditText resultEditText;

    float ValueOne, ValueTwo;

    boolean Add, Sub, Mul, Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonAdd = (Button) findViewById(R.id.btnadd);
        buttonSub = (Button) findViewById(R.id.btnsub);
        buttonMul = (Button) findViewById(R.id.btnmul);
        buttonDiv = (Button) findViewById(R.id.btndiv);
        buttonAC = (Button) findViewById(R.id.btnclear);
        buttonEqual = (Button) findViewById(R.id.btneq);
        buttonDot = (Button) findViewById(R.id.btndot);
        resultEditText = (EditText) findViewById(R.id.edt);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText(resultEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText(resultEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText(resultEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText(resultEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText(resultEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText(resultEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText(resultEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText(resultEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText(resultEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText(resultEditText.getText() + "0");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText(resultEditText.getText() + ".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (resultEditText == null) {
                    resultEditText.setText("");
                } else {
                    ValueOne = Float.parseFloat(resultEditText.getText() + "");
                    Add = true;
                    resultEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(resultEditText.getText() + "");
                Sub = true;
                resultEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(resultEditText.getText() + "");
                Mul = true;
                resultEditText.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(resultEditText.getText() + "");
                Div = true;
                resultEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueTwo = Float.parseFloat(resultEditText.getText() + "");

                if (Add == true) {
                    resultEditText.setText(ValueOne + ValueTwo + "");
                    Add = false;
                }

                if (Sub == true) {
                    resultEditText.setText(ValueOne - ValueTwo + "");
                    Sub = false;
                }

                if (Mul == true) {
                    resultEditText.setText(ValueOne * ValueTwo + "");
                    Mul = false;
                }

                if (Div == true) {
                    resultEditText.setText(ValueOne / ValueTwo + "");
                    Div = false;
                }
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEditText.setText("");
            }
        });


    }
}