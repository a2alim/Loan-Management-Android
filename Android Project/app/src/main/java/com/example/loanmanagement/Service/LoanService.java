package com.example.loanmanagement.Service;

import com.example.loanmanagement.Model.Contact;
import com.example.loanmanagement.Model.Loan;
import com.example.loanmanagement.Model.UserInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface LoanService {

    @POST("/save-loaninfo")
    Call<Loan> saveLoan(@Body Loan loan);

    @GET("/show-loaninfo-by/{id}")
    Call<Loan> getLoaninfoById(@Path("id") long id);

    @GET("/show-loan-by-user/{user}")
    Call<List<Loan>> getLoaninfoByUser(@Path("user") String user);



}
