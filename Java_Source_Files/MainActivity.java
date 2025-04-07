package com.example.sa; 
 
import androidx.appcompat.app.AppCompatActivity; 
 
import android.content.Intent; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
 
public class MainActivity extends AppCompatActivity { 
 
    Button btnRegister; 
    Button btnSignIn; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        btnRegister = findViewById(R.id.buttonRegister); 
 
        //To link Main page to Create Account page 
        //when user click Button - Register, then it opens the Create account page 
 
        btnRegister.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                startActivity(new Intent(MainActivity.this,CreateAcc.class)); 
            } 
        }); 
 
        btnSignIn = findViewById(R.id.buttonSignUp); 
 
        //To link Main page to Create Sign In page 
        //when user click Button - Sign In, then it opens the Sign In page 
 
        btnSignIn.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                startActivity(new Intent(MainActivity.this,SignInActivity.class)); 
            } 
        }); 
 
 
 
    } 
} 