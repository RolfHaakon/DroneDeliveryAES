package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;

import com.example.rolf.dronedeliveryaes.R;
import com.example.rolf.dronedeliveryaes.sql.DatabaseHelper;

public class Account extends AppCompatActivity {

    private Button Category;
    private Button Track;
    private Button Home;
    private AppCompatTextView nameProfile;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        initViews();
        initObjects();


        Category = (Button) findViewById(R.id.category);
        Track = (Button) findViewById(R.id.track);
        Home = (Button)  findViewById(R.id.home);


        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCategory = new Intent(Account.this, Category.class);
                startActivity(goToCategory);
            }
        });
        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Account.this, Track.class);
                startActivity(goToHomePage);
            }
        });
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Account.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });
    }
    protected void initViews() {
        nameProfile = (AppCompatTextView) findViewById(R.id.nameProfile);
    }

    private void initObjects() {

        String emailFromIntent = getIntent().getStringExtra("EMAIL");
        nameProfile.setText(emailFromIntent);

    }
}
