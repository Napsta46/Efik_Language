package com.example.android.efiklanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //Find the View that shows the number category
        TextView numbers = (TextView)findViewById(R.id.numbers);

        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }

        });

    }
}
