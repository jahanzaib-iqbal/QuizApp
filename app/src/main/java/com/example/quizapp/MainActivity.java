package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String [] questions= {"Java is Object Oriented?","Java is made by MAK?","java is a person?","java is made in python?","java is used for android development?"};
    Boolean [] answers = {true,false,false,false,true};
    TextView questionText;
    Button yes;
    Button no;
    int index =0;
    int score =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionText = findViewById(R.id.questions);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        questionText.setText(questions[index]);

        yes.setOnClickListener(view -> {
            //index is max 4 and its length is 5
            if(index<questions.length){
                if(answers[index]){
                    score++;
                }
                index++;
                if(index<questions.length){
                    questionText.setText(questions[index]);
                }

                else{
                    Toast.makeText(MainActivity.this, "Your Score is "+score, Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
            }
        });

        no.setOnClickListener(view -> {
            //index is max 4 and its length is 5
            if(index<questions.length){
                if(!answers[index]){
                    score++;
                }
                index++;
                if(index<questions.length){
                    questionText.setText(questions[index]);
                }
                else{
                    Toast.makeText(MainActivity.this, "Your Score is "+score, Toast.LENGTH_SHORT).show();
                }
            }

            else{
                Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
            }
        });

    }
}