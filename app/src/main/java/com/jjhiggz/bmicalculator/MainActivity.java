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

    // class variables are also called "fields"
    private TextView resultText;
    private EditText yourAge;
    private EditText yourFeet;
    private EditText yourInches;
    private EditText yourWeight;
    private RadioButton maleButton;
    private RadioButton femaleButton;
    private Button calculateButton;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupButtonClickListener();
    }


    private void findViews(){

        resultText = findViewById(R.id.text_view_result);
        yourAge = findViewById( R.id.edit_text_age );
        yourFeet = findViewById(R.id.edit_text_feet);
        yourInches = findViewById(R.id.edit_text_inches);
        yourWeight = findViewById(R.id.edit_text_weight);

        maleButton = findViewById(R.id.radio_button_male);
        femaleButton = findViewById(R.id.radio_button_female);
        calculateButton = findViewById(R.id.calculate_button);

    }


    private void setupButtonClickListener() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        int age = parse(yourAge.getText().toString());
        int feet = parse(yourFeet.getText().toString());
        int inches = parse(yourInches.getText().toString());
        float weight = getPounds(
               parse(
                       yourWeight.getText().toString()
               )
        );
        float heightInMeters = getHeightInMeters(inches,feet);
        resultText.setText( String.valueOf(weight / (heightInMeters * heightInMeters)) );

    }

    private int parse( String string){
        return Integer.parseInt(string);
    }

    private float getPounds( int kg ){

        return kg / (float)2.20462;
    };
    private float getHeightInMeters( int inches , int feet){
        int totalInches = inches + feet * 12;
        return totalInches* (float)0.0254;

    }




}