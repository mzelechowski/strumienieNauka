import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMapMethod {
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
        Map<String, Car>  carsMap = cars.stream()
                .collect(Collectors.toMap(c->c.name, c ->c));
        System.out.println(carsMap);
        Car car1 = carsMap.get("Peugeot");
        System.out.println(car1);
    }
}
