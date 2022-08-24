
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
/////////////////////////////////تعريف


        TextView nameTextView = findViewById(R.id.textView11);
        TextView ageTextView = findViewById(R.id.textView13);


///////////////////////////////////// name
        Bundle bundle = getIntent().getExtras();



        String name = bundle.getString("name");

        nameTextView.setText("salman");







    }
}