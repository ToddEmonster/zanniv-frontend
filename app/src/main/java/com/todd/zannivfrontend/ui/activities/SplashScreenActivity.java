package com.todd.zannivfrontend.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.todd.zannivfrontend.R;
import com.todd.zannivfrontend.ui.activities.login.LoginActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean auth = this.isCurrentUserAuthenticated();
        // Vérifier que l'utilisateur est authentifié;


        // TODO : si l'utilisateur est authentifié
        if (false) {
            startActivity(new Intent(this, ListActivity.class));
        }
        else {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        }
    }

    protected boolean isCurrentUserAuthenticated() {
        
        return false;
    }
}