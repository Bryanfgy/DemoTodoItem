package com.example.demotodoitem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    ArrayList<ToDoItem> al;
    customAdapter adapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        al = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 8, 1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020, 8 , 2);

        al.add(new ToDoItem("Go for movie", date1));
        al.add(new ToDoItem("Go for haircut", date2));

        adapter = new customAdapter(this,R.layout.row,al);
        lv.setAdapter(adapter);
    }
}