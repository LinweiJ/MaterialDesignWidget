package com.wega.materialdesignwidget;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TabLayoutActivity extends AppCompatActivity {


    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        //
        Toolbar mToolbar =  findViewById(R.id.toolbar);
        mToolbar.setTitle("TabLayout");
        setSupportActionBar(mToolbar);
        //
        TabLayout mTabLayout =   findViewById(R.id.tabLayout);
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getText();
                tab.getPosition();
                tab.getTag();
                Toast.makeText(TabLayoutActivity.this,"onTabSelected"+tab.getText()+tab.getPosition()+tab.getTag(), Toast.LENGTH_SHORT).show();
                Log.e("onTabSelected",""+tab.getText()+tab.getPosition()+tab.getTag());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                Log.e("onTabUnselected",""+tab.getText()+tab.getPosition()+tab.getTag());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Log.e("onTabReselected",""+tab.getText()+tab.getPosition()+tab.getTag());
            }
        });

        //测量ll_appbar,设置nestedScrollView的topMargin
        LinearLayout mLLAppbar =   findViewById(R.id.ll_appbar);
        int width2 = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int height2 = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        mLLAppbar.measure(width2,height2);
        int  height=mLLAppbar.getMeasuredHeight();
        NestedScrollView mNestedScrollView =   findViewById(R.id.nestedScrollView);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) mNestedScrollView.getLayoutParams();
        layoutParams.topMargin=height;
        mNestedScrollView.setLayoutParams(layoutParams);
    }




}
