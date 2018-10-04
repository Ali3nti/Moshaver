package com.example.ali3nti.moshaver.main;

import android.app.Application;
import android.content.Context;

public class G extends Application{

  public static Context context;

  @Override
  public void onCreate() {
    super.onCreate();

    context = getApplicationContext();
  }
}
