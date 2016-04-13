package com.example.pratama.examplefacebookaccountkit;

import android.app.Application;
import com.facebook.accountkit.AccountKit;

/**
 * Created by pratama on 4/13/16.
 */
public class BaseApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();
    AccountKit.initialize(this);
  }
}
