package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.example.rolf.dronedeliveryaes.R;
import com.example.rolf.dronedeliveryaes.fruitvegitems.AppleItem;
import com.example.rolf.dronedeliveryaes.fruitvegitems.BananaItem;
import com.example.rolf.dronedeliveryaes.fruitvegitems.BroccoliItem;
import com.example.rolf.dronedeliveryaes.fruitvegitems.CarrotItem;
import com.example.rolf.dronedeliveryaes.fruitvegitems.OrangeItem;
import com.example.rolf.dronedeliveryaes.fruitvegitems.WatermelonItem;


public class FruitAndVeg extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private Button Track;
    private Button Category;
    private Button Cart;
    private ImageView Apple;
    private ImageView Banana;
    private ImageView Broccoli;
    private ImageView Carrot;
    private ImageView Orange;
    private ImageView Watermelon;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_and_veg);

        Home = (Button) findViewById(R.id.home);
        Account = (Button) findViewById(R.id.account);
        Category = (Button) findViewById(R.id.category);
        Track = (Button) findViewById(R.id.track);
        Cart = (Button) findViewById(R.id.cart);
        Apple = (ImageView) findViewById(R.id.apple_item);
        Banana = (ImageView) findViewById(R.id.banana);
        Broccoli = (ImageView) findViewById(R.id.broccoli);
        Carrot = (ImageView) findViewById(R.id.carrot_item);
        Orange = (ImageView) findViewById(R.id.orange);
        Watermelon = (ImageView) findViewById(R.id.watermelon);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(FruitAndVeg.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });
        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCategory = new Intent(FruitAndVeg.this, Category.class);
                startActivity(goToCategory);
            }
        });
        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(FruitAndVeg.this, Track.class);
                startActivity(goToHomePage);
            }
        });
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToShoppingCart = new Intent(FruitAndVeg.this, ShoppingCart.class);
                startActivity(goToShoppingCart);
            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(FruitAndVeg.this, Account.class);
                startActivity(goToAccount);

            }
        });
        Apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToApple = new Intent(FruitAndVeg.this, AppleItem.class);
                startActivity(goToApple);
            }
        });
        Banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToBanana = new Intent(FruitAndVeg.this, BananaItem.class);
                startActivity(goToBanana);
            }
        });
        Broccoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBroccoli = new Intent(FruitAndVeg.this, BroccoliItem.class);
                startActivity(goToBroccoli);

            }
        });
        Carrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToCarrot = new Intent(FruitAndVeg.this, CarrotItem.class);
                startActivity(goToCarrot);

            }
        });
        Orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToOrange = new Intent(FruitAndVeg.this, OrangeItem.class);
                startActivity(goToOrange);

            }
        });
        Watermelon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent goToWatermelon = new Intent(FruitAndVeg.this, WatermelonItem.class);
                startActivity(goToWatermelon);

            }
        });
    }
}
