public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;

public AirTransportation(String name, int numberOfContainers) {
    this.name = name;
    this.numberOfContainers = numberOfContainers;
    setFees(4);
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getNumberOfContainers() {
    return numberOfContainers;
}
public void setNumberOfContainers (int numberOfContainers) {
    this.numberOfContainers = numberOfContainers;
}
@Override
public String getTransportType() {
    return "Air transport";
}
  @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());

        sb.append(String.format("\n%15s: %s\n", "Nome:", getName()));  
        sb.append(String.format("%15s: %s\n", "Número de contentores:", getNumberOfContainers()));
     
        return sb.toString();
}
}