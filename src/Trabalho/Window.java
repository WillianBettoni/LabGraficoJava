package Trabalho;

public class Window {

    private double CoordXMin;
    private double CoordXMax;
    private double CoordYMin;
    private double CoordYMax;

    public Window() {
        this.CoordXMin = -1000;
        this.CoordXMax = 1000;
        this.CoordYMin = -1000;
        this.CoordYMax = 1000;
    }

    public double getCoordXMin() {
        return CoordXMin;
    }

    public void setCoordXMin(double CoordXMin) {
        this.CoordXMin = CoordXMin;
    }

    public double getCoordXMax() {
        return CoordXMax;
    }

    public void setCoordXMax(double CoordXMax) {
        this.CoordXMax = CoordXMax;
    }

    public double getCoordYMin() {
        return CoordYMin;
    }

    public void setCoordYMin(double CoordYMin) {
        this.CoordYMin = CoordYMin;
    }

    public double getCoordYMax() {
        return CoordYMax;
    }

    public void setCoordYMax(double CoordYMax) {
        this.CoordYMax = CoordYMax;
    }  
}