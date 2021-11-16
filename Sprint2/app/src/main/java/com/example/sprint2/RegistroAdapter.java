package com.example.sprint2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sprint2.model.Registro;

import java.util.List;

public class RegistroAdapter extends RecyclerView.Adapter<RegistroViewHolder> {
    Context context;
    int layout;
    List<Registro> lista;
    LayoutInflater inflater;

    public RegistroAdapter(Context context, int layout, List<Registro> lista){
        this.context=context;
        this.layout=layout;
        this.lista=lista;
        this.inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RegistroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = inflater.inflate(layout, parent, false);
        return new RegistroViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RegistroViewHolder holder, int position) {
        Registro contacto = lista.get(position);

        holder.getTxtNombre().setText(contacto.getNombre());
        holder.getTxtEstatura().setText(contacto.getEstatura()+"");
        holder.getTxtPeso().setText(contacto.getPeso()+"");
        holder.getTxtIMC().setText(contacto.getImc()+"");
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
