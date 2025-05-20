package com.example.apl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.*;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
//    program 9
//    private boolean showFirst = true;

//    Program 12
//    EditText inputName, inputEmail;
//    RadioGroup genderGroup;
//    CheckBox chkReading, chkGaming, chkSports;
//    ToggleButton toggleNews;
//    Button btnSubmit;
//    TextView output;

//    Program 13
//    Spinner spinnerCities;
//    TextView txtSelected;

    Button btnShowDialog;

//    program 22
    EditText inputText;
    Button btnSave;
    TextView statusText;

//    program 23
Button btnThread;

//  Program 24
    ProgressBar progressBar;
    TextView txtPercent;
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


//        Program 10
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

//        Program 11
//        Button btnGo = findViewById(R.id.btnOpen);
//        btnGo.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//            startActivity(intent);
//        });


//        Program 12
//        inputName = findViewById(R.id.inputName);
//        inputEmail = findViewById(R.id.inputEmail);
//        genderGroup = findViewById(R.id.genderGroup);
//        chkReading = findViewById(R.id.chkReading);
//        chkGaming = findViewById(R.id.chkGaming);
//        chkSports = findViewById(R.id.chkSports);
//        toggleNews = findViewById(R.id.toggleNews);
//        btnSubmit = findViewById(R.id.btnSubmit);
//        output = findViewById(R.id.output);
//
//        btnSubmit.setOnClickListener(v -> {
//            String name = inputName.getText().toString();
//            String email = inputEmail.getText().toString();
//
//            int selectedGenderId = genderGroup.getCheckedRadioButtonId();
//            RadioButton selectedGender = findViewById(selectedGenderId);
//            String gender = selectedGender != null ? selectedGender.getText().toString() : "Not selected";
//
//            StringBuilder hobbies = new StringBuilder();
//            if (chkReading.isChecked()) hobbies.append("Reading ");
//            if (chkGaming.isChecked()) hobbies.append("Gaming ");
//            if (chkSports.isChecked()) hobbies.append("Sports ");
//
//            String newsletter = toggleNews.isChecked() ? "Subscribed" : "Not Subscribed";
//
//            String result = "Name: " + name + "\nEmail: " + email + "\nGender: " + gender +
//                    "\nHobbies: " + hobbies + "\nNewsletter: " + newsletter;
//
//            output.setText(result);
//        });


//        Program 13
//        spinnerCities = findViewById(R.id.spinnerCities);
//        txtSelected = findViewById(R.id.txtSelected);
//
//        // Data for spinner
//        String[] cities = {"Select City", "Kolhapur", "Mumbai", "Pune", "Nagpur"};
//
//        // Adapter connects data to Spinner
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_spinner_item,
//                cities
//        );
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinnerCities.setAdapter(adapter);
//
//        // Set listener
//        spinnerCities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                String selected = cities[position];
//                if (position != 0) { // ignore "Select City"
//                    Toast.makeText(MainActivity.this, "You selected: " + selected, Toast.LENGTH_SHORT).show();
//                    txtSelected.setText("Selected City: " + selected);
//                } else {
//                    txtSelected.setText("");
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                // optional, usually left empty
//            }
//        });

//        Program 14
//        btnShowDialog = findViewById(R.id.btnShowDialog);
//
//        btnShowDialog.setOnClickListener(v -> {
//            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//            builder.setTitle("Confirm Action");
//            builder.setMessage("Are you sure you want to proceed?");
//            builder.setIcon(android.R.drawable.ic_dialog_alert);
//
//            // Positive Button
//            builder.setPositiveButton("Yes", (dialog, which) ->
//                    Toast.makeText(MainActivity.this, "You chose YES", Toast.LENGTH_SHORT).show()
//            );
//
//            // Negative Button
//            builder.setNegativeButton("No", (dialog, which) ->
//                    Toast.makeText(MainActivity.this, "You chose NO", Toast.LENGTH_SHORT).show()
//            );
//
//            // Neutral Button
//            builder.setNeutralButton("Cancel", (dialog, which) ->
//                    Toast.makeText(MainActivity.this, "Action Cancelled", Toast.LENGTH_SHORT).show()
//            );
//
//            // Show dialog
//            builder.show();
//        });




//        Program 22
//        inputText = findViewById(R.id.inputText);
//        btnSave = findViewById(R.id.btnSave);
//        statusText = findViewById(R.id.statusText);
//
//        btnSave.setOnClickListener(v -> {
//            String data = inputText.getText().toString().trim();
//            if (data.isEmpty()) {
//                Toast.makeText(this, "Enter something to save!", Toast.LENGTH_SHORT).show();
//                return;
//            }
//
//            try {
//                File file = new File(getFilesDir(), "myfile.txt"); // Safe internal path
//                FileOutputStream fos = new FileOutputStream(file);
//                fos.write(data.getBytes());
//                fos.close();
//
//                statusText.setText("Saved to: " + file.getAbsolutePath());
//                Toast.makeText(this, "Data saved!", Toast.LENGTH_SHORT).show();
//            } catch (Exception e) {
//                Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_LONG).show();
//            }
//        });



//        Program 23
//        btnThread = findViewById(R.id.btnThread);
//        threadStatus = findViewById(R.id.threadStatus);
//
//        btnThread.setOnClickListener(v -> {
//            threadStatus.setText("Running...");
//
//            new Thread(() -> {
//                for (int i = 1; i <= 5; i++) {
//                    Log.d("ThreadExample", "Count: " + i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//                runOnUiThread(() -> {
//                    threadStatus.setText("Thread Finished!");
//                    Toast.makeText(this, "Background Task Complete", Toast.LENGTH_SHORT).show();
//                });
//            }).start();
//        });

//        Program 24
//            progressBar = findViewById(R.id.progressBar);
//            txtPercent = findViewById(R.id.txtPercent);
//
//            new Thread(() -> {
//                for (int i = 0; i <= 100; i++) {
//                    int finalI = i;
//                    runOnUiThread(() -> {
//                        progressBar.setProgress(finalI);
//                        txtPercent.setText(finalI + "%");
//                    });
//                    try {
//                        Thread.sleep(50); // 50ms delay
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();

//        Program 25
//        RatingBar ratingBar = findViewById(R.id.ratingBar);
//        TextView txtRating = findViewById(R.id.txtRating);
//
//        ratingBar.setOnRatingBarChangeListener((bar, rating, fromUser) -> {
//            txtRating.setText("Rating: " + rating);
//        });


//        Program 26
//        SeekBar seekBar = findViewById(R.id.seekBar);
//        TextView txtSeek = findViewById(R.id.txtSeek);
//
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                txtSeek.setText("Value: " + progress);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) { }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) { }
//        });

//        Program 27
//        ToggleButton toggle = findViewById(R.id.toggle);
//
//        toggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
//            if (isChecked) {
//                Toast.makeText(this, "Wi-Fi Enabled", Toast.LENGTH_SHORT).show();
//            } else {
//                Toast.makeText(this, "Wi-Fi Disabled", Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}