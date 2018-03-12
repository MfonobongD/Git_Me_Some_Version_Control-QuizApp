package com.example.mfonobongumondia.gitgithub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button startQuiz;
    Button quitQuiz;
    EditText editName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startQuiz = findViewById(R.id.startQuiz);
        quitQuiz = findViewById(R.id.quitQuiz);

        editName = (EditText) findViewById(R.id.editName);


    }

    public void startQuiz(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("Name", editName.getText().toString());
        Editable userName = editName.getText();
        String answer = userName.toString();

        if (answer.isEmpty()){

            Toast.makeText(getApplicationContext(), "Please Enter your Name", Toast.LENGTH_LONG).show();
        }
        else {

            startActivity(intent);
        }

    }

    public void quit(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        System.exit(0);
    }
}