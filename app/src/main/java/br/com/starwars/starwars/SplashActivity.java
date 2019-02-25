package br.com.starwars.starwars;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.starwars.starwars.view.PersonagemListActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                abrirApp();
            }
        }, 3000);


    }

    public void abrirApp(){
        Intent it = new Intent(this, LoginActivity.class);
        startActivity(it);
        finish();
    }
}
