package com.ardi.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
     TextView SignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        SignUp = findViewById(R.id.Text_Login);
        SignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Text_Login:
                Intent moveIntent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}