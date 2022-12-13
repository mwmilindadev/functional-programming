import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        
        printAllNumbersInFunctional(List.of(12, 15, 9, 2, 4, 5, 3, 1));
    }
    private static void print(int number) {
        System.out.println(number);
    }
    private static void printAllNumbersInFunctional(List<Integer> numbers) {
        numbers.stream().forEach(FP01Functional::print);

    }

}
