package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.rolf.dronedeliveryaes.AlcoholItems.BeerItem;
import com.example.rolf.dronedeliveryaes.AlcoholItems.ChampagneItem;
import com.example.rolf.dronedeliveryaes.AlcoholItems.CiderItem;
import com.example.rolf.dronedeliveryaes.AlcoholItems.RedWineItem;
import com.example.rolf.dronedeliveryaes.AlcoholItems.VodkaItem;
import com.example.rolf.dronedeliveryaes.AlcoholItems.WhiteWineItem;
import com.example.rolf.dronedeliveryaes.BeveragesItems.ChocoDrinkItem;
import com.example.rolf.dronedeliveryaes.BeveragesItems.CokeItem;
import com.example.rolf.dronedeliveryaes.BeveragesItems.FantaItem;
import com.example.rolf.dronedeliveryaes.BeveragesItems.LiptonItem;
import com.example.rolf.dronedeliveryaes.BeveragesItems.SpriteItem;
import com.example.rolf.dronedeliveryaes.BeveragesItems.WaterItem;
import com.example.rolf.dronedeliveryaes.R;

public class Alcohol extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private Button Category;
    private Button Track;
    private Button Cart;
    private ImageView Beer;
    private ImageView Cider;
    private ImageView White;
    private ImageView Red;
    private ImageView Champagne;
    private ImageView Vodka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcohol);

        Home = (Button) findViewById(R.id.home);
        Account = (Button) findViewById(R.id.account);
        Category = (Button) findViewById(R.id.category);
        Track = (Button) findViewById(R.id.track);
        Cart = (Button) findViewById(R.id.cart);
        Beer = (ImageView) findViewById(R.id.beer);
        Cider = (ImageView) findViewById(R.id.cider);
        White = (ImageView) findViewById(R.id.white);
        Red = (ImageView) findViewById(R.id.red);
        Champagne = (ImageView) findViewById(R.id.champagne);
        Vodka = (ImageView) findViewById(R.id.vodka);


        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Alcohol.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });

        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCategory = new Intent(Alcohol.this, Category.class);
                startActivity(goToCategory);
            }
        });

        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(Alcohol.this, Account.class);
                startActivity(goToAccount);

            }
        });
        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTrack = new Intent(Alcohol.this, Track.class);
                startActivity(goToTrack);
            }
        });
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToShoppingCart = new Intent(Alcohol.this, ShoppingCart.class);
                startActivity(goToShoppingCart);
            }
        });
        Beer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToChicken = new Intent(Alcohol.this, BeerItem.class);
                startActivity(goToChicken);
            }
        });
        Cider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToFish = new Intent(Alcohol.this, CiderItem.class);
                startActivity(goToFish);
            }
        });

        White.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShrimp = new Intent(Alcohol.this, WhiteWineItem.class);
                startActivity(goToShrimp);

            }
        });
        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBurger = new Intent(Alcohol.this, RedWineItem.class);
                startActivity(goToBurger);

            }
        });
        Champagne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBeef = new Intent(Alcohol.this, ChampagneItem.class);
                startActivity(goToBeef);

            }
        });
        Vodka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBacon = new Intent(Alcohol.this, VodkaItem.class);
                startActivity(goToBacon);

            }
        });
    }
}
