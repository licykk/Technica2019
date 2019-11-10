package com.example.currentplacedetailsonmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        String[] common_phrases_sp = new String[] {"Buenos días", "Buenas tardes", "Buenas noches", "Hola", "¿Cómo estás?",
                "Me gustaría", "¿Dónde está el baño?", "¿A qué hora es mi vuelo?", "¿Qué hora es?", "¿Dónde está el cambio de divisas?",
                "¿Dónde está la parada de autobús?", "¿Sabes dónde está este hotel?", "No entiendo", "¿Cómo llegas a ____?",
                "¿Puedo ver un menú?", "¡Ayuda!"};

        String[] common_phrases_ga = new String[] {"Madainn mhath", "Feasgar math", "Feasgar math", "Halò", "Ciamar a tha thu?",
                "Bu mhath leam", "Càit a bheil an seòmar-fois?", "Dè an uair a tha an turas-adhair agam?", "Dè an uair a tha e?", "Càit a bheil an iomlaid airgead?",
                "Càit a bheil stad a’ bhus? ", "A bheil fios agad càite a bheil an taigh-òsta seo?", "Chan eil mi a ’tuigsinn", "Ciamar a ruigeas tu ____?",
                "Am faic mi clàr?", "Cuidich!"};
    }
}
