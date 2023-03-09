import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapReferenceToMethod {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Fiat", 180, 180000, 3));
        cars.add(new Car("Peugeot", 210, 220000, 4));
        cars.add(new Car("BMW", 320, 320000, 6));
        cars.add(new Car("Porsche", 350, 450000, 7));
        cars.add(new Car("GMC3", 170, 170000, 3));
        cars.add(new Car("GMC2", 170, 170000, 3));
        cars.add(new Car("GMC1a", 170, 170000, 3));
        cars.add(new Car("Opel", 220, 150000, 3));
        // Lista cen mniejszych od 300000
        List<Integer> carPricesList = cars.stream()
               .filter(c -> c.price < 300000)
                .map(Car::getPrice).collect(Collectors.toList());
        System.out.println(carPricesList);
        // Set cen mniejszych od 300000
        Set<Integer> carPricesSet = cars.stream()
                .filter(c -> c.price < 300000)
                .map(Car::getPrice).collect(Collectors.toSet());
        System.out.println(carPricesSet);
    }
}
