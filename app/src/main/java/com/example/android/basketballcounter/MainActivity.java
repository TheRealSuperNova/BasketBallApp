package com.example.android.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score2) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score2));
    }

    public void updatePoints_3(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void updatePoints_2(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void updatePoints_1(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }
    public void updatePoints_3B(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void updatePoints_2B(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void updatePoints_1B(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    public void ResetValues(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}


