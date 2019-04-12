package com.example.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText height, weight;
    private Button bmi;
    float a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        result = findViewById(R.id.result);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        bmi = findViewById(R.id.bmi);
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(height.getText().toString());
                b = Float.parseFloat(weight.getText().toString());
                c = b/((a/100)*(a/100));
                result.setText("" +c);
                if(c<18.5)
                {
                    Toast.makeText(MainActivity.this,"Under weight", Toast.LENGTH_LONG).show();
                }
                else if(c>18.5 && c<=24.9)
                {

                    Toast.makeText(MainActivity.this," Normal weight", Toast.LENGTH_LONG).show();
                }
                else if((c>=25) && (c<=29.9))
                {

                    Toast.makeText(MainActivity.this,"Over weight", Toast.LENGTH_LONG).show();
                }
                else if(c>=30)
                {

                    Toast.makeText(MainActivity.this,"Obesity", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
