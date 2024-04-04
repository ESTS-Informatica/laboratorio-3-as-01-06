public class Lorry extends GroundTransportation{
    private int numberOfPallets;
    private int trailers;
    
public Lorry(int numberOfPallets, int trailers, String licensePlate) {
    super(licensePlate);
    this.numberOfPallets = numberOfPallets;
    this.trailers = trailers;
}
public int getNumberOfPallets(){
    return numberOfPallets;
}
public void setNumberOfPallets(int numberOfPallets){
    this.numberOfPallets = numberOfPallets;
}
public int getTrailers(){
    return trailers;
}
public void setTrailers(int trailers){
    this.trailers = trailers;
}
@Override
public String getTransportType() {
    return "Lorry";
}
@Override
public String toString() {
    final StringBuilder sb = new StringBuilder(super.toString());

        sb.append(String.format("\n%15s: %s\n", "Número de Paletes:", getNumberOfPallets())); 
        sb.append(String.format("\n%15s: %s\n", "Número de Atrelados:", getTrailers())); 
        return sb.toString();
}
}