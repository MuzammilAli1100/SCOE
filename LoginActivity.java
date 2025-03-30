package com.example.scoe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText  usernameInput2, passwordInput2;
    private Button  loginButton2;
    Intent intent = getIntent();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.student_login);
        // Ensure the correct layout is loaded

        // Initialize views
        usernameInput2 = findViewById(R.id.usernameInput2);

        passwordInput2 = findViewById(R.id.passwordInput2);
        loginButton2 = findViewById(R.id.Login_Button2);


        // Set OnClickListener for the login button
        loginButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login2(v); // Call the login method on button click
            }
        });
    }

    // Login method
    public void login2(View v) {
        String correctUsername1 = "scoe";
        String correctPassword1 = "scoe";

        String enteredUsername1 = usernameInput2.getText().toString().trim();
        String enteredPassword1 = passwordInput2.getText().toString().trim();


        // Check for empty input fields
        if (enteredUsername1.isEmpty()) {
            usernameInput2.setError("Username cannot be empty!");
            return;
        }
        if (enteredPassword1.isEmpty()) {
            passwordInput2.setError("Password cannot be empty!");
            return;
        }

        // Validate login credentials
        if (enteredUsername1.equals(correctUsername1) && enteredPassword1.equals(correctPassword1))
        {
            Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, mainUI.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Wrong Credentials!", Toast.LENGTH_SHORT).show();
        }
    }






}
