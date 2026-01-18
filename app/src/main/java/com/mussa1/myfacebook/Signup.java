package com.mussa1.myfacebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Signup extends AppCompatActivity
{

    EditText firstName;
    EditText lastName;
    EditText emailtext;
    EditText passwordtext;
    Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);


        TextView loginTextView = findViewById(R.id.madeby);

        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Signup.this, login.class);
                startActivity(intent);
            }
        });



        firstName = findViewById(R.id.fname);
        lastName = findViewById(R.id.lname);
        emailtext = findViewById(R.id.editTextTextEmailAddress);
        passwordtext = findViewById(R.id.editTextTextPassword);
        signUpButton = findViewById(R.id.button);


        signUpButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                check();
            }
        });
    }

    void check()
    {
        String first = firstName.getText().toString();
        String last = lastName.getText().toString();
        String email = emailtext.getText().toString();
        String password = passwordtext.getText().toString();

        String epattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (first.length() == 0 && first.length() != 8)
        {
            Toast.makeText(this, "Enter a valid first name", Toast.LENGTH_SHORT).show();
            return;
        }

        if (last.length() == 0 && last.length() != 8)
        {
            Toast.makeText(this, "Enter a valid last name", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!email.matches(epattern))
        {
            Toast.makeText(this, "Enter a valid email address", Toast.LENGTH_SHORT).show();
            return;
        }


        if (password.length() <= 8 || !password.contains("$"))
        {
            Toast.makeText(this, "Enter a valid password (length > 8 and contains $)", Toast.LENGTH_SHORT).show();
            return;
        }
       else
        {
            Button sign = findViewById(R.id.button);

            sign.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent intent = new Intent(Signup.this,feedfb.class);
                    startActivity(intent);
                }
            });
        }

    }
}