package com.example.loanmanagement.Service;

import com.example.loanmanagement.Model.Contact;
import com.example.loanmanagement.Model.Installment;
import com.example.loanmanagement.Model.Loan;
import com.example.loanmanagement.Model.UserInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface InstallmentService {

    @POST("/save-installment-payment")
    Call<Installment> saveInstallment(@Body Installment installment);


    @GET("/show-installment-by/{id}")
    Call<List<Installment>> getInstallmentById(@Path("id") long id);

}
