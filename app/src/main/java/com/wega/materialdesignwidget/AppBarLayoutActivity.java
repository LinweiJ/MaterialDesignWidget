package com.wega.materialdesignwidget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.wega.materialdesignwidget.AppBarLayout.EnterAlwaysActivity;
import com.wega.materialdesignwidget.AppBarLayout.EnterAlwaysCollapsedActivity;
import com.wega.materialdesignwidget.AppBarLayout.ExitUntilCollapsedActivity;
import com.wega.materialdesignwidget.AppBarLayout.ScrollActivity;
import com.wega.materialdesignwidget.AppBarLayout.SpanActivity;


public class AppBarLayoutActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout);
        //
        Toolbar mToolbar =  findViewById(R.id.toolbar);
        mToolbar.setTitle("AppBarLayout");
        setSupportActionBar(mToolbar);
        findViewById(R.id.scroll).setOnClickListener(this);
        findViewById(R.id.scroll_enterAlways).setOnClickListener(this);
        findViewById(R.id.scroll_enterAlwaysCollapsed).setOnClickListener(this);
        findViewById(R.id.scroll_exit_util_collapsed).setOnClickListener(this);
        findViewById(R.id.scroll_span).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch(v.getId()){


            case R.id.scroll:

               intent.setClass(this,ScrollActivity.class);
                break;
            case R.id.scroll_enterAlways:

               intent.setClass(this,EnterAlwaysActivity.class);
                break;
            case R.id.scroll_enterAlwaysCollapsed:

               intent.setClass(this,EnterAlwaysCollapsedActivity.class);
                break;

            case R.id.scroll_exit_util_collapsed:

                intent.setClass(this,ExitUntilCollapsedActivity.class);
                break;
            case R.id.scroll_span:

               intent.setClass(this,SpanActivity.class);
                break;
        }
        startActivity(intent);
    }
}
