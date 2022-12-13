import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 15, 9, 2, 4, 5, 3, 1);
        //printAllNumbersInFunctional(numbers);
        printAllEvenNumbersInFunctional(numbers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printAllEvenNumbersInFunctional(List<Integer> numbers) {
        numbers
                .stream()
                .filter(FP01Functional::isEven)//filter only even numbers
                .forEach(System.out::println);//Method reference
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInFunctional(List<Integer> numbers) {
        numbers.stream().forEach(FP01Functional::print);

    }


}
