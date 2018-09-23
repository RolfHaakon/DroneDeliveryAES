package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.rolf.dronedeliveryaes.BeveragesItems.ChocoDrinkItem;
import com.example.rolf.dronedeliveryaes.BeveragesItems.CokeItem;
import com.example.rolf.dronedeliveryaes.BeveragesItems.FantaItem;
import com.example.rolf.dronedeliveryaes.BeveragesItems.LiptonItem;
import com.example.rolf.dronedeliveryaes.BeveragesItems.SpriteItem;
import com.example.rolf.dronedeliveryaes.BeveragesItems.WaterItem;
import com.example.rolf.dronedeliveryaes.R;
import com.example.rolf.dronedeliveryaes.meatsandfishitems.BaconItem;
import com.example.rolf.dronedeliveryaes.meatsandfishitems.BeefItem;
import com.example.rolf.dronedeliveryaes.meatsandfishitems.BurgerItem;
import com.example.rolf.dronedeliveryaes.meatsandfishitems.ChickenItem;
import com.example.rolf.dronedeliveryaes.meatsandfishitems.FishItem;
import com.example.rolf.dronedeliveryaes.meatsandfishitems.ShrimpItem;

public class Beverages extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private Button Category;
    private Button Track;
    private Button Cart;
    private ImageView Coke;
    private ImageView Sprite;
    private ImageView Fanta;
    private ImageView Lipton;
    private ImageView Water;
    private ImageView ChocoDrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);

        Home = (Button) findViewById(R.id.home);
        Account = (Button) findViewById(R.id.account);
        Category = (Button) findViewById(R.id.category);
        Track = (Button) findViewById(R.id.track);
        Cart = (Button) findViewById(R.id.cart);
        Coke = (ImageView) findViewById(R.id.coke);
        Sprite = (ImageView) findViewById(R.id.fanta);
        Fanta = (ImageView) findViewById(R.id.sprite);
        Lipton = (ImageView) findViewById(R.id.lipton);
        Water = (ImageView) findViewById(R.id.water);
        ChocoDrink = (ImageView) findViewById(R.id.chocolate);


        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Beverages.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });

        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCategory = new Intent(Beverages.this, Category.class);
                startActivity(goToCategory);
            }
        });

        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(Beverages.this, Account.class);
                startActivity(goToAccount);

            }
        });
        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTrack = new Intent(Beverages.this, Track.class);
                startActivity(goToTrack);
            }
        });
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToShoppingCart = new Intent(Beverages.this, ShoppingCart.class);
                startActivity(goToShoppingCart);
            }
        });
        Coke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToChicken = new Intent(Beverages.this, CokeItem.class);
                startActivity(goToChicken);
            }
        });
        Sprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToFish = new Intent(Beverages.this, SpriteItem.class);
                startActivity(goToFish);
            }
        });

        Fanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShrimp = new Intent(Beverages.this, FantaItem.class);
                startActivity(goToShrimp);

            }
        });
        Lipton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBurger = new Intent(Beverages.this, LiptonItem.class);
                startActivity(goToBurger);

            }
        });
        Water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBeef = new Intent(Beverages.this, WaterItem.class);
                startActivity(goToBeef);

            }
        });
        ChocoDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBacon = new Intent(Beverages.this, ChocoDrinkItem.class);
                startActivity(goToBacon);

            }
        });
    }
}
