package com.example.kgtopound;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText Value;
    private TextView text;
    private TextView texta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        Value=findViewById(R.id.editTextNumber);
        text=findViewById(R.id.textView);
        texta=findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Have a Good Day",Toast.LENGTH_SHORT).show();
                String s= Value.getText().toString();
                int a= Integer.parseInt(s);
                double pound=2.205*a;
                texta.setText("The corresponding value in pound "+pound);
            }
        })


        ;}
}