import java.util.Scanner;
/*  this is my first guide and i am still learning so i will work on this as time goes on*/
//Scanner is used to take human input
// This is for the fundamentals of Java
 public class AgePrinter {
    public static void main(String[] args) {
        int userAge;

        System.out.print("Enter your age: ");
        Scanner scnr = new Scanner(System.in);
        userAge = scnr.nextInt();
        System.out.println(userAge + " is a great age.");
    }
}
/*int userAge; is how Java declares variables. You start with the data type and then the variable name.
int is the keyword for the integer data type
userAge is the variable name
System.out.print() is how you print something to the terminal. 
Scanner is the keyword to get input from the user
scnr.nextInt is what is used to get the next integer from the user input
System.out.println() will print what is inside the parentheses and end with a newline 
The difference between ending in print & println is: System.out.print() will print out to the same line while System.out.println will end with a new line 
so anything printed after will be on the next line.*/

// FOR PUBLIC CLASSES, FILENAME AND CLASS NAME MUST MATCH IN VSCODE
//AgePrinter.java and Public Class AgePrinter match


