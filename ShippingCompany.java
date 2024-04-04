import java.util.HashSet;
import java.util.ArrayList;

public class ShippingCompany extends HashSet<Transport> {
    private String name;
    private ArrayList<Transport> inService;
    
public ShippingCompany (String name) {
    this.name=name;
    this.inService = new ArrayList<Transport>();
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public ArrayList<Transport> getInService() {
    return inService;
}
public void setName(ArrayList<Transport> inService) {
    this.inService = inService;
}
@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());

        sb.append(String.format("\n%15s: %s\n", "Nome:", getName()));  
        sb.append(String.format("\n%15s: %s\n", "Transportes em serviço:", getInService()));
        return sb.toString();

}
private Transport getTransportation(String id){
    for (Transport transport : this) {
        if(transport.getId().equals(id) && transport.isAvailable()) {
            return transport;
        }
    }
    return null;
}
public boolean makeTransportation(String id, String origin, String Destination, int price) {
    Transport transport = getTransportation(id);
    if ( transport != null) {
        transport.setOrigin(origin);
        transport.setDestination(Destination);
        transport.setPrice(price);
        transport.setAvailable(false);
        inService.add(transport);
        remove(transport);
        return true;
    }
    return false;
    }
public boolean finalizeTransportation(String id) {
    Transport transport = getTransportation(id);
    if(transport !=null){
        transport.setOrigin("");
        transport.setDestination("");
        transport.setPrice(0.0);
        transport.setAvailable(true);
    add(transport);
    inService.remove(transport);
    return true;}
    return false;
}
}
