package com.example.pujaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.pujaapp.ui.bca.BcaActivity;

public class VidOpActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vid_op_activty);
        findViewById(R.id.startbtn1).setOnClickListener(v->{
            Intent intent = new Intent(this, VideoActivity.class);
            startActivity(intent);
        });
    }
}