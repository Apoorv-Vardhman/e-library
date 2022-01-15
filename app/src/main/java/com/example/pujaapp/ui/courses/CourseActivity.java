package com.example.pujaapp.ui.courses;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pujaapp.R;
import com.example.pujaapp.ui.bba.BbaActivity;
import com.example.pujaapp.ui.bca.BcaActivity;
import com.example.pujaapp.ui.bcom.BcomActivity;
import com.example.pujaapp.ui.bmc.BmcActivity;
import com.example.pujaapp.ui.mba.MbaActivity;
import com.example.pujaapp.ui.mca.McaActivity;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        findViewById(R.id.btn_bca).setOnClickListener(v->{
            Intent intent = new Intent(this, BcaActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_bba).setOnClickListener(v->{
            Intent intent = new Intent(this, BbaActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_mca).setOnClickListener(v->{
            Intent intent = new Intent(this, McaActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_bcom).setOnClickListener(v->{
            Intent intent = new Intent(this, BcomActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_bmc).setOnClickListener(v->{
            Intent intent = new Intent(this, BmcActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_mba).setOnClickListener(v->{
            Intent intent = new Intent(this, MbaActivity.class);
            startActivity(intent);
        });


    }
}
