package com.example.ps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private Button submitButton;
    private EditText nameValue;
    private EditText lastnameValue;
    private EditText ageValue;
    private EditText dobValue;
    private CheckBox rulesCheckbox;
    private RadioGroup radioGroupValue;
    private RadioButton checkedRadioValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.button);
        nameValue = findViewById(R.id.name);
        lastnameValue = findViewById(R.id.lastname);
        ageValue = findViewById(R.id.age);
        dobValue = findViewById(R.id.dateOfBuy);
        rulesCheckbox = findViewById(R.id.rulesAccept);
        radioGroupValue = findViewById(R.id.radioGroup);

        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), SecondActivity.class);
                myIntent.putExtra("nameText", nameValue.getText().toString());
                myIntent.putExtra("lastnameText", lastnameValue.getText().toString());
                myIntent.putExtra("ageText", ageValue.getText().toString());
                myIntent.putExtra("dobText", dobValue.getText().toString());
                myIntent.putExtra("rulesAcceptedBoolean", rulesCheckbox.isChecked() == true ? "Tak" : "Nie");
                checkedRadioValue = findViewById(radioGroupValue.getCheckedRadioButtonId());
                if(checkedRadioValue != null){
                    myIntent.putExtra("genderText", checkedRadioValue.getText().toString());
                }
                view.getContext().startActivity(myIntent);
            }
        });
    }
}