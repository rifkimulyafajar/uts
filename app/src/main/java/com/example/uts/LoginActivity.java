package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText text_username, text_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        text_username = findViewById(R.id.editText_username);
        text_password = findViewById(R.id.editText_password);
    }

    public void handleLogin(View view) {
        String username, password;
        username = text_username.getText().toString().trim();
        password = text_password.getText().toString().trim();

        if (username.isEmpty()) {
            text_username.setError("username harus diisi");
        }
        else if (password.isEmpty()) {
            text_password.setError("password harus diisi");
        }
        else {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}
