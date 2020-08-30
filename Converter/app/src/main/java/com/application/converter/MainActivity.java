package com.application.converter;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.StandCalbtn) {
            i = new Intent(this, Standard_Cal.class);
            startActivity(i);
        } else if (view.getId() == R.id.UnitConvbtn) {
            i = new Intent(this, UnitConverter.class);
            startActivity(i);
        } else if (view.getId() == R.id.CurrenConvbtn) {
        i = new Intent(this, CurrencyConverter.class);
        startActivity(i);
        }
    }
}
//I have use Nexus S API 29 emulator.