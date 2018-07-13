package com.example.mna_rajput.uicomponentlab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class UIinterfaceActivity extends AppCompatActivity {

    Button SignInBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uiinterface);

        SignInBtn = (Button)findViewById(R.id.SignInBtn);

        SignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SignIn = new Intent(UIinterfaceActivity.this, UISelectionActivity.class);
                startActivity(SignIn);

            }
        });






    }

}
