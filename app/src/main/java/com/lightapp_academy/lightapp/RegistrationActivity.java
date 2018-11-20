package com.lightapp_academy.lightapp;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name;
    EditText lname;
    EditText city;
    EditText age;
    EditText occupation;
    TextView accept;
    TextView cancel;

    SharedPreferences sPref;

    final String SAVED_TEXT = "SAVED_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = findViewById(R.id.registration_name);
        lname = findViewById(R.id.registration_lname);
        city = findViewById(R.id.registration_city);
        age = findViewById(R.id.registration_age);
        occupation = findViewById(R.id.registration_occupation);
        accept = findViewById(R.id.registration_accept);
        cancel = findViewById(R.id.registration_cancel);

        accept.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.registration_accept:
                saveText();
                break;
            case R.id.registration_cancel:
                cancelText();
                break;
            default:
                break;
        }
    }

    public void saveText(){
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sPref.edit();

    }

    public void cancelText(){

    }
}
