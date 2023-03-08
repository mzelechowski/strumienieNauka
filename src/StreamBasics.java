import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasics {
    public static void main(String[] args) {
        String[] nameList = {"Maciek", "Asia", "Marek", "Zosia"
                , "Wojtek", "Bartek", "Włodzimierz", "Lukasz"
                , "Bartłomiej", "Piotr", "Paulina"};
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int index = (int) (Math.random() * nameList.length);
            names.add(nameList[index]);
        }
        System.out.println(names);
        System.out.println("Po przefiltowaniu steamem");
        names.stream().filter(str -> str.length() > 3 && str.length()<=5)
                .filter(str -> str.startsWith("A") || str.startsWith("P"))
                .forEach(str-> System.out.println(str));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Fiat", 180, 180000, 3));
        cars.add(new Car("Peugeot", 210, 220000, 4));
        cars.add(new Car("BMW", 320, 320000, 6));
        cars.add(new Car("Porsche", 350, 450000, 7));
        cars.add(new Car("GMC", 170, 170000, 3));
        cars.add(new Car("Opel", 220, 150000, 3));
        cars.stream().filter(c -> c.rating>3)
                .filter(c->c.price >=20000 && c.price < 400000)
                .filter(c->c.topSpeed>=200 && c.topSpeed<300)
                .forEach(c-> System.out.println(c.toString()));
        System.out.println("\npzypisanie wyniku filtracji do nowej listy\n");
        List<Car> carsFilter = cars.stream().filter(c -> c.rating>3)
                .filter(c->c.price >=20000 && c.price < 400000)
                .filter(c->c.topSpeed>=200 && c.topSpeed<300)
                .collect(Collectors.toList());
        ArrayList<Car> carArrayFilterList = new ArrayList<>(carsFilter);
        ArrayList<Car> carArrayFilterList1 = new ArrayList<>(cars.stream().filter(c -> c.rating>3)
                .filter(c->c.price >=20000 && c.price < 400000)
                .filter(c->c.topSpeed>=200 && c.topSpeed<300)
                .collect(Collectors.toList()));
        carArrayFilterList.stream().forEach(c -> System.out.println(c));

//        Iterator iterator = names.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(names);

    }
}
