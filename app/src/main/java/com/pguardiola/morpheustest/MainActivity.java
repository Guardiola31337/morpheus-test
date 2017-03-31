package com.pguardiola.morpheustest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // If you execute the app you won't see the message
    // ---This message should NOT appear
    // in the console, although we'll see
    // ---Evil created
    // message twice, which is what we want
    new Evil();
    new Evil();
  }
}
