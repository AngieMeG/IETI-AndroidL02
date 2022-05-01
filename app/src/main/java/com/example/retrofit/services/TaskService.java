package com.example.retrofit.services;

import com.example.retrofit.data.Task;
import com.example.retrofit.dtos.TaskDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface TaskService {
    @GET("/v1/task")
    Call<List<Task>> getAll();

    @GET("/v1/task/{id}")
    Call<Task> findById(@Path("id") String id);

    @POST("/v1/task")
    Call<List<Task>> create(@Body TaskDto taskDto);

    @PUT("/v1/task/{id}")
    Call<Task> updateTask(@Path("id") String id, @Body Task task);

    @DELETE("/v1/task/{id}")
    Call<Task> deleteTask(@Path("id") String id);
}
