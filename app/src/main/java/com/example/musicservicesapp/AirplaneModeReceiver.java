package com.example.musicservicesapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction() != null &&
        intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
                boolean changed = intent.getBooleanExtra("state",false);
            Toast.makeText(context,
                    "AIRPLANE mode :"+(changed?"ON":"OFF"),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
