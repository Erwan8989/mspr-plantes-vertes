package com.mspr.arosaje;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class Profil extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.client_profil);
    }

    @Override
    public void onBackPressed() {
        Intent intentBack = new Intent(this, Accueil.class);
        startActivity(intentBack);
    }

}
