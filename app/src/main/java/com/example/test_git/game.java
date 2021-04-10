package com.example.test_git;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class game extends AppCompatActivity {
    
    Button btlife;
    Button btpr;
    Button btec;
    Button btnuc;
    Button btnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        
        btlife = (Button) findViewById(R.id.btg);
        btlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btpr = (Button) findViewById(R.id.btg);
        btpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

        btec = (Button) findViewById(R.id.btg);
        btec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

        btnuc = (Button) findViewById(R.id.btg);
        btnuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

        btnext = (Button) findViewById(R.id.btg);
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(game.this, game.class);
                startActivity(intent);
            }
        });
    }
}