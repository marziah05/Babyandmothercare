package com.example.pumpuia.babyandmothercare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SixActivity extends AppCompatActivity implements View.OnClickListener {

    Button t1,t2,t3,t4,t5,t6,t7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_six);

        t1 = (Button) findViewById(R.id.t1);
        t1.setOnClickListener(this);
        t2 = (Button) findViewById(R.id.t2);
        t2.setOnClickListener(this);
        t3 = (Button) findViewById(R.id.t3);
        t3.setOnClickListener(this);
        t4 = (Button) findViewById(R.id.t4);
        t4.setOnClickListener(this);
        t5 = (Button) findViewById(R.id.t5);
        t5.setOnClickListener(this);
        t6 = (Button) findViewById(R.id.t6);
        t6.setOnClickListener(this);
        t7 = (Button) findViewById(R.id.t7);
        t7.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_six, menu);
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

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.t1 :
                Intent intent;
                intent = new Intent(this, ElevenActivity.class);
                startActivity(intent);
                break;

            case R.id.t2 :
                Intent intent2;
                intent2 = new Intent(this, TwelveActivity.class);
                startActivity(intent2);
                break;

            case R.id.t3 :
                Intent intent3;
                intent3 = new Intent(this, ThirteenActivity.class);
                startActivity(intent3);
                break;
            case R.id.t4 :
                Intent intent4;
                intent4 = new Intent(this, FourteenActivity.class);
                startActivity(intent4);
                break;
            case R.id.t5 :
                Intent intent5;
                intent5 = new Intent(this, FifteenActivity.class);
                startActivity(intent5);
                break;
            case R.id.t6 :
                Intent intent6;
                intent6 = new Intent(this, SixteenActivity.class);
                startActivity(intent6);
                break;
            case R.id.t7 :
                Intent intent7;
                intent7 = new Intent(this, SeventeenActivity.class);
                startActivity(intent7);
                break;


        }

    }
}