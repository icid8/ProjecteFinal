package com.example.dfc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.auth.FirebaseAuth;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class Gestio extends AppCompatActivity {
    Button crear;
    ListView llistaEntrenos;
    private FirebaseListAdapter<objEntrenament> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestio);
        llistaEntrenos= findViewById(R.id.llista_entrenaments);

        llistaEntrenaments();
        clickEntrenament();

        crear= findViewById(R.id.btn_crear);
        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gestio.this, MenuCreacio.class);
                startActivity(intent);

            }
        });

    }

    private void clickEntrenament() {
       llistaEntrenos.setOnItemClickListener(new AdapterView.OnItemClickListener() {

           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Intent intent = new Intent(Gestio.this, VisualitzadorEntrenos.class);
               intent.putExtra("nom", adapter.getItem(position).getNom());
               intent.putExtra("nsetmanes", adapter.getItem(position).getNsetmanes());
               intent.putExtra("dilluns", adapter.getItem(position).getDilluns());
               intent.putExtra("dimarts", adapter.getItem(position).getDiamrts());
               intent.putExtra("dimecres", adapter.getItem(position).getDimecres());
               intent.putExtra("dijous", adapter.getItem(position).getDijous());
               intent.putExtra("divendres", adapter.getItem(position).getDivendres());
               intent.putExtra("dissabte", adapter.getItem(position).getDissabte());
               intent.putExtra("diumenge", adapter.getItem(position).getDiumenge());
               startActivity(intent);
           }



       });

        llistaEntrenos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { //list is my listView

            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, final int pos, long id) {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(Gestio.this);
                builder1.setMessage("Segur que vols eliminar aquest entreno?");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Si",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                DatabaseReference item = adapter.getRef(pos) ;
                                item.removeValue();
                                dialog.cancel();
                            }
                        });

                builder1.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();

             return true;
            }

        });



    }

    private void llistaEntrenaments() {

        adapter = new FirebaseListAdapter<objEntrenament>(this,objEntrenament.class,R.layout.adapterlist, FirebaseDatabase.getInstance().getReference(FirebaseAuth.getInstance().getCurrentUser().getUid() +"/Entrenaments")) {
            @Override
            protected void populateView(View v, objEntrenament model, int position) {
                TextView entreno;
                entreno=v.findViewById(R.id.id_adaptertext);
                entreno.setText(model.getNom());

            }
        };
        llistaEntrenos.setAdapter(adapter);
    }


}




