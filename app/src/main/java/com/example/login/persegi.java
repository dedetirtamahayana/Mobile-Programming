package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {
    EditText txtpersegi;
    TextView txthasilpersegi;
    Button btnhitungpersegi,btnhitungpersegikll;
    Integer sisipersegi,luaspersegi,kllpersegi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        txtpersegi =(EditText) findViewById(R.id.txtpersegi);
        txthasilpersegi =(TextView) findViewById(R.id.txthasilpersegi);
        btnhitungpersegi = (Button) findViewById(R.id.btnhitungpersegi);
        btnhitungpersegikll = (Button) findViewById(R.id.btnhitungpersegikll);

        btnhitungpersegi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String strsisipersegi =((EditText)txtpersegi).getText().toString();

                    if (!txthasilpersegi.equals("")){
                        sisipersegi=Integer.parseInt(strsisipersegi);
                        luaspersegi= sisipersegi * sisipersegi;
                        txthasilpersegi.setText("Luas Persegi Adalah "+luaspersegi);
                    }
                }
        });
        btnhitungpersegikll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strsisipersegi =((EditText)txtpersegi).getText().toString();

                if (!txthasilpersegi.equals("")){
                    sisipersegi=Integer.parseInt(strsisipersegi);
                    kllpersegi= 4 * sisipersegi;
                    txthasilpersegi.setText("Keliling Persegi Adalah "+kllpersegi);
                }
            }
        });
    }
    public void kembali(View view) {
        Intent intent = new Intent(persegi.this,menu.class);
        startActivity(intent);
    }
}
