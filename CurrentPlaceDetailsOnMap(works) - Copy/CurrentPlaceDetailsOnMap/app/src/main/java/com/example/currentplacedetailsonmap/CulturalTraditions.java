package com.example.currentplacedetailsonmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;
import com.example.sqlconnection.helper.HttpJsonParser;

import org.json.JSONException;
import org.json.JSONObject;



public class CulturalTraditions extends AppCompatActivity {

    private String languages;
    private String general_culture;
    private String restaurants;
    private String religion;
    private String memorials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural_traditions);

        //DISCARD VARIABLE, REPLACE WITH REAL ONE
        String country_name = "United States of America";

        //REAL VARIABLES, DON'T DISCARD
        final String COUNTRY_NAME_ID = "country_name";

        HttpJsonParser httpJsonParser = new HttpJsonParser();
        Map<String, String> httpParams = new HashMap<>();
        httpParams.put(COUNTRY_NAME_ID, country_name);

        JSONObject jsonObject = httpJsonParser.makeHttpRequest("http://localhost:8888/cultural/" + "get_movie_details.php", "GET", httpParams);
        try {
            int success = jsonObject.getInt("success");
            JSONObject culture;
            if (success == 1) {
                //Parse the JSON response
                culture = jsonObject.getJSONObject("data");
                languages = culture.getString("languages");
                general_culture = culture.getString("general_culture");
                restaurants = culture.getString("restaurants");
                religion = culture.getString("religion");
                memorials = culture.getString("memorials");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
