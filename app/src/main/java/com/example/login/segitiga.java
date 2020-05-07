package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {
        EditText txtalas,txttinggi,txtsisi1,txtsisi2,txtsisi3;
        TextView txthasil,txthasilkll;
        Button btnhitungluas,btnhtiungkll;
        Double alas,tinggi,hasilluas,hasilkll,sisi1,sisi2,sisi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        txtalas =(EditText) findViewById(R.id.txtalas);
        txttinggi =(EditText) findViewById(R.id.txttinggi);
        txtsisi1 =(EditText) findViewById(R.id.sisi1);
        txtsisi2 =(EditText) findViewById(R.id.sisi2);
        txtsisi3 =(EditText) findViewById(R.id.sisi3);
        txthasil =(TextView) findViewById(R.id.txthasil);
        txthasilkll =(TextView) findViewById(R.id.txthasilkll);
        btnhtiungkll = (Button) findViewById(R.id.btnhitungkll);
        btnhitungluas = (Button) findViewById(R.id.btnhitungluas);

        btnhitungluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stralas =((EditText)txtalas).getText().toString();
                String strtinggi =((EditText)txttinggi).getText().toString();

                if (!txtalas.equals("")&& !txttinggi.equals("")){
                    alas=Double.parseDouble(stralas);
                    tinggi=Double.parseDouble(strtinggi);
                    hasilluas=0.5*alas*tinggi;
                    txthasil.setText("Luas Segitiga Adalah "+hasilluas);
                }
            }
        });
        btnhtiungkll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strsisi1 =((EditText)txtsisi1).getText().toString();
                String strsisi2 =((EditText)txtsisi2).getText().toString();
                String strsisi3 =((EditText)txtsisi3).getText().toString();

                if (!txtsisi1.equals("")&& !txtsisi2.equals("")&& !txtsisi3.equals("")){
                    sisi1=Double.parseDouble(strsisi1);
                    sisi2=Double.parseDouble(strsisi2);
                    sisi3=Double.parseDouble(strsisi3);
                    hasilkll=sisi1+sisi2+sisi3;
                    txthasilkll.setText("Keliling Segitiga Adalah "+hasilkll);
                }
            }
        });
    }
    public void kembali(View view) {
        Intent intent = new Intent(segitiga.this,menu.class);
        startActivity(intent);
    }
}

