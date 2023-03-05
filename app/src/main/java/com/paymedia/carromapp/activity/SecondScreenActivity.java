package com.paymedia.carromapp.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.paymedia.carromapp.R;

import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

public class SecondScreenActivity extends AppCompatActivity {

    BlurView blurView,ed_bl_family_member,ed_bl_date_of_birth,ed_bl_deceased,ed_bl_condition,ed_bl_notes,ed_bl_landline;
    Button nextButton;

    EditText MobileET,LandlineET;
    Button button,button2;
    String phone,phone2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        // registering with id's
        MobileET = findViewById(R.id.MobileET);
        button = findViewById(R.id.button);

        // registering with id's
        LandlineET = findViewById(R.id.LandlineET);
        button2 = findViewById(R.id.button2);

        // for change the background color of title bar
        ActionBar aBar; aBar= getSupportActionBar();
        ColorDrawable cd = new ColorDrawable(Color.parseColor("#FF00FF00"));
        aBar.setBackgroundDrawable(cd);

        blurView = findViewById(R.id.blurView_toolbar1);
        ed_bl_family_member = findViewById(R.id.ed_bl_family_member);
        ed_bl_date_of_birth= findViewById(R.id.ed_bl_date_of_birth);
        ed_bl_condition = findViewById(R.id.ed_bl_condition);
        ed_bl_landline = findViewById(R.id.ed_bl_landline);
        ed_bl_notes = findViewById(R.id.ed_bl_notes);
        nextButton = findViewById(R.id.btn_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondScreenActivity.this, ThirdScreenActivity.class);
                startActivity(intent);
            }
        });
        glassView();
    }

    // this function is called on clicking validate button
    public void check(View view) {
        // checking text is entered or empty
        if (!MobileET.getText().toString().isEmpty()) {
            // storing the entered number in to string
            phone= MobileET.getText().toString().trim();
        } else {
            Toast.makeText(SecondScreenActivity.this, "Please enter mobile number ", Toast.LENGTH_LONG).show();
        }
        if(android.util.Patterns.PHONE.matcher(phone).matches())
        // using android available method of checking phone
        {
            Toast.makeText(SecondScreenActivity.this, "MATCH", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(SecondScreenActivity.this, "NO MATCH", Toast.LENGTH_LONG).show();
        }
    }

    // this function is called on clicking validate button
    public void landlinecheck(View view) {
        // checking text is entered or empty
        if (!MobileET.getText().toString().isEmpty()) {
            // storing the entered number in to string
            phone2= LandlineET.getText().toString().trim();
        } else {
            Toast.makeText(SecondScreenActivity.this, "Please enter mobile number ", Toast.LENGTH_LONG).show();
        }
        if(android.util.Patterns.PHONE.matcher(phone2).matches())
        // using android available method of checking phone
        {
            Toast.makeText(SecondScreenActivity.this, "MATCH", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(SecondScreenActivity.this, "NO MATCH", Toast.LENGTH_LONG).show();
        }
    }


    private void glassView() {

        //blue view
        float radius = 20f;
        View decorView = getWindow().getDecorView();
        ViewGroup rootView = (ViewGroup) decorView.findViewById(android.R.id.content);
        Drawable windowBackground = decorView.getBackground();

        blurView.setupWith(rootView, new RenderScriptBlur(this)) // or RenderEffectBlur
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurRadius(radius);
        blurView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        blurView.setClipToOutline(true);

        //family_member field
        ed_bl_family_member.setupWith(rootView, new RenderScriptBlur(this)) // or RenderEffectBlur
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurRadius(radius);
        ed_bl_family_member.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ed_bl_family_member.setClipToOutline(true);

        //date_of_birth field
        ed_bl_date_of_birth.setupWith(rootView, new RenderScriptBlur(this)) // or RenderEffectBlur
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurRadius(radius);
        ed_bl_date_of_birth.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ed_bl_date_of_birth.setClipToOutline(true);

        //condition field
        ed_bl_condition.setupWith(rootView, new RenderScriptBlur(this)) // or RenderEffectBlur
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurRadius(radius);
        ed_bl_condition.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ed_bl_condition.setClipToOutline(true);

        //notes field
        ed_bl_notes.setupWith(rootView, new RenderScriptBlur(this)) // or RenderEffectBlur
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurRadius(radius);
        ed_bl_notes.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ed_bl_notes.setClipToOutline(true);

        //landline
        ed_bl_landline.setupWith(rootView, new RenderScriptBlur(this)) // or RenderEffectBlur
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurRadius(radius);
        ed_bl_landline.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ed_bl_landline.setClipToOutline(true);
    }
}