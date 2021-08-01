package com.example.factorialcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import static java.lang.Integer.valueOf;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logopic);
    }
    public void calculate (View v){
        EditText editText_number = findViewById(R.id.editText_number);
        final TextView textView_answer = findViewById(R.id.TextView_answer);
        double fact = 1;
        double i;
        double n = Double.valueOf(editText_number.getText().toString());

        if (n < 0) {
            Toast.makeText(getApplicationContext(), R.string.errorMessage,Toast.LENGTH_SHORT).show();
            textView_answer.setText("");
        }
        else if (n >= 0) {
            for ( i=1 ; i<=n ; i++)
                fact = fact * i;
            DecimalFormat formatVal = new DecimalFormat("##.##");
            textView_answer.setText(formatVal.format(fact));
        }
    }
}