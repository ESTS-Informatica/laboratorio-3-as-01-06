public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;

public AirTransportation(String name, int numberOfContainers) {
    this.name = name;
    this.numberOfContainers = numberOfContainers;
    setFees(4);
}
}