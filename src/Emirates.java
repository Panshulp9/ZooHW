public class Emirates extends Airplane {
Emirates(){
    isDoubleDecker = true;
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
