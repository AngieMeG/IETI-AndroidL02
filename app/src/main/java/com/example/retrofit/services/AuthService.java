package com.example.retrofit.services;

import com.example.retrofit.data.Task;
import com.example.retrofit.dtos.TaskDto;
import com.example.retrofit.dtos.TokenDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthService {

    @POST
    Call<List<TokenDto>> login(@Body TokenDto tokenDto);
}
