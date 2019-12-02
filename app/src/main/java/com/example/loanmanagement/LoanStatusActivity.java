package com.example.loanmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.loanmanagement.Connector.RetrofitClientInstance;
import com.example.loanmanagement.CustomeAdapter.UserLoanAdapter;
import com.example.loanmanagement.Model.Loan;
import com.example.loanmanagement.Service.LoanService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoanStatusActivity extends AppCompatActivity {
    List<Loan> loanList = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_status);
        listView = findViewById(R.id.lanList);

        LoanService service = RetrofitClientInstance.getRetrofitInstance().create(LoanService.class);
        Call<List<Loan>> call = service.getLoaninfoByUser("asif");
        call.enqueue(new Callback<List<Loan>>() {
            @Override
            public void onResponse(Call<List<Loan>> call, Response<List<Loan>> response) {
                loanList = response.body();
                Log.d("test", loanList.toString());


                UserLoanAdapter adapter = new UserLoanAdapter(LoanStatusActivity.this, loanList);
                listView.setAdapter(adapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent intent = new Intent(LoanStatusActivity.this, LoanDetailsActivity.class);

                        intent.putExtra("fname", loanList.get(position).getFirstName());
                        intent.putExtra("lname", loanList.get(position).getLastName());
                        intent.putExtra("email", loanList.get(position).getEmail());
                        intent.putExtra("phone", loanList.get(position).getPhone());
                        intent.putExtra("address", loanList.get(position).getAddress());
                        intent.putExtra("username", loanList.get(position).getUsername());
                        intent.putExtra("loanId", String.valueOf(loanList.get(position).getLoanId()));
                        intent.putExtra("loanAmount", String.valueOf(loanList.get(position).getLoanAmount()));
                        intent.putExtra("category", loanList.get(position).getCategory());
                        intent.putExtra("installmentType", loanList.get(position).getInstallmentType());
                        intent.putExtra("installmentAmount", String.valueOf(loanList.get(position).getInstallmentAmount()));
                        intent.putExtra("totalInstallment", String.valueOf(loanList.get(position).getTotalInstallment()));
                        intent.putExtra("totalPayableAmount", String.valueOf(loanList.get(position).getTotalPayableAmount()));
                        intent.putExtra("status",String.valueOf(loanList.get(position).getStatus()));
                        startActivity(intent);

                    }
                });

            }

            @Override
            public void onFailure(Call<List<Loan>> call, Throwable t) {

            }
        });
    }
}
