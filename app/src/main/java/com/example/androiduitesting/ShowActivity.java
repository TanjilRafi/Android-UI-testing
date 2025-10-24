package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY_NAME = "extra_city_name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameTv = findViewById(R.id.text_city_name);
        Button backBtn = findViewById(R.id.button_back);


        Intent i = getIntent();
        String cityName = i != null ? i.getStringExtra(EXTRA_CITY_NAME) : null;
        if (cityName == null) cityName = "";
        cityNameTv.setText(cityName);


        backBtn.setOnClickListener(v -> finish());
    }
}
