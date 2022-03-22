package Trabalho;

public class Transformar {
    private double x;
    private double y;
    private double angulo;
    private int TipoTransformacao;
    
    public Transformar (){}
    
    public Transformar (double x, double y, double angulo, int tipoTransformacao){
        this.x = x;
        this.y = y;
        this.angulo = angulo;
        this.TipoTransformacao = tipoTransformacao;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public int getTipoTransformacao() {
        return TipoTransformacao;
    }

    public void setTipoTransformacao(int TipoTransformacao) {
        this.TipoTransformacao = TipoTransformacao;
    }
}