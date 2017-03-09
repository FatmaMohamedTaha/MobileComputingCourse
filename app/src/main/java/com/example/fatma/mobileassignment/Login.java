package com.example.fatma.mobileassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button signIn;
    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        signIn = (Button)findViewById(R.id.signInbtn);
        username=(EditText)findViewById(R.id.UsernameLoginET);
        password=(EditText)findViewById(R.id.PasswordLoginET);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("") || password.getText().toString().equals("") )
                {
                    Toast.makeText(Login.this,"Please fill all the fields",Toast.LENGTH_SHORT).show();
                }


                    else
                {
                    Intent intent = new Intent(Login.this,Home.class);
                    startActivity(intent);
                }
            }
        });


    }

}
