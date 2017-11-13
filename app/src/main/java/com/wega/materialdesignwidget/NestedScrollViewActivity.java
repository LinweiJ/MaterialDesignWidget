package com.wega.materialdesignwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class NestedScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_scroll_view);
        Toolbar mToolbar =  findViewById(R.id.toolbar);
        mToolbar.setTitle("NestedScrollView");
        setSupportActionBar(mToolbar);
    }
}



