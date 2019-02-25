package br.com.starwars.starwars.model;

import java.io.Serializable;

public class Personagem implements Serializable{

    private int[] imagem;
    private String nome;
    private String descricao;
    private String aparicao;
    private String filiacao;
    private String localizacao;
    private Genero genero;
    private String altura;
    private String arma;
    private String veiculo;

    public Personagem(int[] imagem, String nome, String descricao, String aparicao, String filiacao, String localizacao, Genero genero, String altura, String arma, String veiculo){
        this.imagem = imagem;
        this.nome = nome;
        this.descricao = descricao;
        this.aparicao = aparicao;
        this.filiacao = filiacao;
        this.localizacao = localizacao;
        this.genero = genero;
        this.altura = altura;
        this.arma = arma;
        this.veiculo = veiculo;
    }

    public int[] getImagem() {
        return imagem;
    }

    public void setImagem(int[] imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAparicao() {
        return aparicao;
    }

    public void setAparicao(String aparicao) {
        this.aparicao = aparicao;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

}
