package com.example.retrofit.persistence;

public interface Storage {
     void saveToken(String token);
     String getToken();
}
