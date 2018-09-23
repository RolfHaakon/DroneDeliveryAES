package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.rolf.dronedeliveryaes.R;
import com.example.rolf.dronedeliveryaes.meatsandfishitems.ChickenItem;

public class MeatAndFish extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private Button Category;
    private Button Track;
    private Button Cart;
    private ImageView Chicken;
    private ImageView Fish;
    private ImageView Shrimp;
    private ImageView Burger;
    private ImageView Beef;
    private ImageView Bacon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat_and_fish);


        Home = (Button) findViewById(R.id.home);
        Account = (Button) findViewById(R.id.account);
        Category = (Button) findViewById(R.id.category);
        Track = (Button) findViewById(R.id.track);
        Cart = (Button) findViewById(R.id.cart);
        Chicken = (ImageView) findViewById(R.id.chicken);
        Fish = (ImageView) findViewById(R.id.fish);
        Shrimp = (ImageView) findViewById(R.id.shrimp);
        Burger = (ImageView) findViewById(R.id.burger);
        Beef = (ImageView) findViewById(R.id.beef);
        Bacon = (ImageView) findViewById(R.id.bacon);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(MeatAndFish.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });

        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCategory = new Intent(MeatAndFish.this, Category.class);
                startActivity(goToCategory);
            }
        });

        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(MeatAndFish.this, Account.class);
                startActivity(goToAccount);

            }
        });
        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTrack = new Intent(MeatAndFish.this, Track.class);
                startActivity(goToTrack);
            }
        });
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToShoppingCart = new Intent(MeatAndFish.this, ShoppingCart.class);
                startActivity(goToShoppingCart);
            }
        });
        Chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToChicken = new Intent(MeatAndFish.this, ChickenItem.class);
                startActivity(goToChicken);
            }
        });
        Fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToFish = new Intent(MeatAndFish.this, Fish.class);
                startActivity(goToFish);
            }
        });

        Shrimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShrimp = new Intent(MeatAndFish.this, Shrimp.class);
                startActivity(goToShrimp);

            }
        });
        Burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBurger = new Intent(MeatAndFish.this, Burger.class);
                startActivity(goToBurger);

            }
        });
        Beef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBeef = new Intent(MeatAndFish.this, Beef.class);
                startActivity(goToBeef);

            }
        });
        Bacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBacon = new Intent(MeatAndFish.this, Bacon.class);
                startActivity(goToBacon);

            }
        });
    }
}
