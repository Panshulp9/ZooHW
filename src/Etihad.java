public class Etihad extends Airplane{
    public Etihad(){
        isDoubleDecker = false;
        numOfSeats = 478;
        System.out.println(isDoubleDecker);
        System.out.println(numOfSeats);
    }

    @Override
    public void livery() {
        System.out.println("Etihad Airways - Boeing 787-9");
        System.out.println("Manchester City livery");
    }
    public void destination(){
        System.out.println("Etihad Airways Flight Number EY7 Is Bound To:");
        System.out.println("Boston");
    }
}
