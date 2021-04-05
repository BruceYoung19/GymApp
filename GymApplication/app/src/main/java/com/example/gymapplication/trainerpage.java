package com.example.gymapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class trainerpage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trainerpage);
        // TODO: 5/04/21 list of trainers -> recylcerview
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        Button button = findViewById(R.id.Button_hire);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HireTrainer();
            }
        });

    }


    public void HireTrainer(){
        Intent intent = new Intent(this,hire.class);
        startActivity(intent);
    }


}