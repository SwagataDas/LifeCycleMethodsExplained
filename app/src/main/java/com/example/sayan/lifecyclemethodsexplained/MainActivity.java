package com.example.sayan.lifecyclemethodsexplained;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("sayan1", "onCreate:");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("sayan1", "onStart:");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("sayan1", "onPause:");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("sayan1", "onResume:");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("sayan1", "onStop:");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("sayan1", "onDestroy:");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("sayan1", "onRestart:");

    }
}
