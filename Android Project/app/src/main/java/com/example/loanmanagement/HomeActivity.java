package com.example.loanmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {



    Button applyLoan;
    Button loanStatus;
    Button payInstallment;
    Button installmentStatus;
    Button sentEmail;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        applyLoan = findViewById(R.id.applyLoan);
        applyLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ApplyLoanActivity.class);
                startActivity(intent);
            }
        });

        loanStatus = findViewById(R.id.loanStatus);
        loanStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LoanStatusActivity.class);
                startActivity(intent);
            }
        });

        payInstallment = findViewById(R.id.payInstallment);
        payInstallment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, InstallmentPaymentActivity.class);
                startActivity(intent);
            }
        });


        installmentStatus = findViewById(R.id.installmentStatus);
        installmentStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, InstallmentStatusActivity.class);
                startActivity(intent);
            }
        });

        sentEmail = findViewById(R.id.sentEmail);
        sentEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ContactUsActivity.class);
                startActivity(intent);
            }
        });

        logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivityActivity.class);
                startActivity(intent);
            }
        });

    }

}
