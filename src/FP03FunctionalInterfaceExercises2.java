import java.util.List;
import java.util.function.*;

public class FP03FunctionalInterfaceExercises2 {

    private static void print(String s){
        System.out.println(s);

    }
    public static void main(String[] args) {
       List<String> course=List.of("Spring","Java","Cloud","EE","AWS");

       course.stream().
       //map(str->str.toUpperCase()).
       //forEach(System.out::println)
        map(String::toUpperCase).
               forEach(FP03FunctionalInterfaceExercises2::print);
    }




}
