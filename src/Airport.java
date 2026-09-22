public class Airport {
    public static void main(String[] args) {
        Airport AUH = new Airport();
    }
    public Airport(){
        Etihad AUH = new Etihad();
        AUH.livery();
        AUH.destination();
        Emirates DXB = new Emirates();
        DXB.livery();
        DXB.destination();
        Qatar q = new Qatar();
        System.out.println(q.getDailyFlights());
        q.setDailyFlights(277);
        System.out.println(q.getDailyFlights());
        System.out.println(q.getNumOfExits());
        q.setNumOfExits(8);
        System.out.println(q.getNumOfExits());

    }
}
