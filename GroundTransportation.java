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
@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());

        sb.append(String.format("\n%15s: %s\n", "Matrícula:", getLicensePlate()));  
        return sb.toString();
}}