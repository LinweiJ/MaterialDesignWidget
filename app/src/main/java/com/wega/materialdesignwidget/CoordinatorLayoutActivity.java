package com.wega.materialdesignwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class CoordinatorLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);
        Toolbar mToolbar =  findViewById(R.id.toolbar);
        mToolbar.setTitle("CoordinatorLayout");
        setSupportActionBar(mToolbar);
    }
}
