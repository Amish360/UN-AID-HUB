package com.example.unaidhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private View welcomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_1);

        welcomeButton = findViewById(R.id.welcome_button);
        welcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcomeScreen2();
            }
        });
    }

    public void welcomeScreen2() {
        Intent intent = new Intent(this, welcome_2.class);
        startActivity(intent);
    }
}
