package com.example.anikenechi.alchackaton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.button;

public class Login_Activity extends AppCompatActivity {

    private EditText username, password;
    private Button loginbutto;

    public String email = "example@gmail.com";
    public String setPassword = "qwerty";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.Username);
        password = (EditText) findViewById(R.id.password);

        loginbutto = (Button) findViewById(R.id.login_button);

//    public void login (View button) {
//        final String username1 = username.getText().toString();
//        if (email == username1){
//            username
//        }
//    }




    }
}
