package com.example.easy_news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.easy_news.Models.Articles;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    Articles articles;
    TextView txt_title, txt_author, txt_time, txt_detail, txt_content;
    Button btn_url;
    ImageView img_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        articles = (Articles) getIntent().getSerializableExtra("data");

        txt_title = findViewById(R.id.text_details_title);
        txt_author = findViewById(R.id.text_details_author);
        txt_time = findViewById(R.id.text_details_time);
        txt_content = findViewById(R.id.text_details_content);
        txt_detail = findViewById(R.id.text_details_detail);
        img_news = findViewById(R.id.img_details_news);
        btn_url = findViewById(R.id.btn_details_readMore);


        btn_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(articles.getUrl())));
            }
        });

        txt_title.setText(articles.getTitle());
        txt_author.setText(articles.getAuthor());
        txt_time.setText(articles.getPublishedAt());
        txt_detail.setText(articles.getDescription());
        txt_content.setText(articles.getContent());

        Picasso.get().load(articles.getUrlToImage()).into(img_news);


        Log.d("data", (articles.getUrl()));

    }

}