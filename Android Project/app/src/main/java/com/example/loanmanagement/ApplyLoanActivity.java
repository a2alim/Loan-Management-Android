package com.example.loanmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteCursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.loanmanagement.Connector.RetrofitClientInstance;
import com.example.loanmanagement.Model.Loan;
import com.example.loanmanagement.Model.UserInfo;
import com.example.loanmanagement.Service.LoanService;
import com.example.loanmanagement.Service.UserService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ApplyLoanActivity extends AppCompatActivity {

    EditText editTextsearchId;
    EditText editTextfirstName;
    EditText editTextlastName;
    EditText editTextemail;
    EditText editTextphone;
    EditText editTextloanAmount;
    EditText editTextaddress;
    EditText editTextusername;
    EditText editTextpassword;
    String[] categoryName, installType;
    private Spinner spinner, spinner1;

    Button search;
    Button loanSubmit;

    UserService service;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply__loan);

        categoryName = getResources().getStringArray(R.array.category_name);
        installType = getResources().getStringArray(R.array.install_type);
        spinner = findViewById(R.id.spinerId);
        spinner1 = findViewById(R.id.spinerId1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.samplecategory, R.id.sampleCategoryId, categoryName);
        spinner.setAdapter(adapter);


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.sampleloantype, R.id.loanTypeId, installType);
        spinner1.setAdapter(adapter1);

        editTextsearchId = findViewById(R.id.searchId);
        editTextfirstName = findViewById(R.id.firstName);
        editTextlastName = findViewById(R.id.lastName);
        editTextemail = findViewById(R.id.category);
        editTextphone = findViewById(R.id.phone);
        editTextloanAmount = findViewById(R.id.loanAmount);
        editTextaddress = findViewById(R.id.address);
        editTextusername = findViewById(R.id.username);
        editTextpassword = findViewById(R.id.password);
        search = findViewById(R.id.serchbutton);
        loanSubmit = findViewById(R.id.loanSubmit);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String serchId = editTextsearchId.getText().toString();


                if (!serchId.isEmpty()) {
                    Long id = Long.parseLong(serchId);
                    service = RetrofitClientInstance.getRetrofitInstance().create(UserService.class);
                    Call<UserInfo> call = service.getUserById(id);

                    call.enqueue(new Callback<UserInfo>() {

                        @Override
                        public void onResponse(Call<UserInfo> call, Response<UserInfo> response) {
                            UserInfo userInfo = response.body();

                            editTextfirstName.setText(userInfo.getFirstName());
                            editTextlastName.setText(userInfo.getLastName());
                            editTextemail.setText(userInfo.getEmail());
                            editTextphone.setText(userInfo.getPhone());
                            editTextaddress.setText(userInfo.getAddress());
                            editTextusername.setText(userInfo.getUsername());
                            editTextpassword.setText(userInfo.getPassword());


                        }

                        @Override
                        public void onFailure(Call<UserInfo> call, Throwable t) {
                            Toast.makeText(getApplicationContext(), "value add failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

                } else {
                    Toast.makeText(getApplicationContext(), "Please insert user Id", Toast.LENGTH_SHORT).show();
                }

            }
        });


        loanSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = editTextfirstName.getText().toString();
                String lastName = editTextlastName.getText().toString();
                String email = editTextemail.getText().toString();
                String phone = editTextphone.getText().toString();
                String address = editTextaddress.getText().toString();
                String username = editTextusername.getText().toString();
                String password = editTextpassword.getText().toString();
                String loanAmount = editTextloanAmount.getText().toString();


                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                      @Override
                      public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                          SQLiteCursor item = (SQLiteCursor) parent.getItemAtPosition(position);
                          String value = String.valueOf(item.getString(0));

                      }

                      @Override
                      public void onNothingSelected(AdapterView<?> parent) {

                      }
                });

                spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        SQLiteCursor item = (SQLiteCursor) parent.getItemAtPosition(position);
                        String value = String.valueOf(item.getString(0));

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                String loanCatagory= spinner.getSelectedItem().toString();
                String installmentType = spinner1.getSelectedItem().toString();


                LoanService service = RetrofitClientInstance.getRetrofitInstance().create(LoanService.class);
                Loan loan = new Loan();
                loan.setFirstName(firstName);
                loan.setLastName(lastName);
                loan.setEmail(email);
                loan.setPhone(phone);
                loan.setAddress(address);
                loan.setUsername(username);
                loan.setPassword(password);
                loan.setLoanAmount(Integer.parseInt(loanAmount));
                loan.setCategory(loanCatagory);
                loan.setInstallmentType(installmentType);

                System.out.println(loan);
                Call<Loan> call = service.saveLoan(loan);

                call.enqueue(new Callback<Loan>() {
                    @Override
                    public void onResponse(Call<Loan> call, Response<Loan> response) {
                        Loan loan = new Loan();
                        loan=response.body();
                        editTextfirstName.getText().clear();
                        editTextlastName.getText().clear();
                        editTextemail.getText().clear();
                        editTextphone.getText().clear();
                        editTextaddress.getText().clear();
                        editTextusername.getText().clear();
                        editTextpassword.getText().clear();
                        editTextloanAmount.getText().clear();
                        editTextsearchId.getText().clear();
                        Toast.makeText(getApplicationContext(),"Successfully applied for loan.",Toast.LENGTH_SHORT).show();
                }

                    @Override
                    public void onFailure(Call<Loan> call, Throwable t) {
                        Toast.makeText(getApplicationContext(),"Loan apply failed.",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


    }
}
