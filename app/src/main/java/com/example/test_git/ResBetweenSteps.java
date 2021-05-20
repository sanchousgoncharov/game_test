package com.example.test_git;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import static com.example.test_git.Navigator.britain;
import static com.example.test_git.Navigator.china;
import static com.example.test_git.Navigator.france;
import static com.example.test_git.Navigator.germany;
import static com.example.test_git.Navigator.india;
import static com.example.test_git.Navigator.kndr;
import static com.example.test_git.Navigator.russia;
import static com.example.test_git.Navigator.usa;


public class ResBetweenSteps extends AppCompatActivity {
    Button bt;
    public static TextView tv_1;
    public static ProgressBar pb_1;
    public static TextView tv_2;
    public static ProgressBar pb_2;
    public static TextView tv_3;
    public static ProgressBar pb_3;
    public static TextView tv_4;
    public static ProgressBar pb_4;
    public static TextView tv_5;
    public static ProgressBar pb_5;
    public static TextView tv_6;
    public static ProgressBar pb_6;
    public static TextView tv_7;
    public static ProgressBar pb_7;
    public static TextView tv_8;
    public static ProgressBar pb_8;
    private Stat statView = new Stat();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_between_steps);
        bt = (Button) findViewById(R.id.buttonResBetweenSteps);
        tv_1 = (TextView) findViewById(R.id.tv_1);
        pb_1 = (ProgressBar) findViewById(R.id.pb_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        pb_2 = (ProgressBar) findViewById(R.id.pb_2);
        tv_3 = (TextView) findViewById(R.id.tv_3);
        pb_3 = (ProgressBar) findViewById(R.id.pb_3);
        tv_4 = (TextView) findViewById(R.id.tv_4);
        pb_4 = (ProgressBar) findViewById(R.id.pb_4);
        tv_5 = (TextView) findViewById(R.id.tv_5);
        pb_5 = (ProgressBar) findViewById(R.id.pb_5);
        tv_6 = (TextView) findViewById(R.id.tv_6);
        pb_6 = (ProgressBar) findViewById(R.id.pb_6);
        tv_7 = (TextView) findViewById(R.id.tv_7);
        pb_7 = (ProgressBar) findViewById(R.id.pb_7);
        tv_8 = (TextView) findViewById(R.id.tv_8);
        pb_8 = (ProgressBar) findViewById(R.id.pb_8);
//        pb_1.setProgress(china.getLifeLevel());
//        pb_2.setProgress(britain.getLifeLevel());
//        pb_3.setProgress(india.getLifeLevel());
//        pb_4.setProgress(russia.getLifeLevel());
//        pb_5.setProgress(germany.getLifeLevel());
//        pb_6.setProgress(usa.getLifeLevel());
//        pb_7.setProgress(france.getLifeLevel());
//        pb_8.setProgress(kndr.getLifeLevel());
        statView.statViewResBetweenSteps();


        bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResBetweenSteps.this, Navigator.class);
                startActivity(intent);
            }
        });
    }
}