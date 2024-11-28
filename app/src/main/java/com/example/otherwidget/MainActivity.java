package com.example.otherwidget;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    RadioGroup radioGroup;
    Spinner spinner;
    TimePicker timePicker;
    DatePicker datePicker;
    Button button;
    ProgressBar progressBar;
    int progress = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /*checkBox = findViewById(R.id.myCheckbox);

        checkBox.setOnCheckedChangeListener((CompoundButton buttonView, boolean isChecked) -> {
            if (isChecked){
                // code to execute when checkbox is checked
                Toast.makeText(MainActivity.this, "The Checkbox is checked", Toast.LENGTH_SHORT).show();
            } else {
                // code to execute when checkbox is unchecked
                Toast.makeText(MainActivity.this, "The Checkbox is not checked", Toast.LENGTH_SHORT).show();
            }
        });*/

        /*
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener((RadioGroup group, int checkedId) -> {
            RadioButton radioButton = findViewById(checkedId);
            Toast.makeText(MainActivity.this, "You select: "+radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
        });
         */

        /*
        spinner =  findViewById(R.id.spinner);

        // Data source:
        String[] courses = {"C++", "Java", "Kotlin", "Python"};

        // ArrayAdapter: used to populate the Spinner' with items from a string array resource
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                courses
        );

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
         */

        /*
        timePicker = findViewById(R.id.timer);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // Handle Time change
                Toast.makeText(MainActivity.this, "Hour: "+hourOfDay + " minute: " + minute, Toast.LENGTH_LONG).show();
            }
        });
         */

        /*
        datePicker = findViewById(R.id.mydatePicker);
        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            String day = "Day "+ datePicker.getDayOfMonth();
            String month = "Month "+ datePicker.getMonth();
            String year =  "Year "+ datePicker.getYear();

            Toast.makeText(MainActivity.this, day+ " " +month+ " " +year, Toast.LENGTH_LONG).show();

        });
         */

        button = findViewById(R.id.button2);
        progressBar = findViewById(R.id.progressbar);

        button.setOnClickListener(v -> {
            progress += 10;

            progressBar.setProgress(progress);
        });
    }
}