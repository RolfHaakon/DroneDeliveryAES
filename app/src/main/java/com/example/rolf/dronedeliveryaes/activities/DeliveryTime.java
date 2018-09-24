package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rolf.dronedeliveryaes.R;

public class DeliveryTime extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    private Button Payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_time);

        radioGroup = (RadioGroup) findViewById(R.id.test);
        Payment = (Button) findViewById(R.id.payment);
        textView = (TextView) findViewById(R.id.text_view_selected);

        Payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToCategory = new Intent(DeliveryTime.this, PaymentCheckout.class);
                startActivity(goToCategory);

            }
        });

        Button buttonApply = (Button) findViewById(R.id.buttontest2);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = (RadioButton) findViewById(radioId);


                textView.setText(String.format("Delivery time confirmed" ));

            }
        });
    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = (RadioButton) findViewById(radioId);

        Toast.makeText(this, "Time slot Selected", Toast.LENGTH_SHORT).show();
    }
}
