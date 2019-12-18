package com.maishapay.mjeks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void xml_signup(View view) {
        //connexion
        startActivity(new Intent(getApplicationContext(), SignUpActivity.class));

    }

    public void xml_login(View view) {
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));

    }
}
