package com.wega.materialdesignwidget;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SnackBarActivity extends AppCompatActivity {

    private FloatingActionButton mFlbPlay;
    private CoordinatorLayout mCoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        getSupportActionBar().setTitle("SnackBar");
        mFlbPlay =   findViewById(R.id.flb_play);
        mCoordinatorLayout =   findViewById(R.id.CoordinatorLayout);
        mFlbPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Snackbar snackbar = Snackbar.make(mFlbPlay, "右滑取消,点击确定取消", Snackbar.LENGTH_LONG);
                snackbar.setAction("确定", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                SnackBarActivity.this,
                                "点击确定",
                                Toast.LENGTH_LONG).show();
                    }
                });
                snackbar.setActionTextColor(Color.parseColor("#93FF40"));
                snackbar.setDuration(2000);
                snackbar.getView().setBackgroundColor(Color.parseColor("#4093FF"));
                ((TextView)  snackbar.getView().findViewById(R.id.snackbar_text)).setTextColor(Color.parseColor("#ab22ba"));
                snackbar.show();

            }
        });


    }


}
