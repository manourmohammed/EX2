package com.example.ex002;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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
    Button c1 ,c2 ,c3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_quitter=findViewById(R.id.quitter);
        btn_reinitializer=findViewById(R.id.reinitializer);
        number1=findViewById(R.id.nomber);
        textview=findViewById(R.id.texteView);

        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
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
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.WHITE);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(0x2AE91E63);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(0xD0BB86FC);
            }
        });
}public void setMyScreenColor(int color){
        View v=this.getWindow().getDecorView();
        v.setBackgroundColor(color);
    }}