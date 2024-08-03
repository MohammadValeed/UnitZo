package com.example.loginpage;

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
    EditText e1,e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.email);
        e2 = (EditText) findViewById(R.id.pwd);
        b1 = (Button) findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString();
                String pwd = e2.getText().toString();
                if(email.equals("admin@example.com") && pwd.equals("rtWi2p_10")){
                    Toast.makeText(MainActivity.this, "Redirecting...", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(MainActivity.this, "Wrong Credentials.", Toast.LENGTH_SHORT).show();
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}