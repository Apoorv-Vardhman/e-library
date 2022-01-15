package com.example.pujaapp.ui.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.pujaapp.R;
import com.example.pujaapp.utils.Constants;
import com.github.barteksc.pdfviewer.PDFView;

public class PdfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        Intent intent = getIntent();
        String filename = intent.getStringExtra(Constants.file_key);
        PDFView pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset(filename).load();

    }
}