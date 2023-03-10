package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1,e2;
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bclear,bequal;
        e1=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextPersonName2);
        b1=findViewById(R.id.button10);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        b0=findViewById(R.id.button);
        badd=findViewById(R.id.button11);
        bsub=findViewById(R.id.button12);
        bmul=findViewById(R.id.button13);
        bdiv=findViewById(R.id.button14);
        bclear=findViewById(R.id.button15);
        bequal=findViewById(R.id.button16);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                e1.setText(e1.getText().toString() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText().toString() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText().toString() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText().toString() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText().toString() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText().toString() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText().toString() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText().toString() + "8");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText().toString() + "8");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText().toString() + "0");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e1.getText().toString() + "+");
                e1.setText("");
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e1.getText().toString() + "-");
                e1.setText("");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e1.getText().toString() + "*");
                e1.setText("");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e1.getText().toString() + "/");
                e1.setText("");
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e1.getText().toString() + " ");
                e1.setText("");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e2.getText().toString();
                char c = s.charAt(s.length() - 1);

                if(c=='+')
                {
                    s=s.replace('+',' ');
                    s=s.trim();
                    int res=Integer.parseInt(s)+Integer.parseInt(e1.getText().toString());
                    e1.setText(Integer.toString(res));
                }
                if(c=='-')
                {
                    s=s.replace('-',' ');
                    s=s.trim();
                    int res=Integer.parseInt(s)-Integer.parseInt(e1.getText().toString());
                    e1.setText(Integer.toString(res));
                }
                if(c=='*')
                {
                    s=s.replace( '*',' ');
                    s=s.trim();
                    int res=Integer.parseInt(s)*Integer.parseInt(e1.getText().toString());
                    e1.setText(Integer.toString(res));
                }
                if(c=='/')
                {
                    s=s.replace('/',' ');
                    s=s.trim();
                    int res=Integer.parseInt(s)/Integer.parseInt(e1.getText().toString());
                    e1.setText(Integer.toString(res));
                }

            }
        });
    }
}