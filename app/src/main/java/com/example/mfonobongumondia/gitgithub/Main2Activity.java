package com.example.mfonobongumondia.gitgithub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;

public class Main2Activity extends AppCompatActivity {

    int score = 0;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = getIntent().getExtras().getString("Name");
        Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG).show();

    }

    public void submit(View view) {

        boolean answer1 =  answern1();
        boolean answer2 =  answern2();
        boolean answer3 =  answern3();
        boolean answer4 =  answern4();
        boolean answer5 =  answern5();
        boolean answer6 =  answern6();
        boolean answer7 =  answern7();
        boolean answer8 =  answern8();
        boolean answer9 =  answern9();
        boolean answer10 = answern10();
        boolean answer11 = answern11();
        boolean answer12 = answern12();
        boolean answer13 = answern13();
        boolean answer14 = answern14();
        boolean answer15 = answern15();
        boolean answer16 = answern16();
        boolean answer17 = answern17();
        boolean answer18 = answern18();

        answern19();
        answern20();
        answern21();
        answern22();




        int theScore = calculateScore(answer2, answer4, answer7, answer12, answer13, answer16);
        String scoreMessage = createAccessSummary (name, theScore);
        Toast.makeText(this, scoreMessage, Toast.LENGTH_SHORT).show();

        score = 0;

    }
    public void resetButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


    private boolean answern1() {
        RadioButton myAnswer = findViewById(R.id.radio1);
        boolean answern1 = myAnswer.isChecked();
        return answern1;
    }

    private boolean answern2() {
        RadioButton myAnswer = findViewById(R.id.radio2);
        boolean answern2 = myAnswer.isChecked();
        return answern2;
    }

    private boolean answern3() {
        RadioButton myAnswer = findViewById(R.id.radio3);
        boolean answern3 = myAnswer.isChecked();
        return answern3;
    }

    private boolean answern4() {
        RadioButton myAnswer = findViewById(R.id.radio4);
        boolean answern4 = myAnswer.isChecked();
        return answern4;
    }

    private boolean answern5() {
        RadioButton myAnswer = findViewById(R.id.radio5);
        boolean answern5 = myAnswer.isChecked();
        return answern5;
    }

    private boolean answern6() {
        RadioButton myAnswer = findViewById(R.id.radio6);
        boolean answern6 = myAnswer.isChecked();
        return answern6;
    }

    private boolean answern7() {
        RadioButton myAnswer = findViewById(R.id.radio7);
        boolean answern7 = myAnswer.isChecked();
        return answern7;
    }

    private boolean answern8() {
        RadioButton myAnswer = findViewById(R.id.radio8);
        boolean answern8 = myAnswer.isChecked();
        return answern8;
    }

    private boolean answern9() {
        RadioButton myAnswer = findViewById(R.id.radio9);
        boolean answern9 = myAnswer.isChecked();
        return answern9;
    }

    private boolean answern10() {
        RadioButton myAnswer = findViewById(R.id.radio10);
        boolean answern10 = myAnswer.isChecked();
        return answern10;
    }

    private boolean answern11() {
        RadioButton myAnswer = findViewById(R.id.radio11);
        boolean answern11 = myAnswer.isChecked();
        return answern11;
    }

    private boolean answern12() {
        RadioButton myAnswer = findViewById(R.id.radio12);
        boolean answern12 = myAnswer.isChecked();
        return answern12;
    }
    private boolean answern13() {
        RadioButton myAnswer = findViewById(R.id.radio13);
        boolean answern13 = myAnswer.isChecked();
        return answern13;
    }
    private boolean answern14() {
        RadioButton myAnswer = findViewById(R.id.radio14);
        boolean answern14 = myAnswer.isChecked();
        return answern14;
    }
    private boolean answern15() {
        RadioButton myAnswer = findViewById(R.id.radio15);
        boolean answern15 = myAnswer.isChecked();
        return answern15;
    }
    private boolean answern16() {
        RadioButton myAnswer = findViewById(R.id.radio16);
        boolean answern16 = myAnswer.isChecked();
        return answern16;
    }
    private boolean answern17() {
        RadioButton myAnswer = findViewById(R.id.radio17);
        boolean answern17 = myAnswer.isChecked();
        return answern17;
    }
    private boolean answern18() {
        RadioButton myAnswer = findViewById(R.id.radio18);
        boolean answern18 = myAnswer.isChecked();
        return answern18;
    }

    private void answern19() {
        CheckBox checkBox1 = findViewById(R.id.checkbox1);
        CheckBox checkBox2 = findViewById(R.id.checkbox2);
        CheckBox checkBox3 = findViewById(R.id.checkbox3);

        if (!checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked()) {
            score = score + 10;
        } else{
            score = score + 0;
        }

    }
    private void answern20() {
        CheckBox checkBox4 = findViewById(R.id.checkbox4);
        CheckBox checkBox5 = findViewById(R.id.checkbox5);
        CheckBox checkBox6 = findViewById(R.id.checkbox6);

        if (!checkBox4.isChecked() && checkBox5.isChecked() && checkBox6.isChecked()) {
            score = score + 10;
        } else{
            score = score + 0;
        }
    }
    public void answern21(){
        EditText editText1 = findViewById(R.id.editText1);
        String editEntry = editText1.getText().toString();
        Log.d("TAG", editEntry);

        String answer = "git clone <url>";
        if(editEntry.equals(answer)){
            score = score + 10;
        } else{
            score = score + 0;
        }
    }

    public void answern22(){
        EditText editText2 = findViewById(R.id.editText2);
        String editEntry = editText2.getText().toString();
        Log.d("TAG", editEntry);

        String answer = "git lab coat";
        if(editEntry.equals(answer)){
            score = score + 10;
        } else{
            score = score + 0;
        }
    }

    private int calculateScore(boolean answer2, boolean answer4, boolean answer7,
                               boolean answer12, boolean answer13, boolean answer16) {
        if (answern2()) {
            score = score + 10;
        }
        if (answern4()) {
            score = score + 10;
        }
        if (answern7()) {
            score = score + 10;
        }
        if (answern12()) {
            score = score + 10;
        }
        if (answern13()) {
            score = score + 10;
        }
        if (answern16()) {
            score = score + 10;
        }
        return score;

    }

    private String createAccessSummary(String name, int score) {
        String scoreMessage = "Name : " + name;
        scoreMessage = scoreMessage + "\n TOTAL SCORE " + score + "%";
        scoreMessage = scoreMessage + "\n Thanks for participating ";
        return scoreMessage;
    }

}


