package com.example.retrofit.persistence.impl;

import android.content.SharedPreferences;

import com.example.retrofit.persistence.Storage;

public class IStorage implements Storage {

    private String TOKEN = "";
    private SharedPreferences sharedPreferences;

    @Override
    public void saveToken(String token) {
        sharedPreferences.edit().putString(TOKEN, token).apply();
    }

    @Override
    public String getToken() {
        return sharedPreferences.getString(TOKEN, "");
    }
}
