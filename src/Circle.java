public class Circle extends AbstractShape {


    public Circle(double a) {
        super(a);
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*getA();
    }
}
