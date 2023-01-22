package com.example.ex002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_reinitializer;
    Button btn_quitter;
    EditText number1;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_quitter=findViewById(R.id.quitter);
        btn_reinitializer=findViewById(R.id.reinitializer);
        number1=findViewById(R.id.nomber);
        textview=findViewById(R.id.texteView);


        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
        btn_reinitializer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.setText(null);
                textview.setText(R.string.defaut);
                textview.setText(R.string.defaut);
            }
        });
}}