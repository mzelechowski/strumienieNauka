import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class SummingInt {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Fiat", 180, 180000, 3));
        cars.add(new Car("Peugeot", 210, 220000, 4));
        cars.add(new Car("BMW", 320, 320000, 6));
        cars.add(new Car("Porsche", 350, 450000, 7));
        cars.add(new Car("GMC", 170, 170000, 3));
        cars.add(new Car("GMC", 170, 170000, 3));
        cars.add(new Car("GMC1a", 170, 170000, 3));
        cars.add(new Car("Opel", 220, 150000, 3));

        int totalCarsPrice=cars.stream().collect(Collectors.
                summingInt(c -> c.price));
        System.out.println("Suma wszystkich aut wynosi: "+totalCarsPrice);
        Iterator iterator = cars.iterator();
        int sumOfPrice=0;
        for(Car s:cars){
            sumOfPrice+=s.price;
            System.out.println("Sumowanie krokowe: "+sumOfPrice);
        }

    }
}
