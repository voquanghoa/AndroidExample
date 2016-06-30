package com.quanghoa.crashreport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.crash.FirebaseCrash;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseCrash.report(new Exception("My first Android non-fatal error"));
    }

    public void clickMe(View view){
        Object a =  null;
        Log.i("VOQUANGHOA", "Will crash");
        Log.i("VOQUANGHOA", a.toString()+"  ");
    }
}
