package com.example.youssefalaa.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int Score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


public void Submit(View view) {

    RadioButton firstRightAns_q1 = (RadioButton) findViewById(R.id.q1_firstRAns);
    boolean trueAns_q1 = firstRightAns_q1.isChecked();

    RadioButton firstRightAns_q2 = (RadioButton) findViewById(R.id.q2_firstRAns);
    boolean trueAns_q2 = firstRightAns_q2.isChecked();

    RadioButton firstRightAns_q3 = (RadioButton) findViewById(R.id.q3_firstRAns);
    boolean trueAns_q3 = firstRightAns_q3.isChecked();

    CheckBox firstRightAns_q4 = (CheckBox) findViewById(R.id.q4_firstRans);
    boolean trueAns_q4 = firstRightAns_q4.isChecked();

    CheckBox secRightAns_q4 = (CheckBox) findViewById(R.id.q4_secRans);
    boolean trueans_q4 = secRightAns_q4.isChecked();

    CheckBox firstFalseAns_q4 = (CheckBox) findViewById(R.id.q4_firstFans);
    boolean falseAns_q4 = firstFalseAns_q4.isChecked();

    EditText Text = (EditText) findViewById(R.id.q5);
    String q5_ans = Text.getText().toString();

    int Score=claculateScore(trueAns_q1,trueAns_q2,trueAns_q3,trueAns_q4,trueans_q4,falseAns_q4,q5_ans);
    if(Score == 5) {
        Toast.makeText(getApplicationContext(), Score + "\n well Done", Toast.LENGTH_SHORT).show();
    }
    else
    {
        Toast.makeText(getApplicationContext(), Score + "\n Not good ", Toast.LENGTH_SHORT).show();
    }
    this.Score = 0;
}
    public int claculateScore(boolean Ten,boolean Multilevel_inheritance,boolean False,boolean JAVA ,boolean PYTHON ,boolean OPERA,String text) {
        String q5 = "Cairo" ;

        if(Ten)
        {Score = Score + 1;}

        if(Multilevel_inheritance)
        {Score = Score + 1;}

       if(False)
        {Score = Score + 1;}

       if(JAVA || PYTHON)
        {Score = Score + 1;}

        if(OPERA )
        {Score = Score - 1;}

         if(q5.equalsIgnoreCase(text))
       {Score = Score + 1;}
        return Score;
    }
}
