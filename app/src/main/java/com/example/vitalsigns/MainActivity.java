package com.example.vitalsigns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void launchAddVitals(View v)
    {
        Intent i = new Intent(this, AddVitalsActivity.class);
        startActivity(i);
    }

    public void launchViewList(View v)
    {
        Intent i = new Intent(this, ViewVitals.class);
        startActivity(i);
    }

    public void launchContacts(View v)
    {
        Intent i = new Intent(this, Contacts.class);
        startActivity(i);
    }

}