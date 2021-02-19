package come.work.home.model;

public class Passenger extends LandTransport {

    private String bodyType;
    private int numberOfPassengers;

    public Passenger(String model, int capacity, int body, int speed, int power, int wheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(model, capacity, body, speed, power, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void infoAutoPassenger(){
        System.out.println("Auto model : " + getModel()  + " \n  capacity hp : " + getCapacity() + "\n  body kg : " + getBody() +
                "\n max speed km/h : " + getSpeed()+ "\n power h : "+ getPower()  + "\n whells :" + getWheels()+ "\n fuel consumption, litres per 100 km: " + getFuelConsumption() +
                "\n body type :" + getBodyType() + "\n number of passengers : " + getNumberOfPassengers());
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}

