package com.example.ex002;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_reinitializer;
    Button btn_quitter;
    Button btn_afficher;
    EditText number1;
    TextView textview;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_quitter=findViewById(R.id.quitter);
        btn_reinitializer=findViewById(R.id.reinitializer);
        btn_afficher=findViewById(R.id.afficher);
        number1=findViewById(R.id.nomber);
        textview=findViewById(R.id.texte1);


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
                textview.setText("" +
                        " ?*0=?" +
                        "\n?*1=?" +
                        "\n?*2=?" +
                        "\n?*3=?" +
                        "\n?*4=?" +
                        "\n?*5=?" +
                        "\n?*6=?" +
                        "\n?*7=?" +
                        "\n?*8=?" +
                        "\n?*9=?");
            }
        });
        Toast toast;
        toast=Toast.makeText(MainActivity.this," vide!!!! ",Toast.LENGTH_SHORT);
        btn_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int Number1 = Integer.parseInt(number1.getText().toString());
                    String s="";
                    for (int i=1;i<=10;i++) {
                        int result= Number1*i;
                        s+=String.format(" %d*%d=%d \n",Number1,i,result);
                        //result=0;
                    }
                    textview.setText(s);
        }catch (NumberFormatException e){
            toast.show();
            btn_reinitializer.callOnClick();
        }
            }

        });
}}