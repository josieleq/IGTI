package com.example.helloword;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BroadcastBattery extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
       // Log.d("Receiver", "Something happened!");
        Toast.makeText(context, "Atenção!!! Bateria Fraca.", Toast.LENGTH_SHORT).show();
    }

}
