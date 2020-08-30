package com.application.converter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class UnitArea extends AppCompatActivity {

    EditText editNumber2, editNumber3;
    Spinner s1, s2;
    int in3 = 0;
    public ConvertingMethod.Area ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_area);
        Toolbar toolbar4 = (Toolbar) findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar4);

        editNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        editNumber3 = (EditText) findViewById(R.id.editTextNumber3);
        s1 = (Spinner) findViewById(R.id.spinner);
        s2 = (Spinner) findViewById(R.id.spinner2);

        ca = new ConvertingMethod.Area();
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.num0:
                editNumber2.setText(editNumber2.getText() + "0");
                break;

            case R.id.num1:
                editNumber2.setText(editNumber2.getText() + "1");
                break;

            case R.id.num2:
                editNumber2.setText(editNumber2.getText() + "2");
                break;

            case R.id.num3:
                editNumber2.setText(editNumber2.getText() + "3");
                break;

            case R.id.num4:
                editNumber2.setText(editNumber2.getText() + "4");
                break;

            case R.id.num5:
                editNumber2.setText(editNumber2.getText() + "5");
                break;

            case R.id.num6:
                editNumber2.setText(editNumber2.getText() + "6");
                break;

            case R.id.num7:
                editNumber2.setText(editNumber2.getText() + "7");
                break;

            case R.id.num8:
                editNumber2.setText(editNumber2.getText() + "8");
                break;

            case R.id.num9:
                editNumber2.setText(editNumber2.getText() + "9");
                break;

            case R.id.Fullstop:
                if (in3 == 0) {
                    editNumber2.setText(editNumber2.getText() + ".");
                    in3++;
                }
                break;

            case R.id.Clear:
                editNumber2.setText("");
                editNumber3.setText("");
                in3 = 0;
                break;

            case R.id.equalto:
                int item1 = s1.getSelectedItemPosition();
                int item2 = s2.getSelectedItemPosition();
                double value1 = Double.parseDouble(editNumber2.getText().toString());
                double result = evaluate(item1, item2, value1);
                editNumber3.setText(result + "");
                break;

        }
    }

    public double evaluate(int item1, int item2, double value) {
        double number = 0.0;
        if (item1 == item2)
            return value;
        else {
            switch (item1) {
                case 0:
                    number = ca.sqMilliToMeter(value);
                    break;
                case 1:
                    number = ca.sqCentiToMeter(value);
                    break;
                case 2:
                    number = ca.sqKiloToMeter(value);
                    break;
                case 3:
                    number = ca.AcreToMeter(value);
                    break;
                case 4:
                    number = ca.HectareToMeter(value);
                    break;
            }

            switch (item2) {
                case 0:
                    number = ca.sqMeterToMilli(number);
                    break;
                case 1:
                    number = ca.sqMeterToCenti(number);
                    break;
                case 2:
                    number = ca.sqMeterToKilo(number);
                    break;
                case 3:
                    number = ca.sqMeterToAcre(number);
                    break;
                case 4:
                    number = ca.sqMeterToHectare(number);
                    break;
            }
            return number;
        }
    }
}