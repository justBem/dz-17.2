public class Square extends AbstractShape{


    public Square(double a) {
        super(a);
    }

    @Override
    public double getPerimetr() {
        return 4*getA();
    }
}
