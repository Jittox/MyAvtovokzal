package com.example.myavtovokzal;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Drivers extends AppCompatActivity {
    List<Driver> driverList = new ArrayList<>();
    ArrayAdapter<Driver> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, driverList);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers);


        driverList.add(new Driver("Иванов", "Иван", "Иванович", "123456789", "BUS001"));
        driverList.add(new Driver("Петров", "Петр", "Петрович", "987654321", "BUS002"));

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

    public void onBackPressed() {
        // Ваш код обработки перехода назад, например, закрытие текущей активности
        super.onBackPressed();
        finish();
    }

    public void removeDataDriver(View view) {
    }

    public void addDataDriver(View view) {
    }
    private void showAddDriverDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add New Driver");

        // Inflate the layout for the dialog
        View view = getLayoutInflater().inflate(R.layout.dialog_add_driver, null);
        builder.setView(view);

        final EditText etLastName = view.findViewById(R.id.etLastName);
        final EditText etFirstName = view.findViewById(R.id.etFirstName);
        final EditText etPatronymic = view.findViewById(R.id.etPatronymic);
        final EditText etPhone = view.findViewById(R.id.etPhone);
        final EditText etBusNumber = view.findViewById(R.id.etBusNumber);

        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String lastName = etLastName.getText().toString();
                String firstName = etFirstName.getText().toString();
                String patronymic = etPatronymic.getText().toString();
                String phone = etPhone.getText().toString();
                String busNumber = etBusNumber.getText().toString();

                // Add the new driver to the list
                Driver newDriver = new Driver(lastName, firstName, patronymic, phone, busNumber);
                driverList.add(newDriver);

                // Notify the adapter that the data set has changed
                adapter.notifyDataSetChanged();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
    }

}