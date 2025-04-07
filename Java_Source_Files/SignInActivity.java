package com.example.sa; 
 
import androidx.appcompat.app.AppCompatActivity; 
 
import android.content.Intent; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView; 
import android.widget.Toast; 
 
public class SignInActivity extends AppCompatActivity { 
 
    EditText edUsername, edPassword; 
    Button btn; 
    TextView tv; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_sign_in); 
 
        edUsername = findViewById(R.id.editTextSignInUsername); 
        edPassword = findViewById(R.id.editTextSignInPassword); 
        btn = findViewById(R.id.buttonSignIn); 
        tv = findViewById(R.id.textViewNewAcc); 
 
        btn.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                String username = edUsername.getText().toString(); 
                String password = edPassword.getText().toString(); 
                if(username.length()==0 || password.length()==0){ 
                    Toast.makeText(getApplicationContext(), "Please fill all the details", Toast.LENGTH_SHORT).show(); 
                }else{ 
                    Toast.makeText(getApplicationContext(), "Login Successfull!", 
Toast.LENGTH_SHORT).show(); 
                } 
            } 
        }); 
 
        tv.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                startActivity(new Intent(SignInActivity.this,CreateAcc.class)); 
            } 
        }); 
 
    } 
}