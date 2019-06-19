package com.example.etst_learn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TypeFaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(TypeFaceActivity.this));
    }
}
