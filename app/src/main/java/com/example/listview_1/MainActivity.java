package com.example.listview_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;
import java.util.concurrent.Delayed;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;
    final String[] arr={"Teo", "Ty", "Bin", "Bo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= findViewById(R.id.list_view);
        textView= findViewById(R.id.text_view);
        ArrayAdapter adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , arr);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText("position :" + position + " ; value =" + arr[position]);
            }
        });
    }
}