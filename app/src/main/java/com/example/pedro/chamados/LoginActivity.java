package com.example.pedro.chamados;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText login;
    EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login);
        senha = findViewById(R.id.senha);

    }

    public void fazerLogin(View view) {

        if (login.getText().toString().equals("admin") && senha.getText().toString().equals("admin")){
            Intent verMeusChamadosActivity = new Intent(LoginActivity.this, PrincipalActivity.class);
        } else {
            Toast.makeText(this, "Login e/ou Senha incorretos", Toast.LENGTH_SHORT).show();
        }

    }
}
