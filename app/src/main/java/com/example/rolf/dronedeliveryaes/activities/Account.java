package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.rolf.dronedeliveryaes.R;

public class Account extends AppCompatActivity {

    private Button Category;
    private Button Track;
    private Button Home;
    private Button Cart;
    private Button DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        Category = (Button) findViewById(R.id.category);
        Track = (Button) findViewById(R.id.track);
        Home = (Button)  findViewById(R.id.home);
        Cart = (Button) findViewById(R.id.cart);



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
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShoppingCart = new Intent(Account.this, ShoppingCart.class);
                startActivity(goToShoppingCart);

            }
        });
    }
}
