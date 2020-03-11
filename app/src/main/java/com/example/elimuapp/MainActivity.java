package com.example.elimuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Toolbar mytool = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mytool);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.bar_menu, menu);
        return  true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id== R.id.search){
            Toast.makeText(getApplicationContext(),"i am a search icon",Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.settings){
            Toast.makeText(getApplicationContext(),"i am a setting icon",Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.settings){
            Toast.makeText(getApplicationContext(),"i am a setting icon",Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.logout){
            Toast.makeText(getApplicationContext(),"i am a logout stuff",Toast.LENGTH_SHORT).show();
        }
        return true;

    }
}


