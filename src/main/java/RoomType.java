public enum RoomType {

    SINGLE(1, 45.0),
    DOUBLE(2, 90.0),
    GROUP(5, 200.0);


    private final int capacity;
    private final double price;

    RoomType(int capacity, double price) {
        this.capacity = capacity;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

}
