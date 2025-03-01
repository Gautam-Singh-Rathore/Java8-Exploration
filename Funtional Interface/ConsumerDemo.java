import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String t) {
        System.out.println(t);
    }
    
}

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = new ConsumerImpl();
        consumer.accept("Hello World");

        Consumer<String> con = (str)-> System.out.println(str);
        con.accept("Hii ");
    }
    
}
