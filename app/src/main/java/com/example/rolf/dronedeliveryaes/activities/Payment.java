package com.example.rolf.dronedeliveryaes.activities;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rolf.dronedeliveryaes.R;

public class Payment extends AppCompatActivity {

    private RadioGroup radioGroupPhoto;
    private ImageView imageViewPhoto;
    private Integer []Photos = {R.drawable.creditcard, R.drawable.paylah, R.drawable.paypal, R.drawable.card};

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_payment);
        imageViewPhoto = (ImageView) findViewById(R.id.imageViewPhoto);



        radioGroup.setOnClickListener(new View.OnClickListener() {
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

        int index = radioGroup.indexOfChild(radioButton);
        imageViewPhoto.setImageResource(Photos[index]);

        Toast.makeText(this, "Payment: "+radioButton.getText(), Toast.LENGTH_SHORT).show();



    }
}
