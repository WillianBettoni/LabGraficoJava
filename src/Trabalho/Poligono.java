package Trabalho;

import java.awt.Color;

public class Poligono {
    private String nome;
    private int pontos;
    private Color cor;
    private double x[];
    private double y[];

    public Poligono() {
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Poligono(double x[], double y[], int pontos, String nome, Color cor) {
        this.x = x;
        this.y = y;
        this.pontos = pontos;
        this.nome = nome;
        this.cor = cor;
    }

    public void setX(double x[]) {
        this.x = x;
    }

    public void setY(double y[]) {
        this.y = y;
    }
    
    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public double[] getX() {
        return x;
    }

    public double[] getY() {
        return y;
    }

    public String getNome() {
        return nome;
    }
    
    public int getPontos(){
        return pontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}