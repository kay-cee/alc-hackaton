package com.example.anikenechi.alchackaton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private Button additem1;
    ListView listView;

    String currentItem;

    ArrayAdapter<String> adapter;
    ArrayList<String> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        listView = (ListView) findViewById(R.id.country_list);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        additem1 = (Button) findViewById(R.id.addItem);

        list  = new ArrayList<>();

         adapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, list);
        addListenerOnSpinnerItemSelection();

        addListenerOnButton();

    }

    public void addListenerOnSpinnerItemSelection() {
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                currentItem = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        additem1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                adapter.add(currentItem);
            }
        });
    }

    



    







}
