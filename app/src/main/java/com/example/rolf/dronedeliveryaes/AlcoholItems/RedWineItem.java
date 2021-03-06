package com.example.rolf.dronedeliveryaes.AlcoholItems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rolf.dronedeliveryaes.BeveragesItems.ChocoDrinkItem;
import com.example.rolf.dronedeliveryaes.R;
import com.example.rolf.dronedeliveryaes.activities.HomePage;
import com.example.rolf.dronedeliveryaes.activities.ShoppingCart;

public class RedWineItem extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private Button Category;
    private Button Track;
    private Button Cart;
    private  Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_wine_item);


        Home = (Button) findViewById(R.id.home);
        Account = (Button) findViewById(R.id.account);
        Track = (Button) findViewById(R.id.track);
        Cart = (Button) findViewById(R.id.cart);
        Category = (Button) findViewById(R.id.category);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(RedWineItem.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });

        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(RedWineItem.this, com.example.rolf.dronedeliveryaes.activities.Account.class);
                startActivity(goToAccount);

            }
        });
        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToCategory = new Intent(RedWineItem.this, com.example.rolf.dronedeliveryaes.activities.Category.class);
                startActivity(goToCategory);

            }
        });

        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToTrack = new Intent(RedWineItem.this, com.example.rolf.dronedeliveryaes.activities.Track.class);
                startActivity(goToTrack);

            }
        });

        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShoppingCart = new Intent(RedWineItem.this, ShoppingCart.class);
                startActivity(goToShoppingCart);

            }
        });

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView item = (TextView) findViewById(R.id.textViewbeer);
                String displayitem = item.getText().toString();
                Toast.makeText(getBaseContext(),displayitem+" Added to cart",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
