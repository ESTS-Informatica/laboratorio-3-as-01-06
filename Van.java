public class Van extends GroundTransportation {
    private int packages;
    
public Van(int packages, String licensePlate){
    super(licensePlate);
    this.packages = packages;
    
}
public int getPackages() {
    return packages;
}
public void setPackages(int packages){
    this.packages=packages;
}
@Override
public String getTransportType() {
    return "Van";
}
@Override
public String toString() {
    final StringBuilder sb = new StringBuilder(super.toString());

        sb.append(String.format("\n%15s: %s\n", "Pacotes:", getPackages())); 
        return sb.toString();
}
}