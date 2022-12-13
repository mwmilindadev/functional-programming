import java.util.List;

public class FP01Exersices {
    public static void main(String[] args) {

//        List<Integer> numbers = List.of(12, 15, 9, 2, 4, 5, 3, 1);
//        printAllOddNumbersInFunctional(numbers);

        List<String> courses =List.of("Spring","Spring Boot","API","AWS","Docker","Kubernates");

        //courses.stream().forEach(System.out::println);
        //courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
        courses.stream().filter(course-> course.length()>=4).forEach(System.out::println);

    }



//    private static void printAllOddNumbersInFunctional(List<Integer> numbers) {
//        numbers
//                .stream()
//                //.filter(FP01Functional::isEven)//filter only even numbers
//                .filter(number-> number%2==1)//lambda
//                .forEach(System.out::println);//Method reference
//    }

//    private static void print(int number) {
//        System.out.println(number);
//    }
//
//    private static void printAllNumbersInFunctional(List<Integer> numbers) {
//        numbers.stream().forEach(FP01Exersices::print);
//
//    }


}
