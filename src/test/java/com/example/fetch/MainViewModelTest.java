package com.example.fetch;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MainViewModelTest {

    private MainViewModel viewModel;
    private Repository repository;

    @Before
    public void setUp() {
        repository = mock(Repository.class);
        viewModel = new MainViewModel();
    }

    @Test
    public void testGetItems() {
        List<Item> mockItems = Arrays.asList(
                new Item(1, 1, "Item 1"),
                new Item(2, 1, "Item 2"),
                new Item(3, 2, "Item 3")
        );

        MutableLiveData<List<Item>> liveData = new MutableLiveData<>(mockItems);
        when(repository.fetchItems()).thenReturn(liveData);

        LiveData<List<Item>> result = viewModel.getItems();

        assertEquals(result.getValue().size(), 3);
    }
}

