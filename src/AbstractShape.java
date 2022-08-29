public  abstract class AbstractShape {
    private double a;

    public AbstractShape(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public abstract double getPerimetr();
}
