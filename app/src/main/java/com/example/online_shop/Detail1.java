package com.example.online_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Detail1 extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);

        button1 = (Button) findViewById(R.id.add_to_cart_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPagePromo();
            }
        });

    }
    public void openPagePromo() {
        Intent intent = new Intent(this,Payment.class);
        startActivity(intent);
    }
}