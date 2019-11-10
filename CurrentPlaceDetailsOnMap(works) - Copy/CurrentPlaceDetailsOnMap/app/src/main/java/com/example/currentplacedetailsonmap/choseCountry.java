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
        Intent intent = new Intent(this, chose_activity.class);
        startActivity(intent);
        String message = scotland;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void goChina(View view) {
        Intent intent = new Intent(this, chose_activity.class);
        startActivity(intent);
        String message = china;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
