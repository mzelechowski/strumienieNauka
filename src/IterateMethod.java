import java.util.stream.Stream;

public class IterateMethod {
    public static void main(String[] args) {
        Stream.iterate(0,n->n+1)
                .limit(4)   // dajemy limit ze wzgledu na brak ograniczneia warunku
                .forEach(n -> System.out.println(n));

        Stream.iterate(0,n-> n < 8, n-> n+2)
                .forEach(n-> System.out.println(n));

        Stream.iterate(0, n-> n+3)
                .limit(5)     // dajemy limit ze wzgledu na brak ograniczneia warunku
                .forEach(n-> System.out.println(n));

        Stream.iterate(5, n->n*2)
                .limit(5)
                .forEach(n-> System.out.println(n));
    }
}
