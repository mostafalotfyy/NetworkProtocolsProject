package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView=(ListView) findViewById(R.id.listview);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("iPhone");
        arrayList.add("Windows");
        arrayList.add("Blackberry");
        arrayList.add("Linux");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent myIntent=new Intent(ListActivity.this, DeviceDetailActivity.class);
                    startActivityForResult(myIntent,0);
                }
                if(i==1){
                    Intent myIntent=new Intent(ListActivity.this, DeviceDetailActivity.class);
                    startActivityForResult(myIntent,1);
                }
                if(i==2){
                    Intent myIntent=new Intent(ListActivity.this, DeviceDetailActivity.class);
                    startActivityForResult(myIntent,2);
                }
                if(i==3){
                    Intent myIntent=new Intent(ListActivity.this, DeviceDetailActivity.class);
                    startActivityForResult(myIntent,3);
                }
                if(i==4){
                    Intent myIntent=new Intent(ListActivity.this, DeviceDetailActivity.class);
                    startActivityForResult(myIntent,4);
                }
            }
        });

    }
}
