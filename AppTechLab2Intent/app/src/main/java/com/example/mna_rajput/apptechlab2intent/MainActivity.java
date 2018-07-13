package com.example.mna_rajput.apptechlab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button LoginBtn,RegisterBtn,SignUpBtn,RestPasswordBtn,DelAccBtn,GoogleMapBtn,StdFormBtn,EmpFormBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginBtn = (Button)findViewById(R.id.LoginBtn);
        RegisterBtn = (Button)findViewById(R.id.Register);
        SignUpBtn = (Button)findViewById(R.id.SignUpBtn);
        RestPasswordBtn = (Button)findViewById(R.id.RestPassword);
        DelAccBtn = (Button)findViewById(R.id.DeleteAccount);
        GoogleMapBtn = (Button)findViewById(R.id.GoogleMap);
        StdFormBtn = (Button)findViewById(R.id.StudentForm);
        EmpFormBtn = (Button)findViewById(R.id.EmployeeForm);


        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(Login);

            }
        });
        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Register = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(Register);

            }
        });
        SignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SignUp = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(SignUp);
            }
        });
        RestPasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RestPass = new Intent(MainActivity.this,RestPasswordActivity.class);
                startActivity(RestPass);
            }
        });
        DelAccBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DelAccount = new Intent(MainActivity.this, DeleteAccountActivity.class);
                startActivity(DelAccount);
            }
        });
        GoogleMapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoogleMap = new Intent(MainActivity.this,GoogleMapActivity.class);
                startActivity(GoogleMap);

            }
        });
        StdFormBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent StdForm = new Intent(MainActivity.this,StudentFormActivity.class);
                startActivity(StdForm);
            }
        });
        EmpFormBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent EmpForm = new Intent(MainActivity.this,EmployeeFormActivity.class);
                startActivity(EmpForm);
            }
        });
       
    }
}
