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
    public void mahasiswa(View view) {
        Intent intent = new Intent(menu.this,mahasiswa.class);
        startActivity(intent);
    }
    public void dosen(View view) {
        Intent intent = new Intent(menu.this,dosen.class);
        startActivity(intent);
    }
    public void about(View view) {
        Intent intent = new Intent(menu.this,about.class);
        startActivity(intent);
    }
    public void logout(View view) {
        Intent intent = new Intent(menu.this,MainActivity.class);
        startActivity(intent);
    }
}
