package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kegiatan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kegiatan);
    }
    public void kembali(View view) {
        Intent intent = new Intent(kegiatan.this,menu.class);
        startActivity(intent);
    }
    public void logout(View view) {
        Intent intent = new Intent(kegiatan.this,MainActivity.class);
        startActivity(intent);
    }
}
