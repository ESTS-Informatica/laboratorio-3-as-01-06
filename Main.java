public class Main {
    public static void main(String[] args) {
        ShippingCompany company = new ShippingCompany("RELIABLE-MOVING");
        
        GroundTransportation groundTransportation = new GroundTransportation("Carro");
        groundTransportation.setLicensePlate("12");
        groundTransportation.setOrigin("Porto");
        groundTransportation.setDestination("Lisboa");
        groundTransportation.setPrice(400);
        company.add(groundTransportation);
        
        AirTransportation airTransportation1 = new AirTransportation("Boeing", 50);
        airTransportation1.setOrigin("Dubai");
        airTransportation1.setDestination("Hong Kong");
        airTransportation1.setPrice(1200);
        company.add(airTransportation1);
        
        AirTransportation airTransportation2 = new AirTransportation("AirBus", 760);
        airTransportation2.setOrigin("New York");
        airTransportation2.setDestination("Lisboa");
        airTransportation2.setPrice(2300);
        company.add(airTransportation2);
        
        Lorry lorry = new Lorry(15, 2, "Camião");
        lorry.setOrigin("Madrid");
        lorry.setDestination("Barcelona");
        lorry.setPrice(100);
        company.add(lorry);
        
        Van van = new Van(32, "Van");
        van.setOrigin("Madrid");
        van.setDestination("Guimarães");
        van.setPrice(40);
        company.add(van);
        
    }
}