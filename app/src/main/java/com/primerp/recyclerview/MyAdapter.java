package com.primerp.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    // Constructor para inicializar la lista de datos

    private List<String> dataList;

    // Constructor para inicializar la lista de datos
    public MyAdapter(List<String> dataList) {
        this.dataList = dataList;
    }

    // Crea nuevos elementos de vista
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    // Asocia los datos con la vista
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String data = dataList.get(position);
        holder.textViewName.setText(data);
        holder.textViewTelefono.setText(data);
    }

    // Retorna el tamaño de la lista
    @Override
    public int getItemCount() {
        return dataList.size();
    }

    // Clase para representar las vistas individuales
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewName;
        public BreakIterator textViewTelefono;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
        }
    }
}

