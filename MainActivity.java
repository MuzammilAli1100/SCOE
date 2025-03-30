package com.example.scoe;

import static androidx.activity.EdgeToEdge.*;

import static com.example.scoe.R.layout.mainui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity
 {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginCard), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            return insets;
        });

    }


    public void Student(View view)
    {
        Intent intent1 = new Intent(this, LoginActivity.class);
       // setContentView(R.layout.student_login);
        startActivity(intent1);

    }
    public void Teacher(View view)
    {
        Intent intent = new Intent(this, Teacherlogin.class);
       // setContentView(R.layout.login);
        startActivity(intent);
    }

     public void some() {
         some(null);
     }

     public void some(View view)
    {
        Intent intent2 = new Intent(this, mainUI.class);
        setContentView(mainui);
        startActivity(intent2);

    }

}