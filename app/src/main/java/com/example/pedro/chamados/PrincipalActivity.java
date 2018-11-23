package com.example.pedro.chamados;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity implements ExitDialog.ExitListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        FloatingActionButton adicionarChamado = findViewById(R.id.adicionarChamado);
        adicionarChamado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adicionarChamado = new Intent(PrincipalActivity.this, AdicionarChamadoActivity.class);
                startActivity(adicionarChamado);
            }
        });
    }

    @Override
    public void onExit() {
        finish();
    }

    @Override
    public void onBackPressed() {
        ExitDialog dialogoSaida = new ExitDialog();
        dialogoSaida.show(getSupportFragmentManager(), "exitDialog");
    }
}
