package com.example.app_20753065_tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buka(View view) {
        Intent bukamaps = new Intent(Intent. ACTION_VIEW);
        startActivity(bukamaps);
    }
    public void Lainnya(View view) {
        Intent Lainnya= new Intent(MainActivity.this, Lainnya.class);
        startActivity(Lainnya);
    }
}