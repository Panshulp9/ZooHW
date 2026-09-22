public class Emirates extends Airplane {
    private int numOfFlights;
Emirates(){
    isDoubleDecker = true;
    numOfFlights = 389;
}

public int getNumOfFlights(){
    return numOfFlights;
}

public void setNumOfFlights(int numOfFlights){
    this.numOfFlights = numOfFlights;
}

    @Override
    public void livery() {
        System.out.println("Emirates - Airbus 380");
        System.out.println("Dubai Expo livery");
    }

    @Override
    public void destination() {
        System.out.println("Emirates Flight Number EK237 Is Bound To;");
        System.out.println("Boston");
    }
}
