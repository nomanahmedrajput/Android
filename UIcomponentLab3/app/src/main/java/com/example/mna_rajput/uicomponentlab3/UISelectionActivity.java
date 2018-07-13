package com.example.mna_rajput.uicomponentlab3;

import android.content.Intent;
import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UISelectionActivity extends AppCompatActivity {

    Button togglebtn, alertbuilder,checkboxbtn,radiobtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uiselection);

        togglebtn = (Button)findViewById(R.id.togglebtn);
        alertbuilder = (Button)findViewById(R.id.alertbuilder);
        checkboxbtn = (Button)findViewById(R.id.checkboxbtn);
        radiobtn = (Button)findViewById(R.id.radiobtn);

        togglebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toggle = new Intent(UISelectionActivity.this, MainActivity.class);
                startActivity(toggle);

            }
        });

        alertbuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alert = new Intent(UISelectionActivity.this, AlertBuilderActivity.class);
                startActivity(alert);

            }
        });
        checkboxbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent checkbox = new Intent(UISelectionActivity.this, CheckboxActivity.class);
                startActivity(checkbox);

            }
        });
        radiobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent radio = new Intent(UISelectionActivity.this, RadiobtnActivity.class);
                startActivity(radio);

            }
        });

    }
            }
