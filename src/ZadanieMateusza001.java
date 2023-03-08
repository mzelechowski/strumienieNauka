import java.util.Arrays;
import java.util.List;

public class ZadanieMateusza001 {
    public static void main(String[] args) {
        //Mają listę liczb wypisz w konsli list liczb parzystych pomnożonych przez 100
        List<Integer> integerList = Arrays.asList(1,3,4,10,9,13,16);
        integerList.stream().filter(i -> i%2!=0).forEach(i -> System.out.println(i*100));
    }
}
