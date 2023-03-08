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

//        Iterator iterator = arr.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(arr);

    }
}
