package com.example.rolf.dronedeliveryaes.BeveragesItems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rolf.dronedeliveryaes.R;
import com.example.rolf.dronedeliveryaes.activities.HomePage;
import com.example.rolf.dronedeliveryaes.activities.ShoppingCart;

public class WaterItem extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private Button Category;
    private Button Track;
    private Button Cart;
    private  Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_item);


        Home = (Button) findViewById(R.id.home);
        Account = (Button) findViewById(R.id.account);
        Track = (Button) findViewById(R.id.track);
        Cart = (Button) findViewById(R.id.cart);
        Category = (Button) findViewById(R.id.category);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(WaterItem.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });

        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(WaterItem.this, com.example.rolf.dronedeliveryaes.activities.Account.class);
                startActivity(goToAccount);

            }
        });
        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToCategory = new Intent(WaterItem.this, com.example.rolf.dronedeliveryaes.activities.Category.class);
                startActivity(goToCategory);

            }
        });

        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToTrack = new Intent(WaterItem.this, com.example.rolf.dronedeliveryaes.activities.Track.class);
                startActivity(goToTrack);

            }
        });

        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShoppingCart = new Intent(WaterItem.this, ShoppingCart.class);
                startActivity(goToShoppingCart);

            }
        });
    }
}
