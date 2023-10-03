package com.santotomas.opinanime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Inicio extends AppCompatActivity {

    ImageButton imgop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        imgop = (ImageButton) findViewById(R.id.img_op);

        imgop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op = new Intent(Inicio.this, OnePiece.class);
                startActivity(op);
            }
        });
    }
}