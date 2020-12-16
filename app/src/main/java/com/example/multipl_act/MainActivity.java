package com.example.multipl_act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button sendb;
    EditText login, name, surname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendb=(Button) findViewById(R.id.send);
        login=(EditText) findViewById(R.id.input);
        name=(EditText) findViewById(R.id.input2);
        surname=(EditText) findViewById(R.id.input3);
        sendb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.send:
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("message", "Login= " +login.getText()+"\n"+"Name= "+name.getText()+"\n"+"Surname= "+surname.getText());
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}