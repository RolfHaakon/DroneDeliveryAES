package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;

import com.example.rolf.dronedeliveryaes.R;
import com.example.rolf.dronedeliveryaes.model.User;

import java.util.List;

public class OrderHistory extends AppCompatActivity{

    private Button Category;
    private Button Track;
    private Button Home;
    private Button Cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);

        Category = (Button) findViewById(R.id.category);
        Track = (Button) findViewById(R.id.track);
        Home = (Button)  findViewById(R.id.home);
        Cart = (Button) findViewById(R.id.cart);



        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCategory = new Intent(OrderHistory.this, Category.class);
                startActivity(goToCategory);
            }
        });
        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(OrderHistory.this, Track.class);
                startActivity(goToHomePage);
            }
        });
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(OrderHistory.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShoppingCart = new Intent(OrderHistory.this, ShoppingCart.class);
                startActivity(goToShoppingCart);

            }
        });


    }

}
