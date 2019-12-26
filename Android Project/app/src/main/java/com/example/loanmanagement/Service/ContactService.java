package com.example.loanmanagement.Service;

import com.example.loanmanagement.Model.Contact;
import com.example.loanmanagement.Model.UserInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface ContactService {

    @POST("/user-send-email")
    Call<Contact> userSendEmail(@Body Contact contact);

    @GET("/show-user-email")
    Call<List<Contact>> getAllContact();

}
