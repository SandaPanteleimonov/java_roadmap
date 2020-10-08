
package Week2_3;

public class Transport {
    private int numberPerson;
    private int volumeFuel;
    private int consum;

    public Transport(int numberPerson, int volumeFuel, int consum) {
        this.numberPerson = numberPerson;
        this.volumeFuel = volumeFuel;
        this.consum = consum;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public int getVolumeFuel() {
        return volumeFuel;
    }

    public void setVolumeFuel(int volumeFuel) {
        this.volumeFuel = volumeFuel;
    }

    public int getConsum() {
        return consum;
    }

    public void setConsum(int consum) {
        this.consum = consum;
    }
}




























/*
public class Transport {
    /*Define variables;
    capacityPerson - how many person can be transported;
    volumeFuel - fuel consumed by each transport type;
    quantityTransport - how many times transport should pass route;
    */
/*
    private int capacityPerson;
    private int volumeFuel;
    private int numberRoutes;
    private String nameTransport;

    //Generate constructor, getters and setters

    public Transport(int capacityPerson, int volumeFuel, String nameTransport) {
        setVolumeFuelConsume(volumeFuel);
        setCapacityPerson(capacityPerson);
        setNumberRoutes(0);
        setNameTransport(nameTransport);
    }

    public double getVolumeFuelConsume() {

        return volumeFuel;
    }

    public void setVolumeFuelConsume(int volumeFuel) {

        this.volumeFuel = volumeFuel;
    }

    public int getCapacityPerson() {

        return capacityPerson;
    }

    public void setCapacityPerson(int capacity) {

        this.capacityPerson = capacity;
    }

    public int getNumberRoutes() {
        return numberRoutes;
    }

    public void setNumberRoutes(int numberRoutes) {

        this.numberRoutes = numberRoutes;
    }

    public String getNameTransport() {

        return nameTransport;
    }

    public void setNameTransport(String name) {

        this.nameTransport = name;
    }

}
*/