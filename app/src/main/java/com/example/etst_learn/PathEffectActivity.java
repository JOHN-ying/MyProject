package com.example.etst_learn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PathEffectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new PathEffectView(this));
    }
}
