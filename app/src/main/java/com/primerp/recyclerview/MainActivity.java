package com.primerp.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private List<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Configurar el layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inicializar la lista de datos
        dataList = new ArrayList<>();
        dataList.add("Nombre 1");
        dataList.add("Nombre 2");
        dataList.add("Nombre 3");
        // Añadir más datos a la lista

        // Configurar el adaptador
        myAdapter = new MyAdapter(dataList);
        recyclerView.setAdapter(myAdapter);
    }
}
