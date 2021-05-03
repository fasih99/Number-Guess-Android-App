package com.example.higherlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public void guess(View view)
    {
        Random randomnumbers = new Random();

        Integer random = 1+ randomnumbers.nextInt(20);
        System.out.println(random.toString());

        EditText number = (EditText) findViewById(R.id.number);
        Integer numb;
        numb= Integer.parseInt(number.getText().toString());

        if(numb>random)
        {
           Toast.makeText(this,"Higher!",Toast.LENGTH_LONG).show();
        }

        else if (numb<random)
        {
            Toast.makeText(this,"Lower!",Toast.LENGTH_LONG).show();
        }

        else
            {
                Toast.makeText(this,"Spot on!"+" the number was "+
                        random.toString()+". Play Again.",Toast.LENGTH_LONG).show();

            }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
