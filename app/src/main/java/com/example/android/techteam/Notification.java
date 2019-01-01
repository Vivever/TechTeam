package com.example.android.techteam;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Notification extends AppCompatActivity {
    private  static  final String TAG = "Notification";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notifictation);
        Log.d(TAG,"onCreate : Started");
    }
}
