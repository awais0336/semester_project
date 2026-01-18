package com.mussa1.myfacebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {

    EditText emailtext;
    EditText passwordtext;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        emailtext = findViewById(R.id.editTextTextEmailAddress);
        passwordtext = findViewById(R.id.editTextTextPassword);
        loginButton = findViewById(R.id.button);


        TextView signup = findViewById(R.id.login);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, Signup.class);
                startActivity(intent);
            }

        });

        ImageView backButton = findViewById(R.id.backb);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }

        });


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
            }
        });
    }
        void check()
        {

            String email = emailtext.getText().toString();
            String password = passwordtext.getText().toString();

            String epattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


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
                        Intent intent = new Intent(login.this,feedfb.class);
                        startActivity(intent);
                    }
                });
            }

    }
}
