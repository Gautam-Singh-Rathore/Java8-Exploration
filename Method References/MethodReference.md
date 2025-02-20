# Method Reference

Method reference is used to refer method of the functional interface. It is a compact and easy form of a lambda expression.

Each time when you are using a lambda expression to just referring a method, you can replace your lambda expression with a method reference.

```java
Printable printableLambda = (String msg) -> System.out.println(msg);
printableLambda.print("Hello");

Printable printable = System.out::println;
printable.print("Hello")
```
### Types of Method Reference
There are four types of method reference in Java :
1. Method reference to static method : its syntas is ```Class::StaticMethodName```
2. Reference to an instance method of a particular object : the syntax is ```Object::instanceMethodName```
3. Reference to an instance method of an arbitrary object of specific type : the synatx is ```Class::instanceMethodName```
4. Reference to a constructor : its syntax is ```ClassName::new```