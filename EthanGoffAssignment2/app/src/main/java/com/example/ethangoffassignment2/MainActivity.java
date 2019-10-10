package com.example.ethangoffassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int number = 0;
    String valid = "";

    public EditText enterNumber()
    {
        EditText enterNumber = findViewById(R.id.editText);
        return enterNumber;
    }

    public int number()
    {
        EditText enterNumber = findViewById(R.id.editText);
        int number = Integer.parseInt(enterNumber.getEditableText().toString());
        return number;
    }

    // int number = number();

    //int number;
    public void countUp(View countUp) {
        try {
            Log.i("info", "button clicked");
            validation();
            if (valid.equals("valid")) {
                countUp();
                valid = "not valid";
            } else {
                Toast.makeText(this, "Please insert a number in between 1 and 10",
                        Toast.LENGTH_SHORT).show();
            }
        }catch(NumberFormatException noNumber)
        {
            noNumber.printStackTrace();
            Toast.makeText(this, "Please insert a number in between 1 and 10",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void countDown(View countDown) {
        try {
            Log.i("info", "Button was clicked.");
            validation();
            if(valid.equals("valid")) {
                countDown();
                valid = "not valid";
            }else {
                Toast.makeText(this, "Please insert a number in between 1 and 10",
                        Toast.LENGTH_SHORT).show();
            }
        }catch(NumberFormatException noNumber)
        {
            noNumber.printStackTrace();
            Toast.makeText(this, "Please insert a number in between 1 and 10",
                    Toast.LENGTH_SHORT).show();
        }
    }

    void countUp()
    {
        if (number < 0)
        {
            Toast.makeText(this, " " + number(), Toast.LENGTH_SHORT).show();
            number = 1;
        }
        else if (number == 0)
        {
            Toast.makeText(this, " " + number(), Toast.LENGTH_SHORT).show();
            number++;
        }
        else if (number + number() <= 10) {
            Toast.makeText(this, " " + (number + number()), Toast.LENGTH_SHORT).show();
            number++;
        }
    }

    void countDown()
    {
        if (number > 0)
        {
            Toast.makeText(this, " " + number(), Toast.LENGTH_SHORT).show();
            number = -1;
        }
        else if (number == 0)
        {
            Toast.makeText(this, " " + number(), Toast.LENGTH_SHORT).show();
            number++;
        }
        else if (number + number() > 0) {
            Toast.makeText(this, " " + (number + number()), Toast.LENGTH_SHORT).show();
            number--;
        }

    }

    void validation()
    {
        if (number() >= 1 && number() <= 10)
        {
            valid = "valid";
        }else
        {
            Toast.makeText(this, "Please insert a number in between 1 and 10",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
