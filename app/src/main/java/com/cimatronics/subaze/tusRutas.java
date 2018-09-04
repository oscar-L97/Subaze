package com.cimatronics.subaze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class tusRutas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tus_rutas);

        Spinner dropdown = findViewById(R.id.dropdown);
        String[]  items = new String[]{"Fecha","Nombre de destino", "Distancia"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this , android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

    }

}
