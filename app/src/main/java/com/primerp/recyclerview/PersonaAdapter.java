package com.primerp.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.viewholder>  {
    List<Perona> LP;

    public PersonaAdapter(List<Perona> LP) {
        this.LP = LP;
    }

    @NonNull
    @Override
    public PersonaAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View view = ly.inflate(R.layout.item_layout,parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonaAdapter.viewholder holder, int position) {
        holder.textViewName.setText(LP.get(position).getNombre());
        holder.textViewTelefono.setText(LP.get(position).getTelefono());



    }

    @Override
    public int getItemCount() {
        return LP.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
         // Aquí se enlazan los elementos de la vista con las propiedades de la clase Perona

        TextView textViewName;
         TextView textViewTelefono;
         public viewholder(@NonNull View itemView) {
             super(itemView);
             textViewName = itemView.findViewById(R.id.textViewName);
             textViewTelefono = itemView.findViewById(R.id.textViewTelefono);

        }
    }

}
