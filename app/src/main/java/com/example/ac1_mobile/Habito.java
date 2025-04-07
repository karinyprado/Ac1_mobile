package com.example.ac1_mobile;
import java.io.Serializable;

public class Habito implements Serializable {
    private String nome;
    private String descricao;
    private boolean feitoHoje;

    public Habito(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.feitoHoje = false;
    }

    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public boolean isFeitoHoje() { return feitoHoje; }

    public void setFeitoHoje(boolean feitoHoje) { this.feitoHoje = feitoHoje; }
}
