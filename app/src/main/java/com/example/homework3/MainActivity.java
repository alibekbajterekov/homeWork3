package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList animalList = new ArrayList();
    private RecyclerView rvAnimal;
    private RecyclerView.Adapter animalAdapter = new AnimalAdapter(animalList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvAnimal = findViewById(R.id.rv_animal);
        loadData();
        rvAnimal.setAdapter(animalAdapter);
    }

    private void loadData() {
        animalList.add("Медоед");
        animalList.add("Коала");
        animalList.add("Собака");
        animalList.add("Лев");
        animalList.add("Тигр");
        animalList.add("Кот");
        animalList.add("Олень");
        animalList.add("Барс");
        animalList.add("Волк");
        animalList.add("Заяц");
        animalList.add("Баран");
        animalList.add("Корова");
        animalList.add("Петух");
        animalList.add("Курица");
    }
}