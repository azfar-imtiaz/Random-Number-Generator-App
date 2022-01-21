package com.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        TextView resultsTextView = findViewById(R.id.resultsTextView);
        SeekBar seekBar = findViewById(R.id.seekBar);

        View.OnClickListener rollButtonClickListener = view -> {
            Random rand = new Random();
            Integer randomNumber;
            if (seekBar.getProgress() == 0)
                randomNumber = 1;
            else
                randomNumber = rand.nextInt(seekBar.getProgress()) + 1;
            resultsTextView.setText(randomNumber.toString());
        };
        rollButton.setOnClickListener(rollButtonClickListener);
    }
}