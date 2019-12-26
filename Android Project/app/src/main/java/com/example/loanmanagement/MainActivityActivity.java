package com.example.loanmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivityActivity extends AppCompatActivity {

    TextView username;
    TextView password;
    Button login;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        signup= findViewById(R.id.signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String pass = password.getText().toString();
                if (user.contentEquals("loan") && pass.contentEquals("loan")){
                    Intent intent = new Intent(MainActivityActivity.this, HomeActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(  MainActivityActivity.this, "Username or Password Don't Match.", Toast.LENGTH_LONG).show();
                }

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }


}
