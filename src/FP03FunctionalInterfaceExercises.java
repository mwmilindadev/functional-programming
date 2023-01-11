import java.util.List;
import java.util.function.*;

public class FP03FunctionalInterfaceExercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 15, 9, 2, 4, 5, 3, 1,12,15,8);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> squareFunction = x -> x * x;
        Consumer<Integer> sysOutConsumer = System.out::println;
        //numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(sysOutConsumer);

        Predicate<Integer> integerPredicate = x -> x % 2 != 0;
        //getaVoid(numbers, integerPredicate);
        //getaVoid(numbers, x->x%3==0);

        BinaryOperator<Integer> sum1 = Integer::sum;
        int sum=numbers.stream().reduce(0, sum1);


        BiPredicate<Integer,String> ers= (number,str)-> {
            return number < 10 && str.length()>5;
        };
        System.out.println(ers.test(8,"dfdfdfdf"));

        BiFunction<Integer,String,String> biFunction= (number,str)->{
            return number+""+str;
        };
        System.out.println(biFunction.apply(5,"sdfghtyt"));

        BiConsumer<Integer,String>biConsumer = (s1,s2)->{
            System.out.println(s1);
            System.out.println(s2);
        };
       biConsumer.accept(5,"ssdsdsdsd");

    }

    private static void getaVoid(List<Integer> numbers, Predicate<Integer> integerPredicate) {
        numbers.stream().filter(integerPredicate).forEach(System.out::print);
    }


}
