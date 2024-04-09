package com.sitm.androidone;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity{
  private static final String TAG = "Activity";
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_new);

    Log.d(TAG, "onCreate: NewActivity created");
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.d(TAG, "onStart: NewActivity started");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.d(TAG, "onResume: NewActivity resumed");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.d(TAG, "onPause: NewActivity paused");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.d(TAG, "onStop: NewActivity stopped");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.d(TAG, "onDestroy: NewActivity destroyed");
  }
}
