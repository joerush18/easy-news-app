package com.example.easy_news;

import com.example.easy_news.Models.Articles;

import java.util.List;

public interface OnFetchDataListener<ApiResponse> {
    void onFetchData(List<Articles> list , String message);
    void onError(String message);
}
