package com.example.himanshu.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Login extends Activity {
    RadioGroup rg;
    RadioButton rb;
    int i;
   // int j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        rg = (RadioGroup) findViewById(R.id.rgroup);
        Intent itt = getIntent();
        i = itt.getIntExtra("data", 0);
       // j= itt.getIntExtra("data", 0);
    }

    public void rbclick(View v) {
        int rad1 = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(rad1);
        if (rb.getText().equals("New Delhi")) {
            ++i;
            Toast.makeText(getBaseContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
           // ++j;
            Toast.makeText(getBaseContext(), "Incorrect Answer", Toast.LENGTH_SHORT).show();
        }
        Intent it = new Intent(Login.this, Second.class);
        it.putExtra("data", i);
       // it.putExtra("data", j);
        startActivity(it);
        finish();
    }
}
