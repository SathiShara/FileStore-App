 
import androidx.appcompat.app.AppCompatActivity; 
 
import android.content.Intent; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.Toast; 
 
public class HomeActivity extends AppCompatActivity { 
 
    Button btnMyFiles; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_home); 
 
        btnMyFiles = findViewById(R.id.buttonMyFiles); 
 
        //To link Home page to My files page 
        //when user click Button of My Files, then it open the my files page. 
 
        btnMyFiles.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                startActivity(new Intent(HomeActivity.this,MyFilesActivity.class)); 
            } 
        }); 
 
 
 
 
    } 
} 