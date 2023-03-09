import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinMethod {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Fiat", 180, 180000, 3));
        cars.add(new Car("Peugeot", 210, 220000, 4));
        cars.add(new Car("BMW", 359, 320000, 6));
        cars.add(new Car("Porsche", 350, 450000, 7));
        cars.add(new Car("GMC3", 170, 170000, 3));
        cars.add(new Car("GMC2", 170, 170000, 3));
        cars.add(new Car("GMC1a", 170, 170000, 3));
        cars.add(new Car("Opel", 220, 180000, 3));
        // Wyszukiwanie samochodu z maksymalną ceną
        Car carHighestPrice = cars.stream()
                .max((c1, c2) -> c1.price > c2.price ? 1 : -1)
                .get();
        System.out.println("Car highest price: " + carHighestPrice);

        // Wyszukiwanie samochodu z minimalną ceną
        Car carLowestPrice = cars.stream()
                .min((c1, c2) -> c1.price > c2.price ? 1 : -1)
                .get();
        System.out.println("Car lowest price: " + carLowestPrice);
        // Samochód z najwyższą prędkością
        Car carHighestSpeed =  cars.stream()
                .max((c1, c2) -> c1.topSpeed > c2.topSpeed ?1 :-1)
                .get();
        System.out.println("Car with highest speed: " + carHighestSpeed);
    }
}
