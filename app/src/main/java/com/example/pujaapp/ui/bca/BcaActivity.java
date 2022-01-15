package com.example.pujaapp.ui.bca;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pujaapp.R;
import com.example.pujaapp.ui.courses.CourseActivity;
import com.example.pujaapp.ui.pdf.PdfActivity;
import com.example.pujaapp.utils.Constants;

public class BcaActivity  extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca);

        findViewById(R.id.btn_excel).setOnClickListener(v->{
            Intent intent = new Intent(BcaActivity.this, PdfActivity.class);
            intent.putExtra(Constants.file_key,"excel_tutorial.pdf");
            startActivity(intent);
        });
        findViewById(R.id.startbtn2).setOnClickListener(v->{
            Intent intent = new Intent(BcaActivity.this, PdfActivity.class);
            intent.putExtra(Constants.file_key,"c_f.pdf");
            startActivity(intent);
        });
        findViewById(R.id.startbtn3).setOnClickListener(v->{
            Intent intent = new Intent(BcaActivity.this, PdfActivity.class);
            intent.putExtra(Constants.file_key,"data.pdf");
            startActivity(intent);
        });


}
}

