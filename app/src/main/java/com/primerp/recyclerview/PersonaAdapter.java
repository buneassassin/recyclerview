package com.primerp.recyclerview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.viewholder> implements View.OnClickListener {
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
    public void onBindViewHolder(@NonNull PersonaAdapter.viewholder holder, @SuppressLint("RecyclerView") int position) {
        holder.textViewName.setText(LP.get(position).getNombre());
        holder.textViewTelefono.setText(LP.get(position).getTelefono());
        holder.img.setImageResource(LP.get(position).getImageResId());

        // Cambiar el color de fondo del layout dependiendo de la posición
        int[] colores = {R.color.colorItem1, R.color.colorItem2, R.color.colorItem3, R.color.colorItem4, R.color.colorItem5};
        int colorPos = position % colores.length; // Alterna entre los colores disponibles
        holder.layout.setBackgroundResource(colores[colorPos]);

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), OtraActividad.class);
                intent.putExtra("nombre", LP.get(position).getNombre());
                intent.putExtra("telefono", LP.get(position).getTelefono());
                intent.putExtra("image", LP.get(position).getImageResId());
                v.getContext().startActivity(intent);
            }
        });
    }




    @Override
    public int getItemCount() {
        return LP.size();
    }

    @Override
    public void onClick(View view) {
     //   perso=
    }

    public class viewholder extends RecyclerView.ViewHolder {
        public View layout;
        // Aquí se enlazan los elementos de la vista con las propiedades de la clase Perona

        TextView textViewName;
         TextView textViewTelefono;
         ImageView img;
         ConstraintLayout layaou;

         public viewholder(@NonNull View itemView) {
             super(itemView);
             textViewName = itemView.findViewById(R.id.textViewName);
             textViewTelefono = itemView.findViewById(R.id.textViewTelefono);
             img = itemView.findViewById(R.id.img);
             layaou= itemView.findViewById(R.id.layaou);

        }
    }
// color // clik a la imagen evento. de pasar valore a otra actividad (entre intens)
}
