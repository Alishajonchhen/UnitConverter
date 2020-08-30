package com.application.converter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class UnitLength extends AppCompatActivity {

    EditText editNumber4, editNumber5;
    Spinner s3, s4;
    int in4 = 0;
    public ConvertingMethod.Length ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_length);
        Toolbar toolbar5 = (Toolbar) findViewById(R.id.toolbar5);
        setSupportActionBar(toolbar5);

        editNumber4 = (EditText) findViewById(R.id.editTextNumber4);
        editNumber5 = (EditText) findViewById(R.id.editTextNumber5);
        s3 = (Spinner) findViewById(R.id.spinner3);
        s4 = (Spinner) findViewById(R.id.spinner4);

        ca = new ConvertingMethod.Length();
    }

    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.num0:
                editNumber4.setText(editNumber4.getText()+"0");
                break;

            case R.id.num1:
                editNumber4.setText(editNumber4.getText()+"1");
                break;

            case R.id.num2:
                editNumber4.setText(editNumber4.getText()+"2");
                break;

            case R.id.num3:
                editNumber4.setText(editNumber4.getText()+"3");
                break;

            case R.id.num4:
                editNumber4.setText(editNumber4.getText()+"4");
                break;

            case R.id.num5:
                editNumber4.setText(editNumber4.getText()+"5");
                break;

            case R.id.num6:
                editNumber4.setText(editNumber4.getText()+"6");
                break;

            case R.id.num7:
                editNumber4.setText(editNumber4.getText()+"7");
                break;

            case R.id.num8:
                editNumber4.setText(editNumber4.getText()+"8");
                break;

            case R.id.num9:
                editNumber4.setText(editNumber4.getText()+"9");
                break;

            case R.id.Fullstop:
                if (in4==0)
                {
                    editNumber4.setText(editNumber4.getText()+".");
                    in4++;
                }
                break;

            case R.id.Clear:
                editNumber4.setText("");
                editNumber5.setText("");
                in4=0;
                break;

            case R.id.equalto:
                int item1=s3.getSelectedItemPosition();
                int item2=s4.getSelectedItemPosition();
                double value1=Double.valueOf(editNumber4.getText().toString());
                double result=evaluate(item1,item2,value1);
                editNumber5.setText(result + "");
                break;
        }
    }

    public double evaluate(int item1,int item2,double value)
    {
        double l=0.0;
        if(item1==item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:
                    l=ca.NanoToMeter(value);
                    break;
                case 1:
                    l=ca.MilliToMeter(value);
                    break;
                case 2:
                    l=ca.CentiToMeter(value);
                    break;
                case 3:
                    l=ca.KiloToMeter(value);
                    break;
            }

            switch (item2)
            {
                case 0:
                    l=ca.MeterToNano(l);
                    break;
                case 1:
                    l=ca.MeterToMilli(l);
                    break;
                case 2:
                    l=ca.MeterToCenti(l);
                    break;
                case 3:
                    l=ca.MeterToKilo(l);
                    break;
            }
            return l;
        }
    }
}