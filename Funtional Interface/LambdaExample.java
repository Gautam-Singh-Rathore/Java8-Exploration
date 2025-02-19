@FunctionalInterface
interface Shape{
    void draw();
}

public class LambdaExample {
    public static void main(String[] args) {
        Shape rect = ()-> System.out.println("Rectangle shape...");
        rect.draw();
    }

    
}