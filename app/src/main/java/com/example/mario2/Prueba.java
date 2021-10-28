package com.example.mario2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Prueba extends AppCompatActivity {

    ImageButton boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton2=findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Prueba.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}