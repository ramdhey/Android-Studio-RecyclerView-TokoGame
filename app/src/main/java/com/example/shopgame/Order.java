package com.example.shopgame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        Button ord=findViewById(R.id.order);

        ord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Order.this,MainActivity.class));
                AlertDialog.Builder alert = new AlertDialog.Builder(Order.this);
                alert.setTitle("Order Game Kamu Berhasil");
                alert.setMessage("Silahkan Cek Email Kamu, Kami Tunggu Orderan Selanjutnya =)");
                alert.setPositiveButton("Okey", null);
                alert.show();

            }
        });
    }
}