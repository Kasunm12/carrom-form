package com.paymedia.carromapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.Button;

import com.paymedia.carromapp.R;

import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

public class ThirdScreenActivity extends AppCompatActivity {

    BlurView blurView,ed_bl_nameof_member,ed_bl_address,ed_bl_deceased,ed_bl_condition,ed_bl_notes,ed_bl_namewith_initials;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);

        blurView = findViewById(R.id.blurView_toolbar1);
        ed_bl_nameof_member = findViewById(R.id.ed_bl_nameof_member);
        ed_bl_address= findViewById(R.id.ed_bl_address);
        ed_bl_condition = findViewById(R.id.ed_bl_condition);
        ed_bl_notes = findViewById(R.id.ed_bl_notes);

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

        //name of member field
        ed_bl_nameof_member.setupWith(rootView, new RenderScriptBlur(this)) // or RenderEffectBlur
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurRadius(radius);
        ed_bl_nameof_member.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ed_bl_nameof_member.setClipToOutline(true);

        //date_of_birth field
        ed_bl_address.setupWith(rootView, new RenderScriptBlur(this)) // or RenderEffectBlur
                .setFrameClearDrawable(windowBackground) // Optional
                .setBlurRadius(radius);
        ed_bl_address.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ed_bl_address.setClipToOutline(true);

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