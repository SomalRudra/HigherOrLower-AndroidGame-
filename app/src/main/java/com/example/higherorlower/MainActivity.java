package com.example.higherorlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randnum;
    int num_of_guess=0;
    public void guess(View view){
        EditText enterNum=(EditText) findViewById(R.id.enterNum);
        int guessednum=Integer.parseInt(enterNum.getText().toString());
        if(guessednum>randnum)
            Toast.makeText(MainActivity.this,"Higher!!",Toast.LENGTH_LONG).show();
        else if(guessednum<randnum)
            Toast.makeText(MainActivity.this,"Lower!!",Toast.LENGTH_LONG).show();
        else{
            Toast.makeText(MainActivity.this,"correct!! Try again",Toast.LENGTH_LONG).show();
            Toast.makeText(MainActivity.this,"You have made "+num_of_guess+" guesses to find the answer.. Try Again",Toast.LENGTH_LONG).show();
            num_of_guess=0;
            Random random=new Random();
            randnum=random.nextInt(20)+1;}
            num_of_guess++;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random=new Random();
        randnum=random.nextInt(20)+1;
    }
}
