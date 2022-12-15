import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 15, 9, 2, 4, 5, 3, 1);
        List<Integer> squareNumber= squreList(numbers);
        List<Integer> evenNumbersOnly= numbers.stream().filter(x-> x%x==0).collect(Collectors.toList());
        //printAllNumbersStructure(numbers);
        //printAllEvenNumbersStructure(numbers);
        List<Integer> doubleNumber=doubleList(numbers);

        List<String> courses =List.of("Spring","Spring Boot","API","AWS","Docker","Kubernates");
        List<Integer> courseLength=courses.stream().map(x->x.length()).collect(Collectors.toList());
        System.out.println("courseLength"+courseLength);
        System.out.println(evenNumbersOnly);
        System.out.println(squareNumber);
        //int sum = addListStructuredNumber(numbers);
        //System.out.println(sum);
    }

    private static List<Integer> squreList(List<Integer> numbers) {
        return numbers.stream().map(number->number*number).collect(Collectors.toList());
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream().map(number -> number*number).collect(Collectors.toList());
    }

    private static int sum(int a,int b){
        return  a+b;
    }
    private static int addListStructuredNumber(List<Integer> numbers) {
        //return numbers.stream().reduce(0,FP02Functional::sum);
        return numbers.stream().reduce(0,Integer::sum);


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
