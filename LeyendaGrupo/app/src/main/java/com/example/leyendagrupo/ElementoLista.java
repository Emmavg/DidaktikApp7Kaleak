package com.example.leyendagrupo;

public class ElementoLista {
    private String alum;
    private int numGrupo;

    public ElementoLista(int numGrupo, String alum){
        this.alum=alum;
        this.numGrupo=numGrupo;
    }

    public String getNombreApe() {
        return alum;
    }
    public int getSuperficie() {
        return numGrupo;
    }
}
