package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends Activity implements View.OnClickListener{

    private EditText emailedittext;
    private EditText passedittext;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailedittext = (EditText)findViewById(R.id.txtusername);
        passedittext = (EditText) findViewById(R.id.txtpassword);
        Login =findViewById(R.id.btnlogin);
        Login.setOnClickListener(this);
    }
    @Override
    public void onClick(View arg0) {
        checklogin(Login);
    }
    public void checklogin(View arg0){
        final String email = emailedittext.getText().toString();
        if (!isValidEmail(email)){
            emailedittext.setError("Username Tidak Valid !");
        }
        final String password = passedittext.getText().toString();
        if (!isValidPassword(password)){
            passedittext.setError("Password masih kosong pak !");
        }
        if (isValidEmail(email) && isValidPassword(password)){
            Toast.makeText(getApplicationContext(),"berhasil",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(MainActivity.this, menu.class);
            startActivity(intent);
            this.finish();
        }
    }

    public boolean isValidPassword(String password) {
        return (password != null && password.length() >= 4);
    }

    public boolean isValidEmail(String email){
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
