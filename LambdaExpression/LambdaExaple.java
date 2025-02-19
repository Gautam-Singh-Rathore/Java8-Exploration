@FunctionalInterface
interface Shape {
    void draw();
}

// Object oriented way of doing things
class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Rectangle class...");
    }
}
class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Square class...");
    }
}
class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Circle class...");
    }
}

// Main class 
public class LambdaExaple{
    public static void main(String[] args) {
        System.out.println("Hello !!");

        // Functional way of doing things
        Shape rectangle = ()-> System.out.println("Rectangle...");
        rectangle.draw();

        Shape square = ()-> System.out.println("Square...");
        square.draw();

        Shape circle = ()-> System.out.println("Circle...");
        circle.draw();

        print(rectangle);
        print(()-> System.out.println("Rohmbus..."));
    }

    private static void print(Shape shape){
        System.out.println("In print method........................");
        shape.draw();
    }
    
}