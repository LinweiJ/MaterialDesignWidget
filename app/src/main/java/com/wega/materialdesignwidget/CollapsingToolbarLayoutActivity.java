package com.wega.materialdesignwidget;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class CollapsingToolbarLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //app:statusBarScrim 状态栏纱布 需要侵入statusbar,使用透明化布局
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_collapsing_toolbar_layout);
        Toolbar mToolbar =   findViewById(R.id.toolbar);
        CollapsingToolbarLayout mCollapsingToolbarLayout =   findViewById(R.id.CollapsingToolbarLayout);
        mCollapsingToolbarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("CollapsingToolbarLayout","CollapsingToolbarLayout");
            }
        });
        mToolbar.setTitle("CollapsingToolbarLayout");
        setSupportActionBar(mToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.action_more:

                Toast.makeText(this,"更多", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
