package com.example.dfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VisualitzadorEntrenos extends AppCompatActivity {
    TextView nom, nsetmanes, dilluns,dimarts,dimecres,dijous,divendres,dissabte,diumenge;
    Button eliminar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualitzador_entrenos);
        nom= findViewById(R.id.id_nomentreno);
        nsetmanes= findViewById(R.id.id_nsetmanes);
        dilluns= findViewById(R.id.id_entdilluns);
        dimarts= findViewById(R.id.id_entdimarts);
        dimecres= findViewById(R.id.id_entdimecres);
        dijous= findViewById(R.id.id_entdijous);
        divendres= findViewById(R.id.id_entdivendres);
        dissabte= findViewById(R.id.id_entdiss);
        diumenge= findViewById(R.id.id_entdium);


        nom.setText(getIntent().getStringExtra("nom"));
        nsetmanes.setText(getIntent().getStringExtra("nsetmanes"));
        dilluns.setText(getIntent().getStringExtra("dilluns"));
        dimarts.setText(getIntent().getStringExtra("dimarts"));
        dimecres.setText(getIntent().getStringExtra("dimecres"));
        dijous.setText(getIntent().getStringExtra("dijous"));
        divendres.setText(getIntent().getStringExtra("divendres"));
        dissabte.setText(getIntent().getStringExtra("dissabte"));
        diumenge.setText(getIntent().getStringExtra("diumenge"));

        dimarts.setMovementMethod(new ScrollingMovementMethod());


    }

}
