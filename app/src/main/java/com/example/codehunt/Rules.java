package com.example.codehunt;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Rules extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules_dialog_layout);
        Button okay =  findViewById(R.id.next);
        okay.setOnClickListener(view -> startActivity(new Intent(Rules.this,MainActivity2.class)));
    }
}
