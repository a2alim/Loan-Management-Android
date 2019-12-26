package com.example.loanmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loanmanagement.Connector.RetrofitClientInstance;
import com.example.loanmanagement.Model.Contact;

import com.example.loanmanagement.Service.ContactService;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContactUsActivity extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText email;
    EditText message;
    Button submitb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        firstName = findViewById(R.id.firstname);
        lastName = findViewById(R.id.lastname);
        email = findViewById(R.id.category);
        message = findViewById(R.id.loanAmount);
        submitb = findViewById(R.id.submit);

        submitb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = firstName.getText().toString();
                String lastname = lastName.getText().toString();
                String mail = email.getText().toString();
                String msg = message.getText().toString();


                ContactService contactService = RetrofitClientInstance.getRetrofitInstance().create(ContactService.class);
                Contact contact = new Contact();

                contact.setFirstName(firstname);
                contact.setLastName(lastname);
                contact.setEmail(mail);
                contact.setMessage(msg);

                System.out.println(contact);

                Call<Contact> call = contactService.userSendEmail(contact);

                if (!contact.equals(null)){
                    call.enqueue(new Callback <Contact>() {

                        @Override
                        public void onResponse(Call<Contact> call, Response<Contact> response) {
                            Contact contact = new Contact();
                            contact=response.body();

                            Toast.makeText(getApplicationContext(),"Email Send successful.", Toast.LENGTH_SHORT).show();
                            firstName.getText().clear();
                            lastName.getText().clear();
                            email.getText().clear();
                            message.getText().clear();

                        }

                        @Override
                        public void onFailure(Call<Contact> call, Throwable t) {
                            Toast.makeText(getApplicationContext(),"Failed to send Email.",Toast.LENGTH_SHORT).show();
                        }
                    });

                }else {
                    Toast.makeText(getApplicationContext(),"Please fill the all field to send Message",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
