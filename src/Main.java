public class Main {
    public static void main(String[] args) {
      Circle circle=new Circle(3.5);
      Square square=new Square(4.8);
      Rectangle rectangle=new Rectangle(4.6,5.5);
      AbstractShape [] abstractShapes={circle,square,rectangle};
      for(AbstractShape i:abstractShapes){
          System.out.println(i.getClass().getSimpleName()+"  perimetr="+i.getPerimetr());
      }
    }
}