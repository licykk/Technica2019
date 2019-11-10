
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

import javazoom.jl.decoder.JavaLayerException;

public class TranslatorTest {
    Translator translator = Translator.getInstance();

    @Test
    public void testTranslateText() {
        String text = translator.translate("I am programmer", Language.ENGLISH, Language.PORTUGUESE);
        assertEquals("Eu sou programador", text);
    }
    
  
    /*public void testDetectLanguage() {
        String language = translator.detect("Hello World");
        assertEquals("en", language);
    }

    @Test
    public void testPlayingAudio() throws IOException, JavaLayerException {
        Audio audio = Audio.getInstance();
        InputStream sound = audio.getAudio("你好世界", Language.CHINESE_SIMPLIFIED);
        audio.play(sound);

        assertTrue(sound != null);
    }*/


}