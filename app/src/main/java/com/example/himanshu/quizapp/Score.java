package com.example.himanshu.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.himanshu.quizapp.R.*;

public class Score extends AppCompatActivity {

    TextView t1, t2;
    Button b;
    int i;
  //  int j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_score);
        Intent itt = getIntent();
        i = itt.getIntExtra("data", 0);
        //j=itt.getIntExtra("data", 0);
        b=(Button)findViewById(id.button2);

        t1 = (TextView) findViewById(id.textView6);
        t2 = (TextView) findViewById(id.textView8);
       // t2.setText(" "+(i-j));
        if (i == 5) {
            t1.setText("Great,you got full score.");
            t2.setText("5");
        } else if (i < 2) {
            t1.setText("Sorry, you lose.");
            t2.setText("" + i);
        } else {
            t1.setText("You pass.");
            t2.setText("" + i);
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
