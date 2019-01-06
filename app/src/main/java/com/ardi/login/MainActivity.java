package com.ardi.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     TextView Sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sign = findViewById(R.id.sign);
        Sign.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.sign:
                Intent moveIntent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
