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
    public void goTranslate(View view) {
        Intent Intent = new Intent(this, CulturalTraditions.class);
        startActivity(Intent);
    }
    public void goCulture(View view) {
        Intent Intent = new Intent(this, CulturalTraditions.class);
        startActivity(Intent);
    }
    public void goHome(View view) {
        Intent Intent = new Intent(this, MapsActivityCurrentPlace.class);
        startActivity(Intent);
    }

}
