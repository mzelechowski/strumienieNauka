import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CountMethod {
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

        int numCars = (int) cars.stream().filter(c-> c.topSpeed >=200 )
                .count();   // zwaraca long, wiec trzeba zrobi rzutowanie na inta
        System.out.println("Liczba samochod z predkosciom " +
                "topSpeed >=200 wynosi: "+numCars);
        System.out.println(" a oto lista tych samochodow");
        List<Car> carsList200 =cars.stream().filter(c->c.topSpeed>=200)
                .collect(Collectors.toList());
        Iterator iterator = carsList200.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
