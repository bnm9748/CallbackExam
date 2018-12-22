package com.example.callbackexam;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ColorListFragment.OnColorSelectedListener{
    private ColorFragment mColorFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorFragment colorFragment = (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_color);
        colorFragment.setColor(Color.RED);
        mColorFragment= (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_color);
    }

    @Override
    public void onColorSelected(int color) {
        mColorFragment.setColor(color);
    }
}
