import java.util.ArrayList;
import java.util.Iterator;

public class StreamBasics {
    public static void main(String[] args) {
        String[] nameList = {"Maciek", "Asia", "Marek", "Zosia"
                , "Wojtek", "Bartek", "Włodzimierz", "Lukasz"
                , "Bartłomiej", "Piotr", "Paulina"};
        ArrayList<String> arrString = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int index = (int) (Math.random() * nameList.length);
            arrString.add(nameList[index]);
        }
        System.out.println(arrString);
        System.out.println("Po przefiltowaniu steamem");
        arrString.stream().filter(str -> str.length() > 3 && str.length()<=5)
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

//        Iterator iterator = arr.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(arr);

    }
}
