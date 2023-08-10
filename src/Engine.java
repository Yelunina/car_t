public class Engine {
    int power;
    String type;
    boolean isStarted = false;

    public Engine(int power, String type) {
        this.power = power;
        this.type = type;
    }

    public String toString() {
        return "Engane: " + type + " " + power;
    }

    public void start() {
        if (!isStarted){
            isStarted=true;
            System.out.println("The engine is started");
        }

    }

    public void stop() {
        if (isStarted){
            isStarted=false;
            System.out.println("The engine is stop");
        }

    }
}
