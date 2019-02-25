package br.com.starwars.starwars.model;

public enum Genero {
    MASCULINO("Masculino"), FEMININO("Femenino");

    private final String toString;

    Genero(String toString) {
        this.toString = toString;
    }

    /*
    public String toString(){
        return toString;
    }*/
}
