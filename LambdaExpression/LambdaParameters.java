@FunctionalInterface 
interface Addable {

    public static void hi(){
        System.out.println("Hello I am addable..");
    }
    // Abstract method
    int addition(int a , int b);
}

public class LambdaParameters {
    public static void main(String[] args) {

        // Addable addImpl = (a,b)-> a+b;
        // int result = addImpl.addition(10, 20);
        // System.out.println(result);

        Addable impl = (int a,int b)->{
            int c=a+b;
            return c;
        };
    }
    
}
