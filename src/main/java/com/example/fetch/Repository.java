package com.example.fetch;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class Repository {

    private static final String BASE_URL = "https://fetch-hiring.s3.amazonaws.com/";

    private ApiService apiService;

    public Repository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    public LiveData<List<Item>> fetchItems() {
        MutableLiveData<List<Item>> data = new MutableLiveData<>();
        apiService.getItems().enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<Item> items = response.body();
                    // Filter out items with null or empty names
                    items.removeIf(item -> item.getName() == null || item.getName().isEmpty());
                    // Sort items by listId and name
                    Collections.sort(items, (i1, i2) -> {
                        int compareListId = Integer.compare(i1.getListId(), i2.getListId());
                        if (compareListId != 0) return compareListId;
                        return i1.getName().compareTo(i2.getName());
                    });
                    data.setValue(items);
                } else {
                    data.setValue(new ArrayList<>());
                }
            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {
                data.setValue(new ArrayList<>());
            }
        });
        return data;
    }

    interface ApiService {
        @GET("hiring.json")
        Call<List<Item>> getItems();
    }
}
