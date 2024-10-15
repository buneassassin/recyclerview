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
        // Lista de personas para demostrar la lista en RecyclerView
        List<Perona> p=new ArrayList<Perona>();

        // Añadir personas a la lista
        p.add(new Perona("Juan", "25"));
        p.add(new Perona("Ana", "30"));

        PersonaAdapter adapterpersona=new PersonaAdapter(p);

        RecyclerView lista=(RecyclerView) findViewById(R.id.recyclerView);
        lista.setAdapter(adapterpersona);
        lista.setLayoutManager(new LinearLayoutManager(this));
        lista.setHasFixedSize(true);
        
    }
}
