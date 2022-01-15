package com.example.pujaapp.ui.bba;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pujaapp.R;
import com.example.pujaapp.ui.bca.BcaActivity;
import com.example.pujaapp.ui.pdf.PdfActivity;
import com.example.pujaapp.utils.Constants;

public class BbaActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bba);
        findViewById(R.id.startbtn1).setOnClickListener(v->{
            Intent intent = new Intent(BbaActivity.this, PdfActivity.class);
            intent.putExtra(Constants.file_key,"m.pdf");
            startActivity(intent);
        });
        findViewById(R.id.startbtn2).setOnClickListener(v->{
            Intent intent = new Intent(BbaActivity.this, PdfActivity.class);
            intent.putExtra(Constants.file_key,"f.pdf");
            startActivity(intent);
        });
        findViewById(R.id.startbtn3).setOnClickListener(v->{
            Intent intent = new Intent(BbaActivity.this, PdfActivity.class);
            intent.putExtra(Constants.file_key,"eco.pdf");
            startActivity(intent);
        });


    }
}
