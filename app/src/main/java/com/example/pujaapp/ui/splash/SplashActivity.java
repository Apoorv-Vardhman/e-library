package com.example.pujaapp.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pujaapp.MainActivity;
import com.example.pujaapp.R;
import com.example.pujaapp.db.PrefConnect;
import com.example.pujaapp.ui.login.LoginActivity;
import com.example.pujaapp.utils.Constants;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                boolean check = PrefConnect.readBoolean(SplashActivity.this, Constants.IS_LOGIN,false);
                if(check)
                {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
                else{
                    startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                    finish();
                }
            }
        }, 3000);
    }
}
