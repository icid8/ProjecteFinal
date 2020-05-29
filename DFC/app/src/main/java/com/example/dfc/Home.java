package com.example.dfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements  View.OnClickListener {
    Button perfil,entrenament,gestio,destacats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        perfil= findViewById(R.id.btn_perfil);
        perfil.setOnClickListener(this);

        gestio= findViewById(R.id.btn_gestio);
        gestio.setOnClickListener(this);

        destacats= findViewById(R.id.btn_destacats);
        destacats.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_perfil:
                accedirPerfil();
                break;

            case R.id.btn_gestio:
                accedirGestio();
                break;
            case R.id.btn_destacats:
                accedirDestacats();
                break;
        }

    }

    private void accedirDestacats() {
        Intent intent = new Intent(Home.this, Destacats.class);
        startActivity(intent);
    }

    private void accedirGestio() {
        Intent intent = new Intent(Home.this, Gestio.class);
        startActivity(intent);
    }

    private void accedirPerfil() {
        Intent intent = new Intent(Home.this, Perfil.class);
        startActivity(intent);
    }

}
