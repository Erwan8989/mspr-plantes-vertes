package com.mspr.arosaje;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ClientConnexion extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.client_connexion);

    }

    /*Bouton retour*/
    @Override
    public void onBackPressed() {
        Intent intentBack = new Intent(this, ClientAccueil.class);
        startActivity(intentBack);
    }

}
