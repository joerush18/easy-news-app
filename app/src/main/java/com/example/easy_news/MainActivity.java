package com.example.easy_news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.easy_news.Models.ApiResponse;
import com.example.easy_news.Models.Articles;

import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestManager manager = new RequestManager(this);
        manager.getNewsHeadlines(listener, "general", null);
    }


    private final OnFetchDataListener<ApiResponse> listener = new OnFetchDataListener<ApiResponse>() {
        @Override
        public void onFetchData(List<Articles> list, String message) {
          showNews(list);
        }

        @Override
        public void onError(String message) {

        }
    };

    private void showNews(List<Articles> list) {
        recyclerView = findViewById(R.id.recycler_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        adapter = new CustomAdapter(this, list );
        recyclerView.setAdapter(adapter);
    }
}

//47