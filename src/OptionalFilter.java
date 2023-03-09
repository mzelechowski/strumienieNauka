import java.util.Optional;

public class OptionalFilter {
    public static void main(String[] args) {
        String tekst = "Tekst ze Stringu";
        //String tekst =null;

        Optional<String> opt = Optional.ofNullable(tekst);
        opt.map(str -> str + " oraz inforamcje")
                .filter(str -> str.length()>5)
                .or(() -> Optional.ofNullable("Nowy String"))
                .ifPresent(System.out::println);
    }
}
