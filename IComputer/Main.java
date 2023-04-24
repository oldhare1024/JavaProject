package IComputer;

import java.util.Scanner;

// Define the IComputer interface with an abstract method computer that takes in two integers as parameters
interface IComputer {
    int computer(int one, int two);
}

// Create the Add class that implements the IComputer interface and performs addition
class Add implements IComputer {
    public int computer(int one, int two) {
        return one + two;
    }
}

// Create the Sub class that implements the IComputer interface and performs subtraction
class Sub implements IComputer {
    public int computer(int one, int two) {
        return one - two;
    }
}

// Create the Mul class that implements the IComputer interface and performs multiplication
class Mul implements IComputer {
    public int computer(int one, int two) {
        return one * two;
    }
}

// Create the Div class that implements the IComputer interface and performs division
class Div implements IComputer {
    public int computer(int one, int two) {
        return one / two;
    }
}

// Create the UseComputer class that contains a method useCom that takes in an IComputer object and two integers as parameters
class UseComputer {
    public static void useCom(IComputer com, int one, int two) {
        // If the IComputer object is an instance of Div and the second parameter is 0, output an error message
        if (com instanceof Div && two == 0) {
            System.out.println("Divide by zero, meaningless");
        } else {
            // Otherwise, call the computer method of the IComputer object and output the result
            int result = com.computer(one, two);
            System.out.println(result);
        }
    }
}

// In the main method, create instances of the Add, Sub, Mul, and Div classes and call the useCom method of the UseComputer class to perform calculations
public class Main{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        UseComputer.useCom(new Add(),a,b);
        UseComputer.useCom(new Sub(),a,b);
        UseComputer.useCom(new Mul(),a,b);
        UseComputer.useCom(new Div(),a,b);
    }
}