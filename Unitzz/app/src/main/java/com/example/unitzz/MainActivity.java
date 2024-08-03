package com.example.unitzz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.email);
        e2 = (EditText) findViewById(R.id.pwd);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString();
                String pwd = e2.getText().toString();

                // Implement proper login logic here (e.g., database check)
                if (email.equals("valeed@gmail.com") && pwd.equals("123456")) {
                    Toast.makeText(MainActivity.this, "Redirecting...", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Wrong Credentials.", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}