package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.rolf.dronedeliveryaes.R;

public class Track extends AppCompatActivity {

    private Button Category;
    private Button Account;
    private Button Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);


        Category = (Button) findViewById(R.id.category);
        Account = (Button) findViewById(R.id.account);
        Home = (Button)  findViewById(R.id.home);

        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCategory = new Intent(Track.this, Category.class);
                startActivity(goToCategory);
            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Track.this, Account.class);
                startActivity(goToHomePage);
            }
        });
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Track.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });

    }

}