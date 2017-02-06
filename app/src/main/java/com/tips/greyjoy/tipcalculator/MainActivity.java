package com.tips.greyjoy.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.GenericArrayType;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner tipSpin = (Spinner) findViewById(R.id.tipSpin);
        Spinner personSpin = (Spinner) findViewById(R.id.personSpin);

        fillSpinner(tipSpin,R.array.tipSpinArray);
        fillSpinner(personSpin,R.array.peopleSpinArray);
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tipSpinArray,android.R.layout.simple_spinner_dropdown_item);
        //adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        //tipSpin.setAdapter(adapter);

    }

    public void fillSpinner(Spinner spinner, int name){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, name,android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
