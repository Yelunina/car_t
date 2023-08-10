
/*#1 Создать класс Car со следующими полями (String brand, String color, String licensePlate,
 MyDate registrationDate, Engine engine}
Оьратите внимание, поля registrationDate и engine - это тоже объект.
Engine - содержит информация о мощности двигателя и о типе (бензин, дизель, электро).
Реализуйте метод toString в каждом классе.
Реализуйте метод конструктор в каждом классе.
Создайте два объекта автомобиля.
*/
public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(10, 4, 2017);
        Engine engine1 = new Engine(175, "benzine");
        Car car1 = new Car("Audi", "black", "AAA7788", date1, engine1);
        Car car2 = new Car("BMW", "white", "AAA7788", new MyDate(21, 8, 2022), new Engine(239, "disel"));
        Car carWithProblem = new Car("WV", "gray", "BBB5544", new MyDate(11, 6, 2021), engine1);

        Car[] cars = {car1, car2, carWithProblem};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());

        }
        System.out.println("-----------GO---------------");
        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }
        System.out.println("---------------test the second drive() call------");
        cars[0].drive();
        System.out.println("-----------STOP---------------");
        for (int i = 0; i < cars.length; i++) {
            cars[i].stop();
            cars[i].drive();
            cars[i].stop();
        }

    }
}