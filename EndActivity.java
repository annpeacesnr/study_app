package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/** SplashApp.
 * @author Anna-Marie Spencer
 * EndActivity displays tv_result
 */
public class EndActivity extends AppCompatActivity {

    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        //result data
        tv_result = findViewById(R.id.result);

        //correct and incorrect tally
        int correct = getIntent().getIntExtra("correct", 0);
        int wrong = getIntent().getIntExtra("wrong", 0);

        tv_result.setText("Correct: " + correct + " \nWrong:" + wrong);


    }

    public void reset(View view) {
        Intent intent = new Intent(EndActivity.this, MainActivity.class);
        startActivity(intent);
    }
}