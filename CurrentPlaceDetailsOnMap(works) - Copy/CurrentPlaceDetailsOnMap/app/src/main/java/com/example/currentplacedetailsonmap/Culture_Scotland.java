package com.example.currentplacedetailsonmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Culture_Scotland extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture__scotland);
    }public void goHome(View view) {
        Intent Intent = new Intent(this, MapsActivityCurrentPlace.class);
        startActivity(Intent);
    }

}
