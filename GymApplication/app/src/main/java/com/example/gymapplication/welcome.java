package com.example.gymapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class welcome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        // TODO: 5/04/21  TextView how to use it (.set)

        Button button = findViewById(R.id.button_toList);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkoutTrainers();
            }
        });
    }

    // TODO: 5/04/21  Welcome the user and tell then how to use this. and button in to list the client
    public void checkoutTrainers(){
        Intent intent = new Intent(this,trainerpage.class);
    }
}


