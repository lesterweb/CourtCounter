package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }
    /**
     * Add 3 to the score of Team A.
     */
    public void threePointClickA(View view){
        displayForTeamA(scoreTeamA = scoreTeamA + 3);
    }
    /**
     * Add 2 to the score of Team A.
     */
    public void twoPointClickA(View view){
        displayForTeamA(scoreTeamA = scoreTeamA + 2);
    }
    /**
     * Add 1 to the score of Team A.
     */
    public void freeThrowClickA(View view){
        displayForTeamA(scoreTeamA = scoreTeamA + 1);
    }
    /**
     * Add 3 to the score of Team B.
     */
    public void threePointClickB(View view){
        displayForTeamB(scoreTeamB = scoreTeamB + 3);
    }
    /**
     * Add 2 to the score of Team B.
     */
    public void twoPointClickB(View view){
        displayForTeamB(scoreTeamB = scoreTeamB + 2);
    }
    /**
     * Add 1 to the score of Team B.
     */
    public void freeThrowClickB(View view){
        displayForTeamB(scoreTeamB = scoreTeamB + 1);
    }
    /**
     * Add 1 to the score of Team B.
     */
    public void resetScores(View view){
        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
