package com.example.himanshu.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b;
    int i = 0;
   // int j=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("abc") && e2.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                    Intent it = new Intent(MainActivity.this, Login.class);
                    it.putExtra("data", i);
                   // it.putExtra("data", j);
                    startActivity(it);
                } else {
                    Toast.makeText(MainActivity.this, "Login Unsuccessfull", Toast.LENGTH_SHORT).show();

                }
                finish();
            }
        });
    }
}
