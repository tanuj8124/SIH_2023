package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openLoginPage(View view){
        Intent intent= new Intent(this, loginpage.class);
        startActivity(intent);
    }

    public void openRozgarMela(View view){
        Intent intent= new Intent(this, rozgarmela.class);
        startActivity(intent);
    }

    public void openJobSeekerRegistration(View view){
        Intent intent= new Intent(this, jobseekerregistration.class);
        startActivity(intent);
    }
    public void openEmployerRegistration(View view){
        Intent intent=new Intent(this, employerregister.class);
        startActivity(intent);

    }
    public void openAi(View view){
        Intent intent=new Intent(this, kartavya.class);
        startActivity(intent);
}}