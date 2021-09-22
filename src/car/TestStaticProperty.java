package car;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","v8");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda 10","v80");
        System.out.println(Car.numberOfCar);
    }
}
