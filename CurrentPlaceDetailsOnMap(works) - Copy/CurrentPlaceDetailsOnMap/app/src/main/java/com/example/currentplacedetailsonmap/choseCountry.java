package com.example.currentplacedetailsonmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class choseCountry extends AppCompatActivity {
    String scotland;
    String china;
    public static final String EXTRA_MESSAGE = "com.example.currentplacedetailsonmap";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_country);
        scotland = "Scotland";
        china = "China";
    }
    public void goScotland(View view) {
        Intent intent = new Intent(this, Choose_Scot.class);
        startActivity(intent);
    }
    public void goChina(View view) {
        Intent intent = new Intent(this, Choose_chin.class);
        startActivity(intent);
    }
    public void goHome(View view) {
        Intent Intent = new Intent(this, MapsActivityCurrentPlace.class);
        startActivity(Intent);
    }
}
