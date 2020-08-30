package com.application.converter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CurrencyConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
        Toolbar toolbar7 = (Toolbar) findViewById(R.id.toolbar7);
        setSupportActionBar(toolbar7);
    }

    public void onClick(View view) {
        EditText editText=(EditText) findViewById(R.id.editTextNumber8);

        double rupees= Double.parseDouble(editText.getText().toString());
        double dollar= 0.013;

                double result= dollar *rupees;

        Toast.makeText(CurrencyConverter.this, Double.toString(result),Toast.LENGTH_LONG).show();
    }
}