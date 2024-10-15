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

        // Lista de personas para el RecyclerView
        List<Perona> personasList = new ArrayList<>();

        // Añadir personas con nombre, teléfono y referencia de imagen
        personasList.add(new Perona("Juan", "2558786", R.drawable.cat));  // Aquí añades la imagen de Juan
        personasList.add(new Perona("Ana", "7867687", R.drawable.cat));    // Aquí añades la imagen de Ana

        // Crear el adaptador y asignarlo al RecyclerView
        PersonaAdapter personaAdapter = new PersonaAdapter(personasList);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(personaAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
    }

}
