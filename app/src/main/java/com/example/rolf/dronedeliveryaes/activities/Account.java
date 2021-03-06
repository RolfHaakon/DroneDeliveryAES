package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.UserManager;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;
import com.example.rolf.dronedeliveryaes.R;
import com.example.rolf.dronedeliveryaes.model.User;
import com.example.rolf.dronedeliveryaes.sql.DatabaseHelper;

import java.util.List;


public class Account extends AppCompatActivity {

    private Button Category;
    private Button Track;
    private Button Home;
    private Button Cart;
    private Button OrderHistory;
    private Button Payment;
    private AppCompatTextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        Category = (Button) findViewById(R.id.category);
        Track = (Button) findViewById(R.id.track);
        Home = (Button)  findViewById(R.id.home);
        Cart = (Button) findViewById(R.id.cart);
        OrderHistory = (Button) findViewById(R.id.orderHistory);
        Payment = (Button) findViewById(R.id.payment);
        initViews();
        initObjects();



        Payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToPayment = new Intent(Account.this, Payment.class);
                startActivity(goToPayment);
            }
        });

        OrderHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToOrderHistory = new Intent(Account.this, OrderHistory.class);
                startActivity(goToOrderHistory);
            }
        });

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


    private void initObjects() {
        textViewName.setText(HomePage.Current_User);
    }

    private void initViews() {
        textViewName = (AppCompatTextView) findViewById(R.id.textViewName);
    }

}
