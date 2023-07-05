
////////////////////////////////////////////////////  GUI //////////////////////////////////////////
//import javax.swing.*;
////import java.swing.JOptionPane;
//
//public class concepts {
//    public static void main(String []args){
//
//        String name = JOptionPane.showInputDialog("Enter Your Name");
//        JOptionPane.showMessageDialog(null, "Hello " + name);
//
//        int age  = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age : "));  // integer.parseInt is use to convert into integer
//        JOptionPane.showMessageDialog(null, "You are  " + age + " Years Old");
//
//        double height  = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height : "));  // Double.parseDouble is use to convert into Double
//        JOptionPane.showMessageDialog(null, "You are  " + height + " cm");
//    }
//}


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//////////////////////////////////////   All Concepts //////////////////////////////////////////
// if Statement -> performs a block of code if it's condition evaluates to be true
// Switch  ->  statement that allows a variable to be tested for equality against a list of values
// Logic Operators  -> && = (AND) both conditions must be true
//                     || = (OR) either condition must be true
//                      ! = (NOT) reverse boolean value of a condition
// While Loop -> executes a block of code as long as it's condition remains true
// For Loop -> executes a block of code a limited amount of time
// nested loop -> a Loop inside a Loop
// Array -> used to store multiple values in a single variable
// 2D Array -> an array of arrays
// String ->  a reference data type that can store one or more characters reference data types have access to useful methods
// Wrapper Class -> Provides a way to use primitive data types as reference data types reference data types contain useful methods can be used with collections (ex - ArrayList)
//     primitivev=boolean             wrapper=Boolean
// Autoboxing = the autoboxing conversion that java compiler makes between the primitive type and their corresponding object wrapper classes
// unboxing = the reverse of autoboxing. Autoboxing conversion of wrapper class to primitive
// ArrayList -> a resizable array. Elements can be added and removed after compilation phase store reference data types.
// 2D ArrayList -> a dynamic list of lists you can change the size of these lists during runtime
//public class concepts {
//    public static void main(String []args) {
//
//        ArrayList<ArrayList<String>> groceryList = new ArrayList();
//
//
//        ArrayList<String> bakeryList = new ArrayList();
//        bakeryList.add("pasta");
//        bakeryList.add("donuts");
//
//        ArrayList<String> produceList = new ArrayList();
//        produceList.add("milk");
//        produceList.add("curd");
//
//        ArrayList<String> drinkList = new ArrayList();
//        drinkList.add("coke");
//        drinkList.add("spite");
//
//        groceryList.add(bakeryList);
//        groceryList.add(produceList);
//        groceryList.add(drinkList);
//
//        System.out.println(groceryList.get(1).get(0));
//
//    }
//}

//------------------------------------------------------------------------------------------------
// For-Each -> traversing technique to iterate through the elements in an array/collection less steps, more readable less flexible

//public class concepts {
//    public static void main(String []args){
////        String animals[] = {cat, dog, bird, lion};
//        ArrayList<String> animals = new ArrayList<>();
//
//        animals.add("cat");
//        animals.add("bird");
//        animals.add("dog");
//
//        for(String i : animals){
//            System.out.println(i);
//        }
//    }
//}

//----------------------------------------------------------------------------------------------------------
//  METHODS -> a block of code that is executed whenever it is upon
//  OVERLOADED method -> methods that share the same name but have different parameters method name + parameters = method signature
//  printf() -> an optional method to control, format, and display text to the console window
// two arguments = format string + (object/variable/value)
// %b, %c, %s, %d, %f = boolean, char, string, int, double

// OBJECTS -> an instance of a class that may contain attributes and methods
// example = (phone, desk, coffee, cup)

// CONSTRUCTOR -> special method that is called when an object is instantiated (created)
// Overloaded constructors -> multiple constructors within a class with the same name, but have different parameters
//  name + parameters = signature

// toString() = special method that all objects inherits, that returns a string that "textually represents" an object. it can be used both implicitly and explicitly.
// STATIC keyword -> modifier. A single copy of a variable/method is created and shared. The class "owns" the static member
// inheritance -> the process where one class acquires, the attributes and methods of another.
// OVERRIDING method -> Declaring a method in sub class, which is already present in parent class. done so that a child class give its own implementation.
// super keyword -> keyword refers to the superclass (parent) of an object very similar to the "this" keyword
// abstraction -> abstract classes cannot be instantiated, but they can have a subclass abstract methods are declared without an implementation
// Encapsulation -> attribute of a class will be hidden or private, Can be accessed only through methods (getters and setters) You should make attributes private if you don't have a reason to make them public/protected
// interface -> a template that can be applied to a class. similar to inheritance, but specifies what a class has/must do. classes can apply more than one interface, inheritance is limited to 1 super
// polymorphism -> the ability of an object to identify as more than one type
// exception -> an event that occurs during the execution of a program that, disrupts the normal flow of instructions

public class concepts {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        try {


            System.out.println("Enter a whole no. to divide : ");
            int x = sc.nextInt();

            System.out.println("Enter a whole no. to divide : ");
            int y = sc.nextInt();

            int z = x / y;

            System.out.println("Result : " + z);
        }catch (ArithmeticException e){
            System.out.println("You can not divide by Zero! ");
        }catch (InputMismatchException e) {
            System.out.println("You can not divide a number by String");
        }catch (Exception e){
            System.out.println("Something went Wrong");
        }finally {
           // System.out.println("This will always print...");
            sc.close();
        }
    }
}























