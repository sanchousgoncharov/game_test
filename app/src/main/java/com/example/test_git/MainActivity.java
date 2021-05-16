 package com.example.test_git;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

 public class MainActivity extends AppCompatActivity {
     Button bt_rules;
     Button bt_game;
     String[] valCountries = {"2", "3", "4", "5", "6", "7", "8"}; //кол-во стран

     @RequiresApi(api = Build.VERSION_CODES.O)
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         Actions setSteps = new Actions();
         bt_rules = (Button) findViewById(R.id.bt_rules);
         bt_game = (Button) findViewById(R.id.bt_game);
         ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, valCountries); // адаптер
         adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         Spinner spinner = (Spinner) findViewById(R.id.spinner1);
         spinner.setAdapter(adapter);
         spinner.setPrompt("Title");// заголовок


         //         выделяем элемент
//        spinner.setSelection(2);
//         устанавливаем обработчик нажатия
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view,
//                                       int position, long id) {
//                // показываем позиция нажатого элемента
//                Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
//            }
//            @Override
//            public void onNothingSelected(AdapterView<?> arg0) {
//            }
//        });
         bt_rules.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

             }
         });

         bt_game.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 setSteps.setSteps( Integer.parseInt( String.valueOf(spinner.getSelectedItem())));
                 Intent intent = new Intent(MainActivity.this, Navigator.class);
                 startActivity(intent);
             }
         });

     }
}