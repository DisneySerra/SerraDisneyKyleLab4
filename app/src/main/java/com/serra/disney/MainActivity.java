package com.serra.disney;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITF","onCreate has executed.....");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITF","onStart has executed....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITF","onResume has executed....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITF","onPause has executed....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITF","onStop has executed....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITF","onRestart has executed....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITF","object is deallocated....");
    }

    public void display(View v){
        Toast.makeText(this,"Back is clicked.....", Toast.LENGTH_LONG).show();
    }
    public void display2(View v){
        Snackbar.make(v,"Next is clicked.....", Snackbar.LENGTH_LONG).show();
    }


}
