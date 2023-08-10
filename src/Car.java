public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;

    public Car(String brand, String color, String licensePlate, MyDate registrationDate, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        this.engine = engine;
    }

    public String toString() {
        return color + " " + brand + " (" + licensePlate + " " + registrationDate.toString() + " )" + engine.toString();
    }

    public void drive() {
        engine.start();
        System.out.println("The Car " + toString() + " " + "DRIVE!!!");
    }

    public void stop() {
        engine.stop();
        System.out.println("The Car " + toString() + " " + "STOP!!!");
    }

}
