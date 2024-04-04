public class GroundTransportation extends Transport{
    private String licensePlate;
    
public GroundTransportation(String licensePlate) {
    this.licensePlate = licensePlate;
    setFees(3);
}

}