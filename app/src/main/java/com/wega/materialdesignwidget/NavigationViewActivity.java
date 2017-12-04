package com.wega.materialdesignwidget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NavigationViewActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private String mTitle="DrawerLayoutActivity";
    private String mDrawerTitle="DrawerTitle";
    private NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_view);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.DrawerLayout);
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                mToolbar,
                R.string.drawer_open2,  /* "open drawer" description for accessibility */
                R.string.drawer_close2  /* "close drawer" description for accessibility */
        ) {
            public void onDrawerClosed(View view) {
                getSupportActionBar().setTitle(mTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
            public void onDrawerOpened(View drawerView) {
                getSupportActionBar().setTitle(mDrawerTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };
        mDrawerLayout.addDrawerListener(mDrawerToggle);

        mNavigationView = (NavigationView) findViewById(R.id.NavigationView);
//        mNavigationView.setItemIconTintList(null);//显示Icon原有颜色
        //获取头布局文件
        View headerView = mNavigationView.getHeaderView(0);
        TextView mTextView = (TextView) headerView.findViewById(R.id.tv_header_title);
        mTextView.setText("NavigationView");
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                //在这里处理item的点击事件

                switch(item.getItemId()){
                    case R.id.nav_camera:
                        Snackbar.make(mNavigationView,"照相", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.nav_gallery:
                        Snackbar.make(mNavigationView,"相册", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.nav_slideshow:
                        Snackbar.make(mNavigationView,"视频", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.nav_manage:
                        Snackbar.make(mNavigationView,"工具", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.nav_share:
                        Snackbar.make(mNavigationView,"分享", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.nav_send:
                        Snackbar.make(mNavigationView,"发送", Snackbar.LENGTH_LONG).show();
                        break;
                }
                mDrawerLayout.closeDrawer(Gravity.LEFT);
                return true;
            }
        });

    }



    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }
}


