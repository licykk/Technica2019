package com.example.currentplacedetailsonmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class chose_activity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.chose_activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_activity);
        Intent intent = getIntent();
        String message = intent.getStringExtra(choseCountry.EXTRA_MESSAGE);
    }
    public void goScotland(View view) {
        Intent intent = new Intent(this, CulturalTraditions.class);
        startActivity(intent);
        String Message = message;
        intent.putExtra(EXTRA_MESSAGE, Message);
        startActivity(intent);
    }
    public void goChina(View view) {
        Intent intent = new Intent(this, CulturalTraditions.class);
        startActivity(intent);
        String Message = message;
        intent.putExtra(EXTRA_MESSAGE, Message);
        startActivity(intent);
    }

}
