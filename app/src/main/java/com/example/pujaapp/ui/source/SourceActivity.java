package com.example.pujaapp.ui.source;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pujaapp.R;
import com.example.pujaapp.ui.web.WebViewActivity;
import com.example.pujaapp.utils.Constants;

public class SourceActivity  extends AppCompatActivity {
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source);


        findViewById(R.id.rl_spoken).setOnClickListener(v->{
            Intent intent = new Intent(SourceActivity.this, WebViewActivity.class);
            intent.putExtra(Constants.web_url,"https://spoken-tutorial.org/");
            startActivity(intent);
        });

        findViewById(R.id.rl_tutorial).setOnClickListener(v->{
            Intent intent = new Intent(SourceActivity.this, WebViewActivity.class);
            intent.putExtra(Constants.web_url,"https://www.tutorialspoint.com/");
            startActivity(intent);
        });


        findViewById(R.id.rl_nptl).setOnClickListener(v->{
            Intent intent = new Intent(SourceActivity.this, WebViewActivity.class);
            intent.putExtra(Constants.web_url,"https://nptel.ac.in/");
            startActivity(intent);
        });

        findViewById(R.id.rl_mc).setOnClickListener(v->{
            Intent intent = new Intent(SourceActivity.this, WebViewActivity.class);
            intent.putExtra(Constants.web_url,"https://www.mheducation.co.in/");
            startActivity(intent);
        });

    }
}
