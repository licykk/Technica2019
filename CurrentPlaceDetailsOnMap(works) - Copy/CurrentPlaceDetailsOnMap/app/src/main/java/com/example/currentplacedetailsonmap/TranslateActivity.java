package com.example.currentplacedetailsonmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TranslateActivity extends AppCompatActivity {

    private String[] common_phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        common_phrases = new String[] {"Good morning", "Good afternoon", "Good evening", "Hello", "How are you?",
                "I would like", "Where is the restroom?", "What time is my flight?", "What time is it?", "Where is the currency exchange?",
                "Where is the bus stop?", "Do you know where this hotel is?", "I don’t understand", "How do you get to ____?",
                "May I see a menu?", "Help!"};

        String[] common_phrases_sp = new String[] {"Zǎoshang hǎo”,“xiàwǔ hǎo”,“wǎnshàng hǎo”,“nǐ hǎo”,“nǐ hǎo ma?", "Wǒ xiǎng yào”,“xǐshǒujiān zài nǎlǐ?”,“Wǒ de hángbān zài jǐ diǎn?”,“Xiànzài jǐ diǎn?","Huòbì duìhuàn zài nǎlǐ?", "Gōngjiāo chē zhàn zài nǎlǐ?","Nín zhīdào zhè jiā jiǔdiàn zài nǎlǐ ma?","Wǒ bù míngbái”,“rúhé dàodá____?", "Wǒ kěyǐ chákàn càidān ma?”,“Bāngzhù!"};

        String[] common_phrases_ga = new String[] {"Madainn mhath", "Feasgar math", "Feasgar math", "Halò", "Ciamar a tha thu?", "Bu mhath leam", "Càit a bheil an seòmar-fois?", "Dè an uair a tha an turas-adhair agam?", "Dè an uair a tha e?", "Càit a bheil an iomlaid airgead?", "Càit a bheil stad a’ bhus? ", "A bheil fios agad càite a bheil an taigh-òsta seo?", "Chan eil mi a ’tuigsinn", "Ciamar a ruigeas tu ____?", "Am faic mi clàr?", "Cuidich!"};
    }
    public void goHome(View view) {
        Intent Intent = new Intent(this, MapsActivityCurrentPlace.class);
        startActivity(Intent);
    }
}
