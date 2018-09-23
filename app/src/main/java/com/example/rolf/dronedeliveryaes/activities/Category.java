package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.example.rolf.dronedeliveryaes.R;


public class Category extends AppCompatActivity {
    private Button Home;
    private Button Account;
    private Button Track;
    private Button Cart;
    private ImageView Fruit;
    private ImageView Meat;
    private ImageView Beverages;
    private ImageView Alcohol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


        Home = (Button) findViewById(R.id.home);
        Account = (Button) findViewById(R.id.account);
        Track = (Button) findViewById(R.id.track);
        Fruit = (ImageView) findViewById(R.id.fruitveg);
        Meat = (ImageView) findViewById(R.id.meat);
        Beverages = (ImageView) findViewById(R.id.beverages);
        Cart = (Button) findViewById(R.id.cart);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Category.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });
        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Category.this, Track.class);
                startActivity(goToHomePage);
            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(Category.this, Account.class);
                startActivity(goToAccount);

            }
        });
        Fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToFruitAndVeg = new Intent(Category.this, FruitAndVeg.class);
                startActivity(goToFruitAndVeg);
            }
        });

        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShoppingCart = new Intent(Category.this, ShoppingCart.class);
                startActivity(goToShoppingCart);

            }
        });
       //Meat.setOnClickListener(new View.OnClickListener() {
       //    @Override
       //    public void onClick(View v) {
       //        Intent goToMeats = new Intent(Category.this, Meats.class);
       //        startActivity(goToMeats);
       //    }
       //});
        //Beverages.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        Intent goToBeverages = new Intent(Category.this, Beverages.class);
        //        startActivity(goToBeverages);
        //    }
        //});
//
        //Alcohol.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        Intent goToAlcohol = new Intent(Category.this, Alcohol.class);
        //        startActivity(goToAlcohol);
        //    }
        //});

    }
}