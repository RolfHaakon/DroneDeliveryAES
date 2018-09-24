package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;

import com.example.rolf.dronedeliveryaes.R;

public class Payment extends AppCompatActivity {

    private Button Category;
    private Button Track;
    private Button Home;
    private Button Cart;
    private Button OrderHistory;
    private Button UserInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Category = (Button) findViewById(R.id.category);
        Track = (Button) findViewById(R.id.track);
        Home = (Button)  findViewById(R.id.home);
        Cart = (Button) findViewById(R.id.cart);
        OrderHistory = (Button) findViewById(R.id.orderHistory);
        UserInformation = (Button) findViewById(R.id.userInformation);


        UserInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToUserinformation = new Intent(Payment.this, Account.class);
                startActivity(goToUserinformation);
            }
        });

        OrderHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToOrderHistory = new Intent(Payment.this, OrderHistory.class);
                startActivity(goToOrderHistory);
            }
        });

        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCategory = new Intent(Payment.this, Category.class);
                startActivity(goToCategory);
            }
        });
        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Payment.this, Track.class);
                startActivity(goToHomePage);
            }
        });
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Payment.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShoppingCart = new Intent(Payment.this, ShoppingCart.class);
                startActivity(goToShoppingCart);

            }
        });


    }

}



