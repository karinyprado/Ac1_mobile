package com.example.ac1_mobile;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class HabitoAdapter extends RecyclerView.Adapter<HabitoAdapter.ViewHolder> {
    private ArrayList<Habito> habitos;
    private Context context;

    public HabitoAdapter(ArrayList<Habito> habitos, Context context) {
        this.habitos = habitos;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_habito, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Habito habito = habitos.get(position);
        holder.txtNome.setText(habito.getNome());
        holder.txtDescricao.setText(habito.getDescricao());
        holder.checkFeito.setChecked(habito.isFeitoHoje());

        holder.checkFeito.setOnCheckedChangeListener((buttonView, isChecked) -> {
            habito.setFeitoHoje(isChecked);
            notifyItemChanged(holder.getAdapterPosition());
        });
    }

    @Override
    public int getItemCount() {
        return habitos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNome, txtDescricao;
        CheckBox checkFeito;

        public ViewHolder(View itemView) {
            super(itemView);
            txtNome = itemView.findViewById(R.id.txtNome);
            txtDescricao = itemView.findViewById(R.id.txtDescricao);
            checkFeito = itemView.findViewById(R.id.checkFeito);
        }
    }
}
