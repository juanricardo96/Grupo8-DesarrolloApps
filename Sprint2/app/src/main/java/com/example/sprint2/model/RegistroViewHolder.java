package com.example.sprint2.model;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sprint2.R;

public class RegistroViewHolder extends RecyclerView.ViewHolder {
    private TextView txtNombre;
    private TextView txtEstatura;
    private TextView txtPeso;
    private TextView txtIMC;

    public RegistroViewHolder(@NonNull View itemView) {
        super(itemView);
        txtNombre =(TextView)itemView.findViewById(R.id.res_nombre);
        txtEstatura =(TextView)itemView.findViewById(R.id.res_estatura);
        txtPeso =(TextView)itemView.findViewById(R.id.res_peso);
        txtIMC =(TextView)itemView.findViewById(R.id.res_imc);
    }

    public TextView getTxtNombre() {
        return txtNombre;
    }

    public TextView getTxtEstatura() {
        return txtEstatura;
    }

    public TextView getTxtPeso() {
        return txtPeso;
    }

    public TextView getTxtIMC() {
        return txtIMC;
    }
}
