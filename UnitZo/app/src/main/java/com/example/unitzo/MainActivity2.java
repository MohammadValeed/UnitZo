package com.example.unitzo;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.unitzo.R;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText kiloInput;
    private TextView resultTextView;
    private Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable EdgeToEdge after setting content view
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);

        kiloInput = findViewById(R.id.editText);
        resultTextView = findViewById(R.id.valueOfPounds); // Assuming this is the TextView for result
        convertButton = findViewById(R.id.button);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertKiloToPound();
            }
        });
    }

    private void convertKiloToPound() {
        String kiloString = kiloInput.getText().toString();
        if (!kiloString.isEmpty()) {
            try {
                double kilos = Double.parseDouble(kiloString);
                double pounds = kilos * 2.20462;
                resultTextView.setText(String.format("%.2f pounds", pounds)); // Display with unit
            } catch (NumberFormatException e) {
                resultTextView.setText("Invalid input");
            }
        } else {
            resultTextView.setText("Enter a value");
 }
}}
