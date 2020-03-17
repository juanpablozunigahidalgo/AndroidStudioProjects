package com.showerapp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convertToEuro(View view){
        EditText editText = (EditText) findViewById(R.id.editText1);
        int dollars = Integer.parseInt(editText.getText().toString());
        int british = 13;
        double result = dollars * british ;
        Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
        TextView textView = (TextView)findViewById(R.id.textView1);
        textView.setText(Double.toString(result));
    }

}
