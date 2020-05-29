package com.example.dfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class MenuCreacio extends AppCompatActivity {
TextView nom, nsetmanes, dilluns,dimarts,dimecres,dijous,divendres,dissabte,diumenge;
String idusuari;

Button crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_creacio);


        nom= findViewById(R.id.id_nomentreno);
        nsetmanes= findViewById(R.id.id_nsetmanes);
        dilluns= findViewById(R.id.id_entdilluns);
        dimarts= findViewById(R.id.id_entdimarts);
        dimecres= findViewById(R.id.id_entdimecres);
        dijous= findViewById(R.id.id_entdijous);
        divendres= findViewById(R.id.id_entdivendres);
        dissabte= findViewById(R.id.id_entdiss);
        diumenge= findViewById(R.id.id_entdium);
        crear=findViewById(R.id.id_crear);
        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase.getInstance()
                        .getReference(FirebaseAuth.getInstance().getCurrentUser().getUid()+"/Entrenaments")
                        .push()

                        .setValue(new objEntrenament(
                                nom.getText().toString(),
                                nsetmanes.getText().toString(),
                                dilluns.getText().toString(),
                                dimarts.getText().toString(),
                                dimecres.getText().toString(),
                                dijous.getText().toString(),
                                divendres.getText().toString(),
                                dissabte.getText().toString(),
                                diumenge.getText().toString()
                        ));
                Toast.makeText(getApplicationContext(), "Entreno creat", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MenuCreacio.this, Gestio.class);
                startActivity(intent);
            }
        });

    }
}
