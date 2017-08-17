package com.example.root.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileInputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Hello! AndroidStudio. I am coming.", 1).show();

        try{
            FileInputStream fis = new FileInputStream(new File("/"));
        }catch (Exception e){
            // TODO
        }finally{

            Gson json = new Gson();

        }

    }

}
