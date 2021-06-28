package br.com.local.appti93_sistema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //Criando uma ação para abrir uma janela em tempo específico.
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Abrindo outra janela
                startActivity(new Intent(getApplicationContext(),Login_Activity.class));
                finish();
            }
        }, 3000);

    }
}