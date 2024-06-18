package com.example.fetch;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import retrofit2.Call;

public class RepositoryTest {

    @Mock
    private Repository.ApiService apiService;

    private Repository repository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        repository = new Repository();
    }

    @Test
    public void testFetchItemsSuccess() {
        List<Item> mockItems = Arrays.asList(
                new Item(1, 1, "Item 1"),
                new Item(2, 1, "Item 2"),
                new Item(3, 2, "Item 3")
        );

        MutableLiveData<List<Item>> data = new MutableLiveData<>(mockItems);

//        when(apiService.getItems()).thenReturn(Call<List<Item>> data);

        LiveData<List<Item>> result = repository.fetchItems();

        assertEquals(result.getValue().size(), 3);
    }
}
