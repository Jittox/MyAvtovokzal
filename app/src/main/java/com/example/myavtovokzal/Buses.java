package com.example.myavtovokzal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class Buses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buses);

        List<Bus> busList = new ArrayList<>();
        busList.add(new Bus(new Driver("Иванов", "Иван", "Иванович", "123456789", "BUS001"), "101", "AB123"));
        busList.add(new Bus(new Driver("Петров", "Петр", "Петрович", "987654321", "BUS002"), "102", "CD456"));
        // Add other buses

        ListView listView = findViewById(R.id.listView); // Make sure the ID matches the one in your XML layout
        ArrayAdapter<Bus> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, busList);
        listView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        // Your code for handling back navigation, e.g., closing the current activity
        super.onBackPressed();
        finish();
    }

    public void removeDataBus(View view) {
    }

    public void addDataBus(View view) {
    }
}
