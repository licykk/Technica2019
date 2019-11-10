package com.example.currentplacedetailsonmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Choose_Scot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose__scot);
    }
    public void goTranslate(View view) {
        Intent Intent = new Intent(this, Translations_Scotland.class);
        startActivity(Intent);
    }
    public void goCulture(View view) {
        Intent Intent = new Intent(this, Culture_Scotland.class);
        startActivity(Intent);
    }
    public void goHome(View view) {
        Intent Intent = new Intent(this, MapsActivityCurrentPlace.class);
        startActivity(Intent);
    }
}
