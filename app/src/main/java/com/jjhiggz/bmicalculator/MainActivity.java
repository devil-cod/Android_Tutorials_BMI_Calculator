package com.jjhiggz.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resultText = findViewById(R.id.text_view_result);

        EditText yourAge = findViewById( R.id.edit_text_age );
        EditText yourFeet = findViewById(R.id.edit_text_feet);
        EditText yourInches = findViewById(R.id.edit_text_inches);
        EditText yourWeight = findViewById(R.id.edit_text_weight);

        RadioButton maleButton = findViewById(R.id.radio_button_male);
        RadioButton femaleButton = findViewById(R.id.radio_button_female);

        Button calculateButton = findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Cool I made this thing popo up by clicking a button", Toast.LENGTH_LONG).show();
            }
        });

        resultText.setText("I can change my text view using programming code");



    }



}