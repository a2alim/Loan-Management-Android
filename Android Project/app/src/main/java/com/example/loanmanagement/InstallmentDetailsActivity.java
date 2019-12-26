package com.example.loanmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InstallmentDetailsActivity extends AppCompatActivity {

    TextView tvname;
    TextView tvusername;
    TextView tvemail;
    TextView tvaddress;
    TextView tvloanId;
    TextView tvcategory;
    TextView tvloanAmount;
    TextView tvinstallmentAmount;
    TextView tvtotalPaid;
    TextView tvtotalPayable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_installment_details);

        tvname=findViewById(R.id.name);
        tvusername=findViewById(R.id.username);
        tvemail=findViewById(R.id.email);
        tvaddress=findViewById(R.id.address);
        tvloanId=findViewById(R.id.loanId);
        tvcategory=findViewById(R.id.category);
        tvloanAmount=findViewById(R.id.loanAmount);
        tvinstallmentAmount=findViewById(R.id.installmentAmount);
        tvtotalPaid=findViewById(R.id.totalPaid);
        tvtotalPayable=findViewById(R.id.payableAmount);

        Intent intent =getIntent();
        tvname.setText(intent.getStringExtra("name"));
        tvusername.setText(intent.getStringExtra("username"));
        tvemail.setText(intent.getStringExtra("email"));
        tvaddress.setText(intent.getStringExtra("address"));
        tvloanId.setText(intent.getStringExtra("loanid"));
        tvcategory.setText(intent.getStringExtra("category"));
        tvloanAmount.setText(intent.getStringExtra("loanAmount"));
        tvinstallmentAmount.setText(intent.getStringExtra("installmentAmount"));
        tvtotalPaid.setText(intent.getStringExtra("totalpaid"));
        tvtotalPayable.setText(intent.getStringExtra("totalpayable"));

    }
}
