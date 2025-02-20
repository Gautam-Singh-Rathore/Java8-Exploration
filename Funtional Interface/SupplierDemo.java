import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<LocalDateTime>{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }

}

public class SupplierDemo {
    public static void main(String[] args) {
        
        Supplier<LocalDateTime> sup = ()-> LocalDateTime.now();
        System.out.println(sup.get());
    }
    
}
