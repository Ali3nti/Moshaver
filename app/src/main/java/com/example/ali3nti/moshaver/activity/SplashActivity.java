package com.example.ali3nti.moshaver.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ali3nti.moshaver.R;

public class SplashActivity extends AppCompatActivity {

  TextView txt_splash;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);

    txt_splash = findViewById(R.id.txt_splash);
    txt_splash.animate().alpha(1f).translationY(-30f).setDuration(2000);

    new Handler().postDelayed(new Runnable() {
      @Override
      public void run() {
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
      }
    },3000);
  }
}
