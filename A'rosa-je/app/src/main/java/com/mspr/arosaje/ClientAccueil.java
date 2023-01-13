package com.mspr.arosaje;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ClientAccueil extends Activity {

    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.client_accueil);

        b1 = (Button) findViewById(R.id.btn_gardienner);
        b2 = (Button) findViewById(R.id.btn_monprofil);
        b3 = (Button) findViewById(R.id.btn_addPlant);

        // ***************** Changement de page au clic *****************

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openActivityGardienner();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openActivityProfil();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openActivityAjouterPlante();
            }
        });

    }

    /*Page d'acceuil donc le bouton retour quitte l'app? */
    /*D'apres l'interWEB un bouton exit app n'est pas une bonne pratique*/
    /*@Override
    public void onBackPressed() {
        Intent intentBack = new Intent(this, saisir.class);
        startActivity(intentBack);
    }*/

    public void openActivityGardienner(){
        Intent gardienner = new Intent(this, ClientGardiennage.class);
        startActivity(gardienner);
        finish();
    }

    public void openActivityProfil(){
        Intent monProfil = new Intent(this, ClientProfil.class);
        startActivity(monProfil);
        finish();
    }

    public void openActivityAjouterPlante(){
        Intent ajouterPlante = new Intent(this, ClientAjouterPlante.class);
        startActivity(ajouterPlante);
        finish();
    }
}