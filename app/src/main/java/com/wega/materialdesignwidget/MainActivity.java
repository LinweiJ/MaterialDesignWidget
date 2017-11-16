package com.wega.materialdesignwidget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_toolbar).setOnClickListener(this);
        findViewById(R.id.btn_NestedScrollView).setOnClickListener(this);
        findViewById(R.id.btn_CoordinatorLayout).setOnClickListener(this);
        findViewById(R.id.btn_TabLayout).setOnClickListener(this);
        findViewById(R.id.btn_AppBarLayout).setOnClickListener(this);
        findViewById(R.id.btn_CollapsingToolbarLayout).setOnClickListener(this);
        findViewById(R.id.btn_CardView).setOnClickListener(this);
        findViewById(R.id.btn_FloatingActionButton).setOnClickListener(this);
        findViewById(R.id.btn_SnackBar).setOnClickListener(this);
        findViewById(R.id.btn_TextInputLayout).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){


            case R.id.btn_toolbar:
                intent.setClass(this,ToolbarActivity.class);

                break;

            case R.id.btn_NestedScrollView:
                intent.setClass(this,NestedScrollViewActivity.class);

                break;
            case R.id.btn_CoordinatorLayout:
                intent.setClass(this,CoordinatorLayoutActivity.class);

                break;
            case R.id.btn_TabLayout:
                intent.setClass(this,TabLayoutActivity.class);

                break;

            case R.id.btn_AppBarLayout:
                intent.setClass(this,AppBarLayoutActivity.class);

                break;
            case R.id.btn_CollapsingToolbarLayout:
                intent.setClass(this,CollapsingToolbarLayoutActivity.class);

                break;
            case R.id.btn_CardView:
                intent.setClass(this,CardViewActivity.class);

                break;
            case R.id.btn_FloatingActionButton:
                intent.setClass(this,FloatingActionButtonActivity.class);

                break;
            case R.id.btn_SnackBar:
                intent.setClass(this,SnackBarActivity.class);

                break;
                case R.id.btn_TextInputLayout:
                intent.setClass(this,TextInputLayoutActivity.class);

                break;
        }

        startActivity(intent);
    }
}
