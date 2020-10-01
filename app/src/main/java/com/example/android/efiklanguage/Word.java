package com.example.android.efiklanguage;

/**
 *{@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a deafault translation and aan Efik tarnslation for that word.
 */

public class Word {

    //Default translation for the word
    private String mDefaultTranslation;

    //Efik translation for the word
    private String mEfikTranslation;

    public Word(String defaultTranslation, String efikTranslation){
        mDefaultTranslation = defaultTranslation;
        mEfikTranslation = efikTranslation;
    }

    /**
     * Get the default transaction of the word.
     */

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the Efik translation
     */

    public String getEfikTranslation(){
        return mEfikTranslation;
    }
}

