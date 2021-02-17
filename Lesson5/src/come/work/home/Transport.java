package come.work.home;

public class Transport  {
    private int capacity;
    private int speed;
    private int body;
    private String model;


    public Transport() {

    }

    public Transport(String model, int capacity, int body, int speed) {
        this.model = model;
        this.capacity = capacity; //hp
        this.body = body;         // kg
        this.speed = speed;        //km/h

    }

    public void info(){
        System.out.println("My car : " + model + capacity + body + speed);

    }



    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



}
