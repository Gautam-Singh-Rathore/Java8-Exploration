import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String msg);
}

public class MethodReferenceDemo {

    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int add(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        // 1. Method reference to a static method
            // Using lambda expression
        Function<Integer , Double> function = (in)-> Math.sqrt(in);
        System.out.println(function.apply(4));

            // Using method reference
        Function<Integer , Double> functionMethodReference = Math::sqrt;
        System.out.println(functionMethodReference.apply(9));

            //Using Lambda expression
        BiFunction<Integer , Integer , Integer> biFunction = (a,b)-> MethodReferenceDemo.add(a, b);
        System.out.println(biFunction.apply(10, 20));

            // Using method reference
        BiFunction<Integer , Integer , Integer> bFunctionMethodRefrence = MethodReferenceDemo::add;
        System.out.println(bFunctionMethodRefrence.apply(20, 30));

        // -----------------------------------------------------------------------------------------------------

        // 2. Method reference to a instance method of an object
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
            // Using lamdba expression
        Printable printable = (msg)-> methodReferenceDemo.display(msg);
        printable.print("Hello world !!!");
            // Using method reference
        Printable printableMethodRrference = methodReferenceDemo::display;
        printableMethodRrference.print("Hello world part 2 !!!");

        // -----------------------------------------------------------------------------------------------------

        // 3. Method to the instance of an arbitrary object 
        // Sometimes, we call a method of argument in the lambda expression.
        // In that case, we can use a method reference to call an instance
        // method of an arbitrary object of a specific type.

        Function<String , String> strFunction = (input)-> input.toLowerCase();
        System.out.println(strFunction.apply("Heyy "));

        Function<String , String> sFunction = String::toLowerCase;
        System.out.println(sFunction.apply("heyy techie"));

        // -----------------------------------------------------------------------------------------------------

        // 4.Reference to a constructor

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Watermelon");

            // Using lambda function
        Function<List<String> , Set<String>> seFunction = (fruitsList)-> new HashSet(fruitsList);
        System.out.println(seFunction.apply(fruits));

            // Usinh method reference
        Function<List<String> , Set<String>> seFunctionMethodReference =  HashSet::new;
        System.out.println(seFunctionMethodReference.apply(fruits));


    }
    
}
