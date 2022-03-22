package Trabalho;

import java.awt.Color;

public class Ponto {
    private String nome;
    private double x;
    private double y;
    private int diametro;
    private Color cor;

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
    
    public Ponto (){}
    
    public Ponto (double x, double y, int diametro, String nome, Color cor){
        this.x = x;
        this.y = y;
        this.nome = nome;
        this.diametro = diametro;
        this.cor = cor;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }  

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getNome() {
        return nome;
    }

    public int getDiametro() {
        return diametro;
    }
}