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

public class Teacherlogin extends AppCompatActivity {

    private EditText usernameInput, passwordInput;
    private Button  loginButton;
    Intent intent = getIntent();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);
        // Ensure the correct layout is loaded

        // Initialize views
           usernameInput = findViewById(R.id.usernameInput);

          passwordInput = findViewById(R.id.passwordInput);
        loginButton = findViewById(R.id.login_button);

        // Debugging: Ensure all views are initialized correctly
        if (usernameInput == null || passwordInput == null || loginButton == null) {
            throw new IllegalStateException("Error: Some UI elements not found! Check layout IDs.");
        } else {
            Log.d("Debug", "All UI elements initialized successfully!");
        }

        // Set OnClickListener for the login button
       loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(v); // Call the login method on button click
            }
        });






    }



    public void login(View v) {
        String correctUsername = "scoe";
        String correctPassword = "scoe";

        String enteredUsername = usernameInput.getText().toString().trim();
        String enteredPassword = passwordInput.getText().toString().trim();

        // Check for empty input fields
        if (enteredUsername.isEmpty()) {
            usernameInput.setError("Username cannot be empty!");
            return;
        }
        if (enteredPassword.isEmpty()) {
            passwordInput.setError("Password cannot be empty!");
            return;
        }

        // Validate login credentials
        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword))
        {
            Toast.makeText(Teacherlogin.this, "Login Successful!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, mainUI.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Wrong Credentials!", Toast.LENGTH_SHORT).show();
        }
    }



}
