package com.example.musicservicesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startButton, endButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startButton);
        endButton = findViewById(R.id.endButton);

        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MusicService.class);
            startService(intent);
        });

        endButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MusicService.class);
            stopService(intent);
        });

        IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        AirplaneModeReceiver ar = new AirplaneModeReceiver();
        registerReceiver(ar,intentFilter);
    }
}