package com.guptastuti.lab02texts;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submitButton1;
    TextView displayText;
    Button submitButton2;
    int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton1=findViewById(R.id.clickButton1);
        submitButton2=findViewById(R.id.clickButton2);
        displayText=findViewById(R.id.textBox);
        submitButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println("Hello mom");
                Log.i("testButton1", "button1");
//                displayText.setText(displayText.getText()+" "+responseText.getText());
                number += 1;
                displayText.setText("" + number);
            }
        });
        submitButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println("Hello dad");
                Log.i("testButton2", "button2");
            }
        });
    }
}