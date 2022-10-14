package com.example.ps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class ThirdActivity extends AppCompatActivity {
    private TextView benc;
    String benc2;
    private Button backButton;

    @Override
    protected void onStart() {
        this.benc2 = benc2 + new Date() + " 1 \n";
        super.onStart();
        if(benc2 != null){
            benc.setText(benc2);
        }
    }

    @Override
    protected void onResume() {
        this.benc2 = benc2 + new Date() + " 2 \n";
        super.onResume();
        if(benc2 != null){
            benc.setText(benc2);
        }
    }

    @Override
    protected void onPause() {
        this.benc2 = benc2 + new Date() + " 3 \n";
        super.onPause();
        if(benc2 != null){
            benc.setText(benc2);
        }
    }

    @Override
    protected void onStop() {
        this.benc2 = benc2 + new Date() + " 4 \n";
        super.onStop();
        if(benc2 != null){
            benc.setText(benc2);
        }
    }

    @Override
    protected void onDestroy() {
        this.benc2 = benc2 + new Date() + " 5 \n";
        super.onDestroy();
        if(benc2 != null){
            benc.setText(benc2);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.benc2 = benc2 + new Date() + " onCreate \n";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        benc = findViewById(R.id.status);
        if(benc2 != null){
            benc.setText(benc2);
        }

        backButton = findViewById(R.id.backButtonThirdActivity);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), SecondActivity.class));
            }
        });
    }


}