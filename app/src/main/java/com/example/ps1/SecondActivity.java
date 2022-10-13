package com.example.ps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
        goBackButton = findViewById(R.id.backButton);
        goNextButton = findViewById(R.id.nextButton);

        Intent intent = getIntent();
        nameView.setText(intent.getStringExtra("nameText"));
        lastnameView.setText(intent.getStringExtra("lastnameText"));
        ageView.setText(intent.getStringExtra("ageText"));
        dobView.setText(intent.getStringExtra("dobText"));
        genderView.setText(intent.getStringExtra("genderText"));
        rulesAcceptView.setText(intent.getStringExtra("rulesAcceptedBoolean"));

        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), MainActivity.class));
            }
        });

        goNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Nie ma funkcjonalności ze stanami", Toast.LENGTH_SHORT).show();
            }
        });
    }
}