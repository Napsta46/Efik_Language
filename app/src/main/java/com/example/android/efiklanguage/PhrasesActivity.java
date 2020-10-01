package com.example.android.efiklanguage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Andy on 10/01/2020.
 */

public class PhrasesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Welcome", "Emedi"));
        words.add(new Word("Hello", "Mọkọm"));
        words.add(new Word("How are you?", "Idem fo?/Etie didie"));
        words.add(new Word("Reply to 'How are you?' ", " Idem mi ọsọñ"));
        words.add(new Word("Long time no", "see Ikut enyin"));
        words.add(new Word("What's your name? ", "Ekere didie?"));
        words.add(new Word("My name is ...", "Enyin mi edi .../Ekot mi ..."));
        words.add(new Word("Where are you from?", "Oto mmọñ?"));
        words.add(new Word("Respond to Oto mmoñ ", "  I'm from ... Nto ..."));
        words.add(new Word("Pleased to meet you", "Enem mi ndi kut fi"));
        words.add(new Word("Good morning", "(Morning greeting) Emesiere/Emesiere nde (reply)"));
        words.add(new Word("Good afternoon ", "(Afternoon greeting) Mọkọm/Ekọm do"));
        words.add(new Word("Good evening ", "(Evening greeting) Mọkọm/Ekọm do"));
        words.add(new Word("Good night", "Esiere/ Esiere Nde (reply)"));
        words.add(new Word("Goodbye", "  Ka di/(Parting phrases) Tie suñ"));
        words.add(new Word("Do you speak English? ", "Emesem ikọ mbakara?"));
        words.add(new Word("I don't understand", "Inwañake mi"));
        words.add(new Word("Do you understand?", "Anwaña fi?"));
        words.add(new Word("I don't know", " Ndiọnọke"));
        words.add(new Word("I love you ", "Mme ama fi"));
        words.add(new Word("How do you say ... in Efik", "Didie ke afo edọhọ ke usem Efik?"));


        //Create an {@link WordAdapter}, whose data source is a list of {@link Words}.
        // The Adapter knows how to create list items for each item in the list.

        WordAdapter wordsAdapter = new WordAdapter(this,words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list file.

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(wordsAdapter);

    }
}
