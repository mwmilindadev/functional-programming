import java.util.List;

public class FP01Structure {
    public static void main(String[] args) {
        printAllNumbersStructure(List.of(12, 15, 9, 2, 4, 5, 3, 1));
    }

    private static void printAllNumbersStructure(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
