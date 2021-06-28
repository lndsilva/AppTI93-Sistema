package br.com.local.appti93_sistema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;

public class PetsActivity extends AppCompatActivity {
    MaterialToolbar idToolBarpets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pets_layout);

        idToolBarpets = findViewById(R.id.idToolBarpets);

        idToolBarpets.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),
                        Menu_Activity.class));
                finish();
            }
        });
    }
}