package com.paymedia.carromapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.paymedia.carromapp.R;

public class IntroActivity extends AppCompatActivity {

    private ConstraintLayout introCL01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        introCL01=findViewById(R.id.introCL01);
        introCL01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntroActivity.this,FirstScreenActivity.class));
            }
        });
    }
}