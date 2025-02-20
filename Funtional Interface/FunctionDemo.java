import java.util.function.Function;

// Traditional way
class FunctionImpl implements Function<String , Integer>{

    @Override
    public Integer apply(String t) {
        return t.length();
    }
    
}
public class FunctionDemo {
    public static void main(String[] args) {

        Function<String , Integer> function = new FunctionImpl();
        System.out.println(function.apply("Gautam"));

        // Using Lamdba Expression
        Function<String , Integer> fun = (str)-> str.length();
        System.out.println(fun.apply("Gautam")); 
    }
    
}
