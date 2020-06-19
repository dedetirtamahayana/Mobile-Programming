package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    public void kembali(View view) {
        Intent intent = new Intent(about.this,menu.class);
        startActivity(intent);
    }
    public void logout(View view) {
        Intent intent = new Intent(about.this,MainActivity.class);
        startActivity(intent);
    }
}
