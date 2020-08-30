package com.application.converter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class UnitWeight extends AppCompatActivity {

    EditText editNumber6, editNumber7;
    Spinner s5, s6;
    int in5 = 0;
    public ConvertingMethod.Weight ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_weight);
        Toolbar toolbar6 = (Toolbar) findViewById(R.id.toolbar6);
        setSupportActionBar(toolbar6);

        editNumber6 = (EditText) findViewById(R.id.editTextNumber6);
        editNumber7 = (EditText) findViewById(R.id.editTextNumber7);
        s5 = (Spinner) findViewById(R.id.spinner5);
        s6 = (Spinner) findViewById(R.id.spinner6);

        ca = new ConvertingMethod.Weight();
    }

    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.num0:
                editNumber6.setText(editNumber6.getText()+"0");
                break;

            case R.id.num1:
                editNumber6.setText(editNumber6.getText()+"1");
                break;

            case R.id.num2:
                editNumber6.setText(editNumber6.getText()+"2");
                break;

            case R.id.num3:
                editNumber6.setText(editNumber6.getText()+"3");
                break;

            case R.id.num4:
                editNumber6.setText(editNumber6.getText()+"4");
                break;

            case R.id.num5:
                editNumber6.setText(editNumber6.getText()+"5");
                break;

            case R.id.num6:
                editNumber6.setText(editNumber6.getText()+"6");
                break;

            case R.id.num7:
                editNumber6.setText(editNumber6.getText()+"7");
                break;

            case R.id.num8:
                editNumber6.setText(editNumber6.getText()+"8");
                break;

            case R.id.num9:
                editNumber6.setText(editNumber6.getText()+"9");
                break;

            case R.id.Fullstop:
                if (in5==0)
                {
                    editNumber6.setText(editNumber6.getText()+".");
                    in5++;
                }
                break;

            case R.id.Clear:
                editNumber6.setText("");
                editNumber7.setText("");
                in5=0;
                break;

            case R.id.equalto:
                int item1=s5.getSelectedItemPosition();
                int item2=s6.getSelectedItemPosition();
                double value1=Double.parseDouble(editNumber6.getText().toString());
                double result=evaluate(item1,item2,value1);
                editNumber7.setText(result+"");
                break;
        }
    }

    public double evaluate(int item1,int item2,double value)
    {
        double weight=0.0;
        if(item1==item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:
                    weight=ca.GramToKilo(value);
                    break;
                case 1:
                    weight=ca.PoundsToKilo(value);
                    break;
                case 2:
                    weight=ca.OuncesToKilo(value);
                    break;
            }

            switch (item2)
            {
                case 0:
                    weight=ca.KiloToGram(weight);
                    break;
                case 1:
                    weight=ca.KiloToPounds(weight);
                    break;
                case 2:
                    weight=ca.KiloToOunces(weight);
                    break;
            }
            return weight;
        }
    }
}