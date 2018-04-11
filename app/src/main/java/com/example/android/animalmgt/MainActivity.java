package com.example.android.animalmgt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method is called to get correct answer fom question one
    private void answerQuestionOne(){
        RadioGroup questionOne = findViewById(R.id.radio_group_one);
        if (questionOne.getCheckedRadioButtonId() == R.id.answer_question_one_b){
            score += 10;
        }

    }
    // This method is called to get correct answer fom the edit text question.
    private void answerQuestionTwo (){
        EditText questionTwo = findViewById(R.id.answer_question_two);
        String yourResponse = questionTwo.getText().toString();
        if ((yourResponse.equals("ovaprim")) || (yourResponse.equals("Ovaprim"))) {
            score += 10;
        }
    }
    // This method is called to get correct answer from from multiple checkboxes in question three.
    private void answerQuestionThree (){
        CheckBox checkBox3One = findViewById(R.id.answer_three_option_one);
        CheckBox checkBox3Two = findViewById(R.id.answer_three_option_two);
        CheckBox checkBox3Three = findViewById(R.id.answer_three_option_three);
        CheckBox checkBox3Four = findViewById(R.id.answer_three_option_four);
        CheckBox checkBox3Five = findViewById(R.id.answer_three_option_five);
        if((checkBox3One.isChecked())&& !(checkBox3Two.isChecked())&& !(checkBox3Three.isChecked())
                && (checkBox3Four.isChecked())&& (checkBox3Five.isChecked())){
            score += 10;
        }


        // This method is called to get correct answer from from multiple checkboxes in question three.
    }
    private void answerQuestionFour(){
        RadioGroup questionFour = findViewById(R.id.radio_group_two);
        if (questionFour.getCheckedRadioButtonId()== R.id.answer_four_option_four){
            score += 10;
        }

    }
    // This method is called to get correct answer from from multiple checkboxes in question three.
    private void answerQuestionFive () {
        CheckBox checkBox5One = findViewById(R.id.answer_five_option_one);
        CheckBox checkBox5Two = findViewById(R.id.answer_five_option_two);
        CheckBox checkBox5Three = findViewById(R.id.answer_five_option_three);
        CheckBox checkBox5Four = findViewById(R.id.answer_five_option_four);
        if((checkBox5One.isChecked())&&(checkBox5Two.isChecked() &&!(checkBox5Three.isChecked())
                &&(checkBox5Four.isChecked()))){
            score += 10;
        }
    }

    // This method get the correct answer when the radio button is checked.
    private void answerQuestionSix () {
        RadioGroup questionSix = findViewById(R.id.radio_group_three);
        if (questionSix.getCheckedRadioButtonId()== R.id.answer_six_option_two){
            score += 10;
        }

    }

    // This method get the correct answer when the radio button is checked.
    private void answerQuestionSeven () {
        RadioGroup questionSeven = findViewById(R.id.radio_group_four);
        if (questionSeven.getCheckedRadioButtonId()==R.id.answer_seven_option_two){
            score += 10;
        }

    }

    // This method get the correct answer when the radio button is checked.
    private void answerQuestionEight () {
        RadioGroup  questionEight = findViewById(R.id.radio_group_five);
        if (questionEight.getCheckedRadioButtonId() ==R.id.answer_eight_option_three){
            score += 10;
        }

    }

    // This method get the correct answer when the radio button is checked.
    private void answerQuestionNine () {
        RadioGroup questionNine = findViewById(R.id.radio_group_six);
        if (questionNine.getCheckedRadioButtonId() == R.id.answer_nine_option_one){
            score += 10;
        }

    }

    // This method get the correct answer when the radio button is checked.
    private void answerQuestionTen () {
        RadioGroup questionTen = findViewById(R.id.radio_group_seven);
        if (questionTen.getCheckedRadioButtonId() == R.id.answer_ten_option_two){
            score += 10;
        }
    }

    // calculate the score.
    private void calculateScore() {
        score = 0;
        answerQuestionOne();
        answerQuestionTwo();
        answerQuestionThree();
        answerQuestionFour();
        answerQuestionFive();
        answerQuestionSix();
        answerQuestionSeven();
        answerQuestionEight();
        answerQuestionNine();
        answerQuestionTen();
    }
    // This method clear the inputs.
    private void refreshInputs (){
        ((RadioGroup) findViewById(R.id.radio_group_one)).clearCheck();
        ((EditText) findViewById(R.id.answer_question_two)).setText(null);
        ((CheckBox) findViewById(R.id.answer_three_option_one)).setChecked(false);
        ((CheckBox) findViewById(R.id.answer_three_option_two)).setChecked(false);
        ((CheckBox) findViewById(R.id.answer_three_option_three)).setChecked(false);
        ((CheckBox) findViewById(R.id.answer_three_option_four)).setChecked(false);
        ((CheckBox) findViewById(R.id.answer_three_option_five)).setChecked(false);
        ((RadioGroup) findViewById(R.id.radio_group_two)).clearCheck();
        ((CheckBox) findViewById(R.id.answer_five_option_one)).setChecked(false);
        ((CheckBox) findViewById(R.id.answer_five_option_two)).setChecked(false);
        ((CheckBox) findViewById(R.id.answer_five_option_three)).setChecked(false);
        ((CheckBox) findViewById(R.id.answer_five_option_four)).setChecked(false);
        ((RadioGroup) findViewById(R.id.radio_group_three)).clearCheck();
        ((RadioGroup) findViewById(R.id.radio_group_four)).clearCheck();
        ((RadioGroup) findViewById(R.id.radio_group_five)).clearCheck();
        ((RadioGroup) findViewById(R.id.radio_group_six)).clearCheck();
        ((RadioGroup) findViewById(R.id.radio_group_seven)).clearCheck();
        ((EditText) findViewById(R.id.student_name)).setText(null);




    }

    // Executed when the I'm done button is clicked
    public void submitScore (View view) {
        // Ask for Name of the player.
        EditText yourName = findViewById(R.id.student_name);
        String name = yourName.getText().toString();
        //
        calculateScore();
        // display the score Message as a toast.
        String ScoreMessage = name + " You scored" + score ;
        if (score == 100){
            ScoreMessage += " out of 100";
            ScoreMessage += "\n" + " Dammn! you know your shit unlike our president.";
        }
        else if (score < 100 && score > 40 ){
            ScoreMessage += " out of 100";
            ScoreMessage += "\n" + "Awesome";
            ScoreMessage += "\n" + "You are a good Manager";

        } else {
            ScoreMessage += "out of 100";
            ScoreMessage += "\n"+ "Read more books to brush up your skills";
        }
        // toast Message
        Toast toast = Toast.makeText(this, ScoreMessage, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
        // clear inputs fields.
        refreshInputs();

    }

}
