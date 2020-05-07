package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void segitiga(View view) {
        Intent intent = new Intent(menu.this,segitiga.class);
        startActivity(intent);
    }
    public void persegi(View view) {
        Intent intent = new Intent(menu.this,persegi.class);
        startActivity(intent);
    }
    public void kubus(View view) {
        Intent intent = new Intent(menu.this,kubus.class);
        startActivity(intent);
    }
    public void logout(View view) {
        Intent intent = new Intent(menu.this,MainActivity.class);
        startActivity(intent);
    }
}
