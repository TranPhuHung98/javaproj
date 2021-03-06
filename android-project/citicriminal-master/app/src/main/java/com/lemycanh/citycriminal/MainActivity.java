package com.lemycanh.citycriminal;

import android.app.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.list_fragment_placeholder, ListFragment.CreateInstance())
                .replace(R.id.detail_fragment_placeholder, DetailFragment.CreateInstance())
                .commit();
    }
}
