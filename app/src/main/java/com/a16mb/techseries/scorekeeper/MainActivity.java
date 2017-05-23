package com.a16mb.techseries.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void aplusone(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamA(scoreTeamA);
    }

    public void aplustwo(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamA(scoreTeamA);
    }


    public void aplusthree(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }

    public void aplussix(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayTeamA(scoreTeamA);
    }


    public void bplusone(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamB(scoreTeamB);
    }


    public void bplustwo(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamB(scoreTeamB);
    }


    public void bplusthree(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }

    public void bplussix(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayTeamB(scoreTeamB);
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }


    public void displayTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }


    public void displayTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }
}