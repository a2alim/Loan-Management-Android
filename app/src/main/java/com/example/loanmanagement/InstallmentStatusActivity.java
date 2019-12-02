package com.example.loanmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.loanmanagement.Connector.RetrofitClientInstance;
import com.example.loanmanagement.CustomeAdapter.InstallmentAdapter;
import com.example.loanmanagement.CustomeAdapter.UserLoanAdapter;
import com.example.loanmanagement.Model.Installment;
import com.example.loanmanagement.Model.Loan;
import com.example.loanmanagement.Service.InstallmentService;
import com.example.loanmanagement.Service.LoanService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InstallmentStatusActivity extends AppCompatActivity {

    EditText etloanId;
    Button searchButton;
    List<Installment> insList = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_installment_status);

        etloanId = findViewById(R.id.searchId);
        searchButton = findViewById(R.id.searchbutton);
        listView = findViewById(R.id.instList);

        searchButton.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                String loanid = etloanId.getText().toString();
                Long id = Long.parseLong(loanid);

                InstallmentService service = RetrofitClientInstance.getRetrofitInstance().create(InstallmentService.class);
                Call<List<Installment>> call = service.getInstallmentById(id);
                call.enqueue(new Callback<List<Installment>>() {
                    @Override
                    public void onResponse(Call<List<Installment>> call, Response<List<Installment>> response) {
                         insList= response.body();

                        InstallmentAdapter adapter = new InstallmentAdapter(InstallmentStatusActivity.this, insList);
                        listView.setAdapter(adapter);

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent intent = new Intent(InstallmentStatusActivity.this, InstallmentDetailsActivity.class);

                                intent.putExtra("name", insList.get(position).getName());
                                intent.putExtra("username", insList.get(position).getUsername());
                                intent.putExtra("email", insList.get(position).getEmail());
                                intent.putExtra("address", insList.get(position).getAddress());
                                intent.putExtra("loanid", String.valueOf(insList.get(position).getLoanId()));
                                intent.putExtra("category", insList.get(position).getCategory());
                                intent.putExtra("loanAmount", String.valueOf(insList.get(position).getLoanAmount()));
                                intent.putExtra("installmentAmount", String.valueOf(insList.get(position).getInstallmentAmount()));
                                intent.putExtra("totalpaid", String.valueOf(insList.get(position).getTotalPaid()));
                                intent.putExtra("totalpayable", String.valueOf(insList.get(position).getTotalPayable()));
                                startActivity(intent);

                            }
                        });
                        Log.d("test2", insList.toString());
                    }

                    @Override
                    public void onFailure(Call<List<Installment>> call, Throwable t) {

                    }
                });

            }
        });


    }
}
