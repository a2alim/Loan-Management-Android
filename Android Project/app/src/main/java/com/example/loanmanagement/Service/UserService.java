package com.example.loanmanagement.Service;

import com.example.loanmanagement.Model.Contact;
import com.example.loanmanagement.Model.UserInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface UserService {


    @GET("/show-user-by/{id}")
    Call<UserInfo> getUserById(@Path("id") long id);

    @POST("/register")
    Call<UserInfo> saveUser(@Body UserInfo userInfo);

    @GET("/show-user-email")
    Call<List<Contact>> getAllContact();



}
