package com.primerp.recyclerview;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OtraActividad extends AppCompatActivity {

    private TextView textViewNombre;
    private TextView textViewTelefono;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra_actividad);

        // Enlazar las vistas del layout
        textViewNombre = findViewById(R.id.textViewNombre);
        textViewTelefono = findViewById(R.id.textViewTelefono);
        imageView = findViewById(R.id.imageView); // Asegúrate de que este ID coincida con el del layout

        // Obtener los datos del Intent
        Intent intent = getIntent();
        if (intent != null) {
            String nombre = intent.getStringExtra("nombre");
            String telefono = intent.getStringExtra("telefono");
            int imageResId = intent.getIntExtra("image", -1); // Default -1 si no se recibe el ID

            // Mostrar los datos en los TextViews
            textViewNombre.setText(nombre);
            textViewTelefono.setText(telefono);

            // Mostrar la imagen si se recibió correctamente
            if (imageResId != -1) {
                imageView.setImageResource(imageResId);
            }
        }
    }

}