package com.example.ps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button goBackButton;
    private Button goNextButton;
    private TextView nameView;
    private TextView lastnameView;
    private TextView ageView;
    private TextView dobView;
    private TextView genderView;
    private TextView rulesAcceptView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nameView = findViewById(R.id.nameSubmitted);
        lastnameView = findViewById(R.id.lastnameSubmitted);
        ageView = findViewById(R.id.ageSubmitted);
        dobView = findViewById(R.id.dobSubmitted);
        genderView = findViewById(R.id.genderSubmitted);
        rulesAcceptView = findViewById(R.id.rulesSubmitted);

        Intent intent = getIntent();
        nameView.setText(intent.getStringExtra("nameText"));
        lastnameView.setText(intent.getStringExtra("lastnameText"));
        ageView.setText(intent.getStringExtra("ageText"));
        dobView.setText(intent.getStringExtra("dobText"));
        dobView.setText(intent.getStringExtra("genderText"));
        rulesAcceptView.setText(intent.getStringExtra("rulesAcceptedBoolean"));
    }
}