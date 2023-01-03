package com.example.easy_news.Models;

import java.io.Serializable;
import java.util.List;

public class ApiResponse implements Serializable {
    String status = "";
    Integer totalResults;
    List<Articles> articles ;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }
}
