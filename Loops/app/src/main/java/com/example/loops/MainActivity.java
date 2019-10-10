package com.example.loops;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void countUp(View v)
    {
        Log.i("message:", "IN countUp Method");

        int x = 0;

        while(true)
        {
            x++;
            Log.i("x=", ""+x);
            if (x==3)
            {
                break;
            }
        }
    }

    public void countDown(View y)
    {
        Log.i("message:", "IN countDown Method");


        for(int x = 3; x >= 1; x--)
        {
            Log.i("x=", ""+x);
            if (x == 1)
            {
                break;
            }
        }
    }

    public void Nested(View r) {
        Log.i("message:", "IN Nested Method");

        for(int i = 0; i < 3; i++)
        {
            for (int j = 3; j > 0; j--)
            {
                Log.i("Info", "i=" +i+ ":j=" +j);
            }
        }
    }
}
