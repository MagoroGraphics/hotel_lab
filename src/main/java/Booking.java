public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;

    public Booking(Bedroom bedroom, int nightsBooked) {
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public double calculateTotalPrice(Bedroom bedroom){
        return nightsBooked * bedroom.getPriceFromEnum();
    }

}
