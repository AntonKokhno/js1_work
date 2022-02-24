

public class Hello {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello World " + args[0]);
      Car myCar;
      myCar= new Car();
      myCar.getPrice();
      System.out.println(myCar.price );
        System.out.println(myCar.model );

    }
}
class Car{
    int price;
    String model ;
    public int getPrice() {
        return 100;
    }
}