import java.util.Comparator;
import java.util.List;

public class FP02Exersices {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 15, 9, 2, 4, 5, 3, 1,12,1,1);
        //printAllNumbersStructure(numbers);
        //printAllEvenNumbersStructure(numbers);
        //int sum = addListStructuredNumber(numbers);
        //System.out.println(sum);
        printDistinctAndSotredAll(numbers);

        List<String> courses =List.of("Spring","Spring Boot","API","AWS","Docker","Kubernates");
        //courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);//
        courses.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
    }

    private static void printDistinctAndSotredAll(List<Integer> numbers) {
        numbers.stream().distinct().sorted().forEach(System.out::println);
    }

    private static void printDistinctAll(List<Integer> numbers) {
        numbers.stream().distinct().forEach(System.out::println);
    }

    private static int addListStructuredNumber(List<Integer> numbers) {
        int sum=0;
        for(int number: numbers){
            sum +=number;

        }

        return sum;
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
