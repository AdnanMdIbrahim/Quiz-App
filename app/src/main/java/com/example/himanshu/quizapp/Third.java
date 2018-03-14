package com.example.himanshu.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Third extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    int i;
    int j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        rg = (RadioGroup) findViewById(R.id.radgrp);
        Intent itt = getIntent();
        i = itt.getIntExtra("data", 0);
        j= itt.getIntExtra("data", 0);
    }

    public void rbclick(View v) {
        int rad = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(rad);
        if (rb.getText().equals("A flower")) {
            ++i;
            Toast.makeText(getBaseContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            ++j;
            Toast.makeText(getBaseContext(), "Incorrect Answer", Toast.LENGTH_SHORT).show();
        }
        Intent it = new Intent(Third.this, Fourth.class);
        it.putExtra("data", i);
        it.putExtra("data", j);
        startActivity(it);
        finish();
    }
}
