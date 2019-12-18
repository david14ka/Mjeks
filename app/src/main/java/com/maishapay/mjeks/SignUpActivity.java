package com.maishapay.mjeks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void xml_signup(View view) {
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
    }

    public void xml_login(View view) {
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));

    }
}
