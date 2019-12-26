package com.example.loanmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoanDetailsActivity extends AppCompatActivity {

    TextView tvname;
    TextView tvemail;
    TextView tvphone;
    TextView tvaddress;
    TextView tvusername;
    TextView tvloanId;
    TextView tvloanAmount;
    TextView tvcategory;
    TextView tvinstallmentType;
    TextView tvinstallmentAmount;
    TextView tvtotalInstallment;
    TextView tvtotalPayableAmount;
    TextView tvstatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_details);

        tvname=findViewById(R.id.name);
        tvemail=findViewById(R.id.emial);
        tvphone=findViewById(R.id.phone);
        tvaddress=findViewById(R.id.address);
        tvusername=findViewById(R.id.username);
        tvloanId=findViewById(R.id.loanId);
        tvloanAmount=findViewById(R.id.loanAmount);
        tvcategory=findViewById(R.id.category);
        tvinstallmentType=findViewById(R.id.installmentType);
        tvinstallmentAmount=findViewById(R.id.installmentAmount);
        tvtotalInstallment=findViewById(R.id.totalInstallment);
        tvtotalPayableAmount=findViewById(R.id.totalPayableAmount);
        tvstatus=findViewById(R.id.status);

        Intent intent =getIntent();
        String fname = intent.getStringExtra("fname");
        String lname = intent.getStringExtra("lname");
        tvname.setText(fname+" "+lname);
        tvemail.setText(intent.getStringExtra("email"));
        tvphone.setText(intent.getStringExtra("phone"));
        tvaddress.setText(intent.getStringExtra("address"));
        tvusername.setText(intent.getStringExtra("username"));
        tvloanId.setText(intent.getStringExtra("loanId"));
        tvloanAmount.setText(intent.getStringExtra("loanAmount"));
        tvcategory.setText(intent.getStringExtra("category"));
        tvinstallmentType.setText(intent.getStringExtra("installmentType"));
        tvinstallmentAmount.setText(intent.getStringExtra("installmentAmount"));
        tvtotalInstallment.setText(intent.getStringExtra("totalInstallment"));
        tvtotalPayableAmount.setText(intent.getStringExtra("totalPayableAmount"));
        tvstatus.setText(intent.getStringExtra("status"));

    }
}
