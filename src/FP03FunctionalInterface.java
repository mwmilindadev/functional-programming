import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 15, 9, 2, 4, 5, 3, 1,12,15,8);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> squareFunction = x -> x * x;
        Consumer<Integer> sysOutConsumer = System.out::println;
        numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(sysOutConsumer);

    }


}
