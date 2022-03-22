package Trabalho;

import java.awt.Color;

public class Polilinha {
    private String nome;
    private Color cor;
    private double x[];
    private double y[];

    public Polilinha() {
    }

    public Polilinha(double x[], double y[], String nome, Color cor) {
        this.x = x;
        this.y = y;
        this.nome = nome;
        this.cor = cor;
    }
    
    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public void setX(double x[]) {
        this.x = x;
    }

    public void setY(double y[]) {
        this.y = y;
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

    public void setNome(String nome) {
        this.nome = nome;
    }
}