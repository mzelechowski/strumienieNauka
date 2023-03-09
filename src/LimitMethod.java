import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
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

        List<Car> carsListLimited=cars.stream().filter(c -> c.price < 400000)
                .limit(4)
                .collect(Collectors.toList());
        carsListLimited.stream().forEach(c -> System.out.println(c));
    }
}
