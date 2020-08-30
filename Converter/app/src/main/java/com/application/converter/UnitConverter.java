package com.application.converter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class UnitConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);
        Toolbar toolbar3 = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar3);
    }

    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.Areabtn) {
            i = new Intent(this, UnitArea.class);
            startActivity(i);
        }
        else if (view.getId()==R.id.Lengthbtn){
            i = new Intent(this, UnitLength.class);
            startActivity(i);
        }
        else if (view.getId()==R.id.Weightbtn){
            i = new Intent(this, UnitWeight.class);
            startActivity(i);
         }
}
}