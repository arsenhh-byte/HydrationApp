package com.example.hydrationapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTotalIntake;
    private int totalIntake = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTotalIntake = findViewById(R.id.textViewTotalIntake);
        Button buttonAddWater = findViewById(R.id.buttonAddWater);
        Button buttonReset = findViewById(R.id.buttonReset);

        buttonAddWater.setOnClickListener(v -> {
            totalIntake += 250; // Adds 250 mL per button press
            textViewTotalIntake.setText("Total Intake: " + totalIntake + " mL");
        });

        buttonReset.setOnClickListener(v -> {
            totalIntake = 0;
            textViewTotalIntake.setText("Total Intake: 0 mL");
        });
    }
}
