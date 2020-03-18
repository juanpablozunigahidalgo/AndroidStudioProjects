package com.showerapp.triangleorsquare;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {

            EditText guess = (EditText) findViewById(R.id.editText1);
            String gues = guess.getText().toString();
            int number=Integer.parseInt(gues);
            int tri=1;
            int sqa=1;
            int [] arrt= {1};
            int [] arrb= {1};
            for (int i=1; i<=100; i++){
                tri=((i*(i+1))/2);
                sqa=i*i;
                arrt = Arrays.copyOf(arrt, arrt.length + 1);
                arrt [arrt.length - 1] = tri;
                arrb = Arrays.copyOf(arrb, arrb.length + 1);
                arrb [arrb.length - 1] = sqa;
            }
            for (int i=1; i<=100; i++){
                if (arrt [i] == number ) {
                    Toast.makeText(MainActivity.this,"number is triangle", Toast.LENGTH_LONG).show();
                }
                if (arrb [i]== number) {
                    Toast.makeText(MainActivity.this,"number is square", Toast.LENGTH_LONG).show();
                }
            }
        }
    }

