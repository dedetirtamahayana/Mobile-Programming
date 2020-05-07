package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kubus extends AppCompatActivity {
    EditText txtkubus;
    TextView txthasilvolume;
    Button btnhitungvolume;
    Integer sisikubus,volumekubus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        txtkubus =(EditText) findViewById(R.id.txtkubus);
        txthasilvolume =(TextView) findViewById(R.id.txthasilvolume);
        btnhitungvolume = (Button) findViewById(R.id.btnhitungvolume);

        btnhitungvolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strkubus =((EditText)txtkubus).getText().toString();

                if (!txtkubus.equals("")){
                    sisikubus=Integer.parseInt(strkubus);
                    volumekubus= sisikubus * sisikubus * sisikubus;
                    txthasilvolume.setText("Volume Kubus Adalah "+volumekubus);
                }
            }
        });
    }
    public void kembali(View view) {
        Intent intent = new Intent(kubus.this,menu.class);
        startActivity(intent);
    }

}
