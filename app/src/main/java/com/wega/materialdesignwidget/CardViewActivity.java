package com.wega.materialdesignwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CardViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        getSupportActionBar().setTitle("CardView");
    }
}
