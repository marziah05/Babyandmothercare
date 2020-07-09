package com.example.pumpuia.babyandmothercare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TwoActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1,bt2,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        bt1 = (Button) findViewById(R.id.btn1);
        bt1.setOnClickListener(this);
        bt2 = (Button) findViewById(R.id.btn2);
        bt2.setOnClickListener(this);
        bt3 = (Button) findViewById(R.id.btn3);
        bt3.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_two, menu);
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
            case R.id.btn1 :
                Intent intent;
                intent = new Intent(this, ThreeActivity.class);
                startActivity(intent);
                break;

            case R.id.btn2 :
                Intent intent3;
                intent3 = new Intent(this, FourActivity.class);
                startActivity(intent3);
                break;

            case R.id.btn3 :
                Intent intent4;
                intent4 = new Intent(this, FiveActivity.class);
                startActivity(intent4);
                break;

        }

    }
}
