package com.example.myavtovokzal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Routes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);

        List<Route> routeList = new ArrayList<>();
        routeList.add(new Route("Маршрут 1", "Городской", 10, new Bus(new Driver("Иванов", "Иван", "Иванович", "123456789", "BUS001"), "101", "AB123")));
        routeList.add(new Route("Маршрут 2", "Пригородный", 15, new Bus(new Driver("Петров", "Петр", "Петрович", "987654321", "BUS002"), "102", "CD456")));
        // Добавьте остальные маршруты

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<Route> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, routeList);
        listView.setAdapter(adapter);
    }

    public void onBackPressed() {
        // Ваш код обработки перехода назад, например, закрытие текущей активности
        super.onBackPressed();
        finish();
    }

    public void removeDataRoute(View view) {
    }

    public void addDataRoute(View view) {
    }
}