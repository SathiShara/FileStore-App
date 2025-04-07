package com.example.sa; 
 
import androidx.appcompat.app.AppCompatActivity; 
 
import android.content.Intent; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
 
public class MyFilesActivity extends AppCompatActivity { 
 
    Button btnWordFiles; 
    Button btnExcel; 
    Button btnPdf; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_my_files); 
 
        btnWordFiles = findViewById(R.id.buttonWord); 
 
        //To link My files page to Word files page 
        //when user click Button-Word files, then it open the Word files page. 
 
        btnWordFiles.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                startActivity(new 
Intent(MyFilesActivity.this,WordFilesActivity.class)); 
            } 
        }); 
 
        btnExcel = findViewById(R.id.buttonExcel); 
 
        //To link Home page to Excel files page 
        //when user click Button of Excel files, then it open the Excel files page. 
 
        btnExcel.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                startActivity(new 
Intent(MyFilesActivity.this,ExcelFilesActivity.class)); 
            } 
        }); 
 
        btnPdf = findViewById(R.id.buttonPdf); 
 
        //To link Home page to PDF files page 
        //when user click Button of PDF files, then it open the PDF files page. 
 
        btnPdf.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                startActivity(new 
Intent(MyFilesActivity.this,PdfFilesActivity.class)); 
            } 
        }); 
    } 
} 