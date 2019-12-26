package com.example.loanmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loanmanagement.Connector.RetrofitClientInstance;
import com.example.loanmanagement.Model.Installment;
import com.example.loanmanagement.Model.Loan;
import com.example.loanmanagement.Service.InstallmentService;
import com.example.loanmanagement.Service.LoanService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InstallmentPaymentActivity extends AppCompatActivity {

    EditText editTextsearchloanId;
    EditText editTextName;
    EditText editTextusername;
    EditText editTextemail;
    EditText editTextaddress;
    EditText editTextphone;
    EditText editTextcity;
    EditText editTextcategory;
    EditText editTextloanId;
    EditText editTextinstallmentAmount;
    EditText editTexttotalAmount;
    EditText editTexttransectionId;

    Button searchLoan;
    Button payInstallment;
    LoanService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_installment_payment);

        editTextsearchloanId = findViewById(R.id.searchloanId);
        editTextName = findViewById(R.id.fullName);
        editTextusername = findViewById(R.id.username);
        editTextemail = findViewById(R.id.category);
        editTextaddress = findViewById(R.id.address);
        editTextphone = findViewById(R.id.phone);
        editTextcity = findViewById(R.id.city);
        editTextcategory = findViewById(R.id.category);
        editTextloanId = findViewById(R.id.loanId);
        editTextinstallmentAmount = findViewById(R.id.installmentAmount);
        editTexttotalAmount = findViewById(R.id.totalAmount);
        editTexttransectionId = findViewById(R.id.transactionId);

        searchLoan = findViewById(R.id.loanSearch);
        payInstallment = findViewById(R.id.payInstallment);

        searchLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String serchId = editTextsearchloanId.getText().toString();


                if (!serchId.isEmpty()) {
                    Long id = Long.parseLong(serchId);
                    service = RetrofitClientInstance.getRetrofitInstance().create(LoanService.class);
                    Call<Loan> call = service.getLoaninfoById(id);

                    call.enqueue(new Callback<Loan>() {
                        @Override
                        public void onResponse(Call<Loan> call, Response<Loan> response) {
                            Loan loan = response.body();
                            String fname = loan.getFirstName();
                            String lname = loan.getLastName();
                            editTextName.setText(fname + " " + lname);
                            editTextusername.setText(loan.getUsername());
                            editTextemail.setText(loan.getEmail());
                            editTextaddress.setText(loan.getAddress());
                            editTextphone.setText(loan.getPhone());
                            editTextcategory.setText(loan.getCategory());
                            editTextloanId.setText(Long.toString(loan.getLoanId()));
                            editTextinstallmentAmount.setText(loan.getInstallmentAmount().toString());
                            editTexttotalAmount.setText(loan.getLoanAmount().toString());
                            double showtransectionId = (Math.random() * ((99999999 - 0) + 1)) + 0;
                            editTexttransectionId.setText(Double.toString(showtransectionId));

                        }

                        @Override
                        public void onFailure(Call<Loan> call, Throwable t) {

                            Toast.makeText(getApplicationContext(), "loan id isn't found. please insert Currect loan id.", Toast.LENGTH_SHORT).show();

                        }
                    });

                } else {
                    Toast.makeText(getApplicationContext(), "Please insert user Id", Toast.LENGTH_SHORT).show();
                }

            }
        });

        payInstallment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String username = editTextusername.getText().toString();
                String email = editTextemail.getText().toString();
                String address = editTextaddress.getText().toString();
                String phone = editTextphone.getText().toString();
                String category = editTextcategory.getText().toString();
                String loanId = editTextloanId.getText().toString();
                String installmentAmount = editTextinstallmentAmount.getText().toString();
                String totalPaybleAmount=editTexttotalAmount.getText().toString();
                String transectionId = editTexttransectionId.getText().toString();

                InstallmentService service = RetrofitClientInstance.getRetrofitInstance().create(InstallmentService.class);
                Installment installment = new Installment();
                installment.setName(name);
                installment.setUsername(username);
                installment.setEmail(email);
                installment.setAddress(address);
                installment.setCategory(category);
                installment.setLoanId(Long.parseLong(loanId));
                installment.setInstallmentAmount(Integer.parseInt(installmentAmount));
                installment.setLoanAmount(Integer.parseInt(totalPaybleAmount));

                Call<Installment> call = service.saveInstallment(installment);
                call.enqueue(new Callback<Installment>() {
                    @Override
                    public void onResponse(Call<Installment> call, Response<Installment> response) {

                        editTextsearchloanId.getText().clear();
                        editTextName.getText().clear();
                        editTextusername.getText().clear();
                        editTextemail.getText().clear();
                        editTextaddress.getText().clear();
                        editTextphone.getText().clear();
                        editTextcategory.getText().clear();
                        editTextloanId.getText().clear();
                        editTextinstallmentAmount.getText().clear();
                        editTexttotalAmount.getText().clear();
                        editTexttransectionId.getText().clear();
                        editTextcity.getText().clear();
                        Toast.makeText(getApplicationContext(), "Installment Successfully Paid.", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onFailure(Call<Installment> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Installment Pay Failed.", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
    }
}
