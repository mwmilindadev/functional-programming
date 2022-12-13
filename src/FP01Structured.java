import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 15, 9, 2, 4, 5, 3, 1);
        //printAllNumbersStructure(numbers);
        printAllEvenNumbersStructure(numbers);

    }

    private static void printAllEvenNumbersStructure(List<Integer> numbers) {

        for (int number:numbers){
            if(number%2==0){
                System.out.println(number);
            }
        }
    }

    private static void printAllNumbersStructure(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
