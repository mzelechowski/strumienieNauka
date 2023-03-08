import java.util.Arrays;
import java.util.List;

public class ZadanieMateusza002 {
    public static void main(String[] args) {
        //Na podstawie listy słów, wypisz w konsoli wyrazy zaczynjące się na literę "a",
        //wartości powinny posiadać dużą pierwszą literę
        List<String> stringList = Arrays.asList("ala", "samochód", "kot", "aleksandra", "pise", "azor");
        stringList.stream().filter(s->s.startsWith("a"))
                .forEach(s-> System.out.println(s.substring(0, 1).toUpperCase()+s.substring(1)));
    }
}
