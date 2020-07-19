package com.example.helloword;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tela2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Tela2Activity", "onCreate");
        setContentView(R.layout.activity_tela2);

        String[] membrosArray = getIntent().getExtras().getStringArray("lista");

        TextView text = findViewById(R.id.textView2);

        for (String membro: membrosArray) {
            Log.d("membro", membro);
            text.append(membro+" \n");
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Tela2Activity", "onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Tela2Activity", "onResume");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Tela2Activity", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Tela2Activity", "onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Tela2Activity", "onPause");
    }

}
