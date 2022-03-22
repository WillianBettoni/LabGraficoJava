package Trabalho;

public class ViewPort {

    private double XMin;
    private double XMax;
    private double YMin;
    private double YMax;
    private Window window;

    public ViewPort(Window window) {
        XMin = 0;
        XMax = 1000;
        YMin = 0;
        YMax = 1000;
        this.window = window;
    }

    public double getXMin() {
        return XMin;
    }

    public void setXMin(double XMin) {
        this.XMin = XMin;
    }

    public double getXMax() {
        return XMax;
    }

    public void setXMax(double XMax) {
        this.XMax = XMax;
    }

    public double getYMin() {
        return YMin;
    }

    public void setYMin(double YMin) {
        this.YMin = YMin;
    }

    public double getYMax() {
        return YMax;
    }

    public void setYMax(double YMax) {
        this.YMax = YMax;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    
    public int transformadaX(double coordX) {
        double transformada = (XMin + ((coordX - (window.getCoordXMin())) / (((window.getCoordXMax())) - (window.getCoordXMin()))) * (XMax - XMin));
        return (int) transformada;
    }

    public int transformadaY(double coordY) {
        double transformada = (YMax - ((coordY - (window.getCoordYMin())) / (((window.getCoordYMax())) - (window.getCoordYMin()))) * (YMax - YMin));
        return (int) transformada;
    }
}