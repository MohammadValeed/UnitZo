package com.example.unitzz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private EditText kiloInput;
    private TextView resultTextView;
    private Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        EdgeToEdge.enable(this);

        kiloInput = findViewById(R.id.kiloInput);
        resultTextView = findViewById(R.id.valueofPounds); // Assuming this is the TextView for result
        convertButton = findViewById(R.id.button2);
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
                resultTextView.setText(String.format("%.2f Pounds", pounds)); // Display with unit
            } catch (NumberFormatException e) {
                resultTextView.setText("Invalid input");
            }
        } else {
            resultTextView.setText("Enter a value");
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}