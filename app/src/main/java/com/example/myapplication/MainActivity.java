package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private boolean showFirst = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Program 1
//        Button btnOpen = findViewById(R.id.btnOpen);
//        btnOpen.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//            startActivity(intent);
//        });


//        Program 2
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.fragmentContainer1, new FragmentOne())
//                .replace(R.id.fragmentContainer2, new FragmentTwo())
//                .commit();

//        Program 3
//        Button btnClick = findViewById(R.id.btnClick);
//        btnClick.setOnClickListener(view -> {
//            Toast.makeText(this, "You clicked the button!", Toast.LENGTH_SHORT).show();
//        });

//        Program 4
//        Button buttonClick = findViewById(R.id.buttonClick);
//        TextView outputText = findViewById(R.id.outputText);
//
//        buttonClick.setOnClickListener(view -> {
//            outputText.setText("You clicked the button!");
//        });

//        Program 5
//        Button btn = findViewById(R.id.btn);
//        TextView label = findViewById(R.id.label);
//
//        btn.setOnClickListener(v -> {
//            label.setText("Button was clicked!");
//        });

//    Program 6
//        ListView listView = findViewById(R.id.listView);
//
//        String[] fruits = {"Apple", "Banana", "Mango", "Grapes", "Orange"};
//
//        // Adapter to convert array into list items
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                fruits
//        );
//
//        listView.setAdapter(adapter);
//
//        // When item is clicked
//        listView.setOnItemClickListener((parent, view, position, id) -> {
//            String selected = fruits[position];
//            Toast.makeText(this, "You clicked: " + selected, Toast.LENGTH_SHORT).show();
//        });

//    Program 7
//        Nothing just keep the top two line

//    Program 8
//        Nothing just keep the top two line

//        Program 9
//        TextView viewOne = findViewById(R.id.viewOne);
//        TextView viewTwo = findViewById(R.id.viewTwo);
//        Button btnToggle = findViewById(R.id.btnToggle);
//
//        btnToggle.setOnClickListener(v -> {
//            if (showFirst) {
//                viewOne.setVisibility(View.GONE);
//                viewTwo.setVisibility(View.VISIBLE);
//            } else {
//                viewOne.setVisibility(View.VISIBLE);
//                viewTwo.setVisibility(View.GONE);
//            }
//            showFirst = !showFirst;
//        });


//        Program 9
//        Button btnBrowser = findViewById(R.id.btnBrowser);
//        Button btnDialer = findViewById(R.id.btnDialer);
//        Button btnMap = findViewById(R.id.btnMap);
//
//        btnBrowser.setOnClickListener(v -> {
//            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
//            startActivity(browserIntent);
//        });
//
//        btnDialer.setOnClickListener(v -> {
//            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
//            dialIntent.setData(Uri.parse("tel:1234567890"));
//            startActivity(dialIntent);
//        });
//
//        btnMap.setOnClickListener(v -> {
//            Uri gmmIntentUri = Uri.parse("geo:0,0?q=Kolhapur");
//            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//            mapIntent.setPackage("com.google.android.apps.maps");
//            startActivity(mapIntent);
//        });



    }
}
