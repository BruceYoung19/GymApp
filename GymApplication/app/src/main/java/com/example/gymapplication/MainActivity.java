package com.example.gymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button begin_button = findViewById(R.id.button_begin);
        begin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WelcomePeople();
            }
        });
    }

    // TODO: 5/04/21  Title and button to skip to the next page
    public void WelcomePeople(){
        Intent intent = new Intent(this,welcome.class);
        startActivity(intent);
    }

}