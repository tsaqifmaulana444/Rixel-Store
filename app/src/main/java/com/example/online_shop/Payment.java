package com.example.online_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Payment extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        button1 = (Button) findViewById(R.id.pay_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPagePromo();
            }
        });

    }
    public void openPagePromo() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}