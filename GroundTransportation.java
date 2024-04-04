public class GroundTransportation extends Transport{
    private String licensePlate;
    
public GroundTransportation(String licensePlate) {
    this.licensePlate = licensePlate;
    setFees(3);
}
public String getLicensePlate(){
    return licensePlate;
}
public void setLicensePlate(String licensePlate){
    this.licensePlate = licensePlate;
}
@Override
public String getTransportType() {
    return "Ground transport";
}

}