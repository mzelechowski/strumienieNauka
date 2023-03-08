public class Car {
    public String name;
    public int topSpeed;
    public int price;
    public int rating; //1-5

    public Car(String name, int topSpeed, int price, int rating) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
