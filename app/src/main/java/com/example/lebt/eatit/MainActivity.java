package com.example.lebt.eatit;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSignUp,btnSignIn;
    TextView tvSlogan, tvLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSignIn = findViewById(R.id.btnDisplaySignIn);
        btnSignUp = findViewById(R.id.btnDisplaySignUp);
        tvLogo = findViewById(R.id.tvLogo);
        tvSlogan = findViewById(R.id.tvSlogan);

        //create Font
        Typeface fontNabila = Typeface.createFromAsset(getAssets(),"fonts/Nabila.ttf");

        //set Font for Text View
        tvLogo.setTypeface(fontNabila);
        tvSlogan.setTypeface(fontNabila);

        //add event Button
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignInActivity.class));
            }
        });
    }
}
