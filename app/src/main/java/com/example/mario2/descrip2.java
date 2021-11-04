package com.example.mario2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class descrip2 extends AppCompatActivity {

    ImageButton boton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descrip2);
        boton4=findViewById(R.id.boton4);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(descrip2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}