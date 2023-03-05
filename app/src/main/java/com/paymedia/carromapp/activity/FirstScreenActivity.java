package com.paymedia.carromapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.Button;

import com.paymedia.carromapp.R;
import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

public class FirstScreenActivity extends AppCompatActivity {

    BlurView blurView,ed_bl_nameof_member,ed_bl_date_of_birth,ed_bl_deceased,ed_bl_condition,ed_bl_notes;
    Button nextButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        blurView = findViewById(R.id.blurView_toolbar1);
        ed_bl_nameof_member = findViewById(R.id.ed_bl_nameof_member);
        ed_bl_date_of_birth= findViewById(R.id.ed_bl_date_of_birth);
        ed_bl_deceased= findViewById(R.id.ed_bl_deceased);
        ed_bl_condition = findViewById(R.id.ed_bl_condition);
        ed_bl_notes = findViewById(R.id.ed_bl_notes);
        nextButton = findViewById(R.id.btn_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstScreenActivity.this, SecondScreenActivity.class);
                startActivity(intent);
            }
        });
        glassView();
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

        //nameof_member field
        ed_bl_nameof_member.setupWith(rootView, new RenderScriptBlur(this)) // or RenderEffectBlur
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurRadius(radius);
        ed_bl_nameof_member.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ed_bl_nameof_member.setClipToOutline(true);

        //date_of_birth field
        ed_bl_date_of_birth.setupWith(rootView, new RenderScriptBlur(this)) // or RenderEffectBlur
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurRadius(radius);
        ed_bl_date_of_birth.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ed_bl_date_of_birth.setClipToOutline(true);

        //deceased field
        ed_bl_deceased.setupWith(rootView, new RenderScriptBlur(this)) // or RenderEffectBlur
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurRadius(radius);
        ed_bl_deceased.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ed_bl_deceased.setClipToOutline(true);

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
    }
}