package com.example.multipl_act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        if(intent.hasExtra("message")){
        String message = intent.getStringExtra("message");
        msg=(TextView) findViewById(R.id.textView);
        msg.setText(message);
        }
    }
}