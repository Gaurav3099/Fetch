package com.example.fetch;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MainViewModel extends ViewModel {

    private Repository repository;
    private LiveData<List<Item>> items;

    public MainViewModel() {
        repository = new Repository();
        items = repository.fetchItems();
    }

    public LiveData<List<Item>> getItems() {
        return items;
    }
}

