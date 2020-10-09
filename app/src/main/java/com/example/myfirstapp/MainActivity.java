package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        // TODO Implement code for button click
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String mesg = editText.getText().toString();

        // Intent intent = new Intent(this, )
    }
}