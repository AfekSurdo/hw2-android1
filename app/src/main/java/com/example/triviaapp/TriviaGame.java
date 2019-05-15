package com.example.triviaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TriviaGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia_game);

        Intent intent = getIntent();
        String userName = intent.getExtras().getString("userName");

        TextView tv = (TextView)findViewById(R.id.Wellcome);

        tv.setText(userName);
    }
}
