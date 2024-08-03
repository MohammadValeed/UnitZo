package com.example.units;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView, textView2, textView4, valueOfPounds;
    View button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        valueOfPounds = findViewById(R.id.valueOfPounds);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ConvertFromKiloToPound();
            }

            private void ConvertFromKiloToPound() {
                String valueEnteredinKILO = editText.getText().toString();
                double Kilo = Double.parseDouble(valueEnteredinKILO);
                double pounds = Kilo * 2.20462;
                valueOfPounds.setText("" + pounds);}

        });


    }

}


