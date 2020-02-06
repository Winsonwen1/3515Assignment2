package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
   // private static final String TAG ="aa";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =  findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st =  ((EditText)findViewById(R.id.name)).getText().toString();
                String st2 =  ((EditText)findViewById(R.id.user_e)).getText().toString();
                String st3 =  ((EditText)findViewById(R.id.password)).getText().toString();
                String st4 =  ((EditText)findViewById(R.id.confirmation)).getText().toString();
                if(st.equals("")||st2.equals("")||st3.equals("")||st4.equals("")){
                    //Log.d(TAG,"You must enter all information");
                    Toast.makeText(getApplicationContext(),"You must enter all information",Toast.LENGTH_LONG).show();
                }else if(!st3.equals(st4)){
                    //Log.d(TAG,"Passwords do not match, try again");
                    Toast.makeText(getApplicationContext(),"Passwords do not match, try again",Toast.LENGTH_LONG).show();
                }else{
                    ((EditText)findViewById(R.id.name)).setText("");
                    ((EditText)findViewById(R.id.user_e)).setText("");
                    ((EditText)findViewById(R.id.password)).setText("");
                    ((EditText)findViewById(R.id.confirmation)).setText("");
                    Toast.makeText(getApplicationContext(),"Welcome, "+ st +" to the SignUpForm App",Toast.LENGTH_LONG).show();
                   // Log.d(TAG,"666");

                }
            }
        });
    }



}
