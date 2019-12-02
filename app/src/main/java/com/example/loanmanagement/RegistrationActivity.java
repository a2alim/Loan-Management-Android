package com.example.loanmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.loanmanagement.Connector.RetrofitClientInstance;
import com.example.loanmanagement.Model.UserInfo;
import com.example.loanmanagement.Service.UserService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistrationActivity extends AppCompatActivity {

    String[] urole;
    private Spinner spinner;


    EditText editTextfirstName;
    EditText editTextlastName;
    EditText editTextemail;
    EditText editTextphone;
    EditText editTextaddress;
    EditText editTextusername;
    EditText editTextpassword;
    Button registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        urole = getResources().getStringArray(R.array.urole);
        spinner = findViewById(R.id.spinerId);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.samplecategory,R.id.sampleCategoryId,urole);
        spinner.setAdapter(adapter);


        editTextfirstName = findViewById(R.id.firstName);
        editTextlastName=findViewById(R.id.lastName);
        editTextemail=findViewById(R.id.category);
        editTextphone=findViewById(R.id.phone);
        editTextaddress=findViewById(R.id.address);
        editTextusername=findViewById(R.id.username);
        editTextpassword=findViewById(R.id.password);
        registration=findViewById(R.id.registration);

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName =editTextfirstName.getText().toString();
                String lastName = editTextlastName.getText().toString();
                String email = editTextemail.getText().toString();
                String phone = editTextphone.getText().toString();
                String address = editTextaddress.getText().toString();
                String role = adapter.getItem(0).toString();
                String username = editTextusername.getText().toString();
                String password = editTextpassword.getText().toString();

                UserService service = RetrofitClientInstance.getRetrofitInstance().create(UserService.class);
                UserInfo userInfo = new UserInfo();
                userInfo.setFirstName(firstName);
                userInfo.setLastName(lastName);
                userInfo.setEmail(email);
                userInfo.setPhone(phone);
                userInfo.setAddress(address);
                userInfo.setRole(role);
                userInfo.setUsername(username);
                userInfo.setPassword(password);
                Call<UserInfo> call = service.saveUser(userInfo);

                if (!userInfo.equals(null)){
                    call.enqueue(new Callback<UserInfo>() {
                        @Override
                        public void onResponse(Call<UserInfo> call, Response<UserInfo> response) {
                            UserInfo userInfo = new UserInfo();
                            userInfo=response.body();
                            Toast.makeText(getApplicationContext(),"user Save successfully", Toast.LENGTH_SHORT).show();
                            editTextfirstName.getText().clear();
                            editTextlastName.getText().clear();
                            editTextemail.getText().clear();
                            editTextphone.getText().clear();
                            editTextaddress.getText().clear();
                            editTextusername.getText().clear();
                            editTextpassword.getText().clear();
                        }

                        @Override
                        public void onFailure(Call<UserInfo> call, Throwable t) {
                            Toast.makeText(getApplicationContext(),"User save fail.",Toast.LENGTH_SHORT).show();
                        }
                    });
                }else {
                    Toast.makeText(getApplicationContext(),"Please fillout the fild..",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
