public class Engine {
    int power;
    String type;

    public Engine(int power, String type) {
        this.power = power;
        this.type = type;
    }

    public String toString() {
        return "Engane: " + type + " " + power;
    }
    public void start(){
        System.out.println("The engine is started");
    }
    public void stop(){
        System.out.println("The engine is stop");
    }
}
