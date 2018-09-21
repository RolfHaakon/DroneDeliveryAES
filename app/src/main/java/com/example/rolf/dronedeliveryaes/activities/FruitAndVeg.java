package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.example.rolf.dronedeliveryaes.R;


public class FruitAndVeg extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private Button Track;
    private Button Category;
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
        Apple = (ImageView) findViewById(R.id.chicken);
        Banana = (ImageView) findViewById(R.id.fish);
        Broccoli = (ImageView) findViewById(R.id.shrimp);
        Carrot = (ImageView) findViewById(R.id.burger);
        Orange = (ImageView) findViewById(R.id.beef);
        Watermelon = (ImageView) findViewById(R.id.bacon);

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
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(FruitAndVeg.this, Account.class);
                startActivity(goToAccount);

            }
        });
        //Apple.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        Intent goToApple = new Intent(FruitAndVeg.this, AppleItem.class);
        //        startActivity(goToApple);
        //    }
        //});
        //Banana.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        Intent goToBanana = new Intent(FruitAndVeg.this, BananaItem.class);
        //        startActivity(goToBanana);
        //    }
        //});
        //Broccoli.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
//
        //        Intent goToBroccoli = new Intent(FruitAndVeg.this, BroccoliItem.class);
        //        startActivity(goToBroccoli);
//
        //    }
        //});
        //Carrot.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
//
        //        Intent goToCarrot = new Intent(FruitAndVeg.this, CarrotItem.class);
        //        startActivity(goToCarrot);
//
        //    }
        //});
        //Orange.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
//
        //        Intent goToOrange = new Intent(FruitAndVeg.this, OrangeItem.class);
        //        startActivity(goToOrange);
//
        //    }
        //});
        //Watermelon.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
//
        //        Intent goToWatermelon = new Intent(FruitAndVeg.this, WatermelonItem.class);
        //        startActivity(goToWatermelon);
//
        //    }
        //});
    }
}
