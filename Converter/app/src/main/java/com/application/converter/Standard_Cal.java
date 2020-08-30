package com.application.converter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Standard_Cal extends AppCompatActivity {
    int in1 = 0, in2 = 0;
    EditText editNumber;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnStop, btnClear, btnEqual, btnAdd, btnSub, btnMul, btnDiv;
    boolean Add, Sub, Mul, Div, Deci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard__cal);
        Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);

        btn0 = (Button) findViewById(R.id.num0);
        btn1 = (Button) findViewById(R.id.num1);
        btn2 = (Button) findViewById(R.id.num2);
        btn3 = (Button) findViewById(R.id.num1);
        btn4 = (Button) findViewById(R.id.num4);
        btn5 = (Button) findViewById(R.id.num5);
        btn6 = (Button) findViewById(R.id.num6);
        btn7 = (Button) findViewById(R.id.num7);
        btn8 = (Button) findViewById(R.id.num8);
        btn9 = (Button) findViewById(R.id.num9);
        btnStop = (Button) findViewById(R.id.Fullstop);
        btnClear = (Button) findViewById(R.id.Clear);
        btnEqual = (Button) findViewById(R.id.equalto);
        btnAdd = (Button) findViewById(R.id.addition);
        btnSub = (Button) findViewById(R.id.substraction);
        btnMul = (Button) findViewById(R.id.multiply);
        btnDiv = (Button) findViewById(R.id.division);

        editNumber = (EditText) findViewById(R.id.editTextNumber);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumber.setText(editNumber.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumber.setText(editNumber.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumber.setText(editNumber.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumber.setText(editNumber.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumber.setText(editNumber.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumber.setText(editNumber.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumber.setText(editNumber.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumber.setText(editNumber.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumber.setText(editNumber.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumber.setText(editNumber.getText() + "9");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editNumber.getText().length() != 0) {
                    in1 = Integer.parseInt(editNumber.getText() + "");
                    Add = true;
                    Deci = false;
                    editNumber.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editNumber.getText().length() != 0) {
                    in1 = Integer.parseInt(editNumber.getText() + "");
                    Sub = true;
                    Deci = false;
                    editNumber.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editNumber.getText().length() != 0) {
                    in1 = Integer.parseInt(editNumber.getText() + "");
                    Mul = true;
                    Deci = false;
                    editNumber.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editNumber.getText().length() != 0) {
                    in1 = Integer.parseInt(editNumber.getText() + "");
                    Div = true;
                    Deci = false;
                    editNumber.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Sub || Mul || Div) {
                    in2 = Integer.parseInt(editNumber.getText() + "");
                }

                if (Add) {
                    editNumber.setText(in1 + in2 + "");
                    Add = false;
                }

                if (Sub) {
                    editNumber.setText(in1 - in2 + "");
                    Sub = false;
                }

                if (Mul) {
                    editNumber.setText(in1 * in2 + "");
                    Mul = false;
                }

                if (Div) {
                    editNumber.setText(in1 / in2 + "");
                    Div = false;
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumber.setText("");
                in1 = 0;
                in2 = 0;
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Deci) {
                } else {
                    editNumber.setText(editNumber.getText() + ".");
                    Deci = true;
                }

            }
        });
    }
}