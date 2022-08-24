package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText studentname = findViewById(R.id.studentname);
        EditText studentage = findViewById(R.id.studentage);
        Button button = findViewById(R.id.button);


       String name = studentname.getText().toString();
//        String age = studentage.getText().toString();




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent student = new Intent (MainActivity.this, MainActivity3.class);
                student.putExtra("name", studentname.getText().toString());
                student.putExtra("age",studentage.getText().toString());




                startActivity(student);






            }
        });






    }
}
