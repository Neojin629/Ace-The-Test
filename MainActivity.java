package com.example.android.acethetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText name;


    private int correctAnswers = 0;  //number of correct answers
    boolean question1Result; //determine if question 1 is correct.
    boolean question2Result; //determine if question 2 is correct.
    boolean question3Result; //determine if question 3 is correct.
    boolean question4Result; //determine if question 4 is correct.
    boolean question5Result; //determine if question 5 is correct.
    boolean question6Result; //determine if question 6 is correct.
    boolean question7Result; //determine if question 7 is correct.
    boolean question8Result; //determine if question 8 is correct.
    boolean question9Result; //determine if question 9 is correct.
    boolean question10Result; //determine if question 10 is correct.


    TextView resultSummary;

    RadioGroup question1Group;
    int question1ID;
    RadioButton question1Ans;

    RadioGroup question2Group;
    int question2ID;
    RadioButton question2Ans;

    RadioGroup question3Group;
    int question3ID;
    RadioButton question3Ans;

    RadioGroup question4Group;
    int question4ID;
    RadioButton question4Ans;

    RadioGroup question5Group;
    int question5ID;
    RadioButton question5Ans;

    RadioGroup question6Group;
    int question6ID;
    RadioButton question6Ans;

    RadioGroup question7Group;
    int question7ID;
    RadioButton question7Ans;

    RadioGroup question8Group;
    int question8ID;
    RadioButton question8Ans;

    CheckBox question9Ans1;
    CheckBox question9Ans2;
    CheckBox question9Ans3;
    CheckBox question9Ans4;

    RadioGroup question10Group;
    int question10ID;
    RadioButton question10Ans;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initializeViews();
    }

    public void initializeViews() {
        //Initialize Name
        name = findViewById(R.id.name_description_view);
        //Initialize Quiz Summary
        resultSummary = findViewById(R.id.your_answers);
        //Initialize Question 1 elements
        question1Group = findViewById(R.id.question1ID);
        question1Ans =  findViewById(R.id.george_washington);

        //Initialize Question 2 elements
        question2Group = findViewById(R.id.question2ID);
        question2Ans = findViewById(R.id.july_4th_1776);

        //Initialize Question 3 elements
        question3Group = findViewById(R.id.question3ID);
        question3Ans = findViewById(R.id.the_constitution);

        //Initialize Question 4 elements
        question4Group = findViewById(R.id.question4ID);
        question4Ans = findViewById(R.id.congress);

        //Initialize Question 5 elements
        question5Group = findViewById(R.id.question5ID);
        question5Ans = findViewById(R.id.april_15th);

        //Initialize Question 6 elements
        question6Group = findViewById(R.id.question6ID);
        question6Ans = findViewById(R.id.italy);

        //Initialize Question 7 elements
        question7Group = findViewById(R.id.question7ID);
        question7Ans = findViewById(R.id.franklin_roosevelt);

        //Initialize Question 8 elements
        question8Group = findViewById(R.id.question8ID);
        question8Ans = findViewById(R.id.alaska);

        //Initialize Question 9 elements

        question9Ans1 = findViewById(R.id.great_food);
        question9Ans2 = findViewById(R.id.vacation);
        question9Ans3 = findViewById(R.id.escape_persecution);
        question9Ans4 = findViewById(R.id.economic_opportunity);

        //Initialize Question 10 elements
        question10Group = findViewById(R.id.question10ID);
        question10Ans = findViewById(R.id.one_hundred);

    }

    public void submitAnswers(View view) {

        //Question 1

        question1ID = question1Group.getCheckedRadioButtonId();
        if (question1ID == question1Ans.getId()) {
            question1Result = true;
            correctAnswers += 1;
        }

        //Question 2

        question2ID = question2Group.getCheckedRadioButtonId();
        if (question2ID == question2Ans.getId()) {
            question2Result = true;
            correctAnswers += 1;
        }

        //Question 3

        question3ID = question3Group.getCheckedRadioButtonId();
        if (question3ID == question3Ans.getId()) {
            question3Result = true;
            correctAnswers += 1;
        }

        //Question 4

        question4ID = question4Group.getCheckedRadioButtonId();
        if (question4ID == question4Ans.getId()) {
            question4Result = true;
            correctAnswers += 1;
        }

        //Question 5

        question5ID = question5Group.getCheckedRadioButtonId();
        if (question5ID == question5Ans.getId()) {
            question5Result = true;
            correctAnswers += 1;
        }

        //Question 6

        question6ID = question6Group.getCheckedRadioButtonId();
        if (question6ID == question6Ans.getId()) {
            question6Result = true;
            correctAnswers += 1;
        }

        //Question 7

        question7ID = question7Group.getCheckedRadioButtonId();
        if (question7ID == question7Ans.getId()) {
            question7Result = true;
            correctAnswers += 1;
        }

        //Question 8

        question8ID = question8Group.getCheckedRadioButtonId();
        if (question8ID == question8Ans.getId()) {
            question8Result = true;
            correctAnswers += 1;
        }

        //Question 9

        boolean question9Ans1Selected = question9Ans1.isChecked();
        boolean question9Ans2Selected = question9Ans2.isChecked();
        boolean question9Ans3Selected = question9Ans3.isChecked();
        boolean question9Ans4Selected = question9Ans4.isChecked();

        if (question9Ans3Selected && question9Ans4Selected) {
            question9Result = true;
            correctAnswers = correctAnswers + 1;

        }

        //Question 10

        question10ID = question10Group.getCheckedRadioButtonId();
        if (question10ID == question10Ans.getId()) {
            question10Result = true;
            correctAnswers += 1;
        }

        //Toast message including score and message

        if (correctAnswers >= 7) {
            Toast.makeText(getBaseContext(), name.getText().toString()+"!" + "\n" + "Great Work!  Your score is:  " + correctAnswers + " out of 10!",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getBaseContext(), name.getText().toString()+"!" + "\n" + "Try Again. Your score is: " + correctAnswers + " out of 10!",
                    Toast.LENGTH_LONG).show();
        }


        //Summary Text Display

        createAnswersSummary();

        //Rest correct answers to 0

        correctAnswers = 0;

        //Reset result booleans to false

        question1Result = false;
        question2Result = false;
        question3Result = false;
        question4Result = false;
        question5Result = false;
        question5Result = false;
        question6Result = false;
        question7Result = false;
        question8Result = false;
        question9Result = false;
        question10Result = false;
    }

    //Creates summary of quiz results

    private void createAnswersSummary() {
        String summaryMessage = "Results:\n\n";


        if (question1Result) {
            summaryMessage += getString(R.string.question_1) + "\nCorrect: " + getString(R.string.george_washington)+ "\n\n";
        } else {
            summaryMessage += getString(R.string.question_1) + "\nIncorrect \n\n";

        }

        if (question2Result) {
            summaryMessage += getString(R.string.question_2) + "\nCorrect: " + getString(R.string.july_4th_1776)+"\n\n";
        } else {
            summaryMessage += getString(R.string.question_2) + "\nIncorrect \n\n";

        }

        if (question3Result) {
            summaryMessage += getString(R.string.question_3) + "\nCorrect: " + getString(R.string.the_constitution)+"\n\n";
        } else {
            summaryMessage += getString(R.string.question_3) + "\nIncorrect \n\n";
        }

        if (question4Result) {
            summaryMessage += getString(R.string.question_4) + "\nCorrect: " + getString(R.string.congress)+"\n\n";
        } else {
            summaryMessage += getString(R.string.question_4) + "\nIncorrect \n\n";
        }

        if (question5Result) {
            summaryMessage += getString(R.string.question_5) + "\nCorrect: " + getString(R.string.april_15th)+"\n\n";
        } else {
            summaryMessage += getString(R.string.question_5) + "\nIncorrect \n\n";

        }

        if (question6Result) {
            summaryMessage += getString(R.string.question_6) + "\nCorrect: " + getString(R.string.italy)+"\n\n";
        } else {
            summaryMessage += getString(R.string.question_6) + "\nIncorrect\n\n";

        }

        if (question7Result) {
            summaryMessage += getString(R.string.question_7) + "\nCorrect: " + getString(R.string.franklin_roosevelt)+"\n\n";

        } else {
            summaryMessage += getString(R.string.question_7) + "\nIncorrect \n\n";

        }

        if (question8Result) {
            summaryMessage += getString(R.string.question_8) + "\nCorrect: " + getString(R.string.alaska)+"\n\n";
        } else {
            summaryMessage += getString(R.string.question_8) + "\nIncorrect \n\n";

        }

        if (question9Result) {
            summaryMessage += getString(R.string.question_9) + "\nCorrect: " + getString(R.string.escape_persecution);
            summaryMessage += "\nCorrect: " + getString(R.string.economic_opportunity)+"\n\n";
        } else {
            summaryMessage += getString(R.string.question_9) + "\nIncorrect \n\n";

        }

        if (question10Result) {
            summaryMessage += getString(R.string.question_10) + "\nCorrect: " + getString(R.string._100)+"\n\n";

        } else {
            summaryMessage += getString(R.string.question_10) + "\nIncorrect \n\n";

        }

        resultSummary.setText(summaryMessage);

    }

    public void resetQuiz (View view) {
        //Clears all answers and resets quiz

        question1Group.clearCheck();
        question2Group.clearCheck();
        question3Group.clearCheck();
        question4Group.clearCheck();
        question5Group.clearCheck();
        question6Group.clearCheck();
        question7Group.clearCheck();
        question8Group.clearCheck();
        question9Ans1.setChecked(false);
        question9Ans2.setChecked(false);
        question9Ans3.setChecked(false);
        question9Ans4.setChecked(false);
        question10Group.clearCheck();
        resultSummary.setText(R.string.results);

    }

    
}

