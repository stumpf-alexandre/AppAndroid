package com.stumpf.als.appandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnBolo = findViewById(R.id.bolo);
        btnBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BoloActivity.class);
                startActivity(intent);
            }
        });

        Button btnCookie = findViewById(R.id.cookie);
        btnCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CookieActivity.class);
                startActivity(intent);
            }
        });

        Button btnSorvete = findViewById(R.id.sorvete);
        btnSorvete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SorveteActivity.class);
                startActivity(intent);
            }
        });

        Button btnTorta = findViewById(R.id.torta);
        btnTorta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TortaActivity.class);
                startActivity(intent);
            }
        });
    }
}
