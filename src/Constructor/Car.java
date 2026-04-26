package Constructor;

public class Car {
    // fields, attributes, properties
    String color;
    String brand;
    int speed;

    public static void  main(String[] args){
        Car car1=new Car();
        //we need to set speed value
        car1.speed=100;
        car1.run();
    }
    public void run(){
        System.out.println("car is running at "+speed);
    }

}
