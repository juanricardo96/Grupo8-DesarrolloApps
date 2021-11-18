package com.example.sprint2.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        View vista = inflater.inflate(layout, null);
        return new RegistroViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RegistroViewHolder holder, int position) {
        Registro registro = lista.get(position);

        holder.getTxtNombre().setText(registro.getNombre());
        holder.getTxtEstatura().setText(registro.getEstatura()+"");
        holder.getTxtPeso().setText(registro.getPeso()+"");
        holder.getTxtIMC().setText(registro.getImc()+"");
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
