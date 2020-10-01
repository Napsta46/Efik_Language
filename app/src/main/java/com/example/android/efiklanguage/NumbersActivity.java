package com.example.android.efiklanguage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Andy on 10/01/2020.
 */

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "Kiet"));
        words.add(new Word("Two", "iba"));
        words.add(new Word("Three", "ita"));
        words.add(new Word("Four", "Inaŋ"));
        words.add(new Word("Five", "Ition"));
        words.add(new Word("Six", "Itiokiet"));
        words.add(new Word("Seven", "Itiaba"));
        words.add(new Word("Eight", "Itiaita"));
        words.add(new Word("Nine", "Usukkiet"));
        words.add(new Word("Ten", "Duop"));
        words.add(new Word("Twenty", "Edip"));
        words.add(new Word("Thirty", "Edip Ye Duop"));
        words.add(new Word("Forty", "Aba"));
        words.add(new Word("Fifty", "Aba Ye Duop"));
        words.add(new Word("Sixty", "Ata"));
        words.add(new Word("Seventy", "Ata Ye Duop"));
        words.add(new Word("Eighty", "Anaŋ"));
        words.add(new Word("Ninety", "Anaŋ Ye Duop"));
        words.add(new Word("one Hundred", "Ikie"));
        words.add(new Word("one Thousand", "Tɔsin"));


        //Create an {@link WordAdapter}, whose data source is a list of {@link Words}.
        // The Adapter knows how to create list items for each item in the list.

        WordAdapter wordsAdapter = new WordAdapter(this,words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(wordsAdapter);

    }
}
