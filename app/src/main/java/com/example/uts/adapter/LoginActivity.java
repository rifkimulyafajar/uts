package com.example.uts.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.uts.LapFutsalActivity;
import com.example.uts.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText text_user, text_pass;
    Button buttonLogin;

    String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        text_user = findViewById(R.id.inputText_username);
        text_pass = findViewById(R.id.inputText_password);

        buttonLogin = findViewById(R.id.btn_login);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = text_user.getText().toString();
                password = text_pass.getText().toString();

                if (username.isEmpty()) {
                    text_user.setError("mohon diisi !!");
                }
                else if (password.isEmpty()) {
                    text_pass.setError("ini juga !!");
                }
                else {
                    Intent intent = new Intent(LoginActivity.this, LapFutsalActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
