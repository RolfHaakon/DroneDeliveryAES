package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rolf.dronedeliveryaes.R;

public class ShoppingCart extends AppCompatActivity {

    private Button Home;
    private Button Category;
    private Button Account;
    private Button Track;
    private Button Checkout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);


        Category = (Button) findViewById(R.id.category);
        Account = (Button) findViewById(R.id.account);
        Track = (Button) findViewById(R.id.track);
        Home = (Button) findViewById(R.id.home);
        Checkout = (Button) findViewById(R.id.checkout);

        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToCategory = new Intent(ShoppingCart.this, Category.class);
                startActivity(goToCategory);

            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(ShoppingCart.this, Account.class);
                startActivity(goToAccount);

            }
        });

        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToTrack = new Intent(ShoppingCart.this, Track.class);
                startActivity(goToTrack);

            }
        });

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShoppingCart = new Intent(ShoppingCart.this, HomePage.class);
                startActivity(goToShoppingCart);

            }
        });

        Checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShoppingCart = new Intent(ShoppingCart.this, DeliveryTime.class);
                startActivity(goToShoppingCart);

            }
        });
    }
}
