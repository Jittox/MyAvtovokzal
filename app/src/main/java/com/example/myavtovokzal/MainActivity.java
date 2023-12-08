package com.example.myavtovokzal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void busnext(View view) {
        Intent intent = new Intent(this, Buses.class);
        startActivity(intent);
    }

    public void drivernext(View view) {
        Intent intent = new Intent(this, Drivers.class);
        startActivity(intent);
    }

    public void routenext(View view) {
        Intent intent = new Intent(this, Routes.class);
        startActivity(intent);
    }
    public void onBackPressed() {
        // Ваш код обработки перехода назад, например, закрытие текущей активности
        super.onBackPressed();
        finish();
    }
}