package com.example.rolf.dronedeliveryaes.fruitvegitems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rolf.dronedeliveryaes.R;
import com.example.rolf.dronedeliveryaes.activities.Account;
import com.example.rolf.dronedeliveryaes.activities.HomePage;

public class BananaItem extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private  Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana_item);

        Home = (Button) findViewById(R.id.home);
        Account = (Button) findViewById(R.id.account);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(BananaItem.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });

        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(BananaItem.this, Account.class);
                startActivity(goToAccount);

            }
        });
    }
}
