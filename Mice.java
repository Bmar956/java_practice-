//This example is about assigning variables
// = in Java means assignment not equals

public class Mice {
    public static void main(String[] args) {
        int litterSize;
        int yearlyLitters;
        int annualMice;

        litterSize = 3;
        yearlyLitters = 5;

        System.out.print("One female mouse may give birth up to ");
        annualMice = litterSize * yearlyLitters;
        System.out.println(annualMice + " mice, in a year");

/*As you can see we have 3 int variable declarations as well as 2 being assigned with actual integers from the start.
however we can see that annualMice is given an assignment based on multiplying the other two variables together.

 */
        litterSize = 14;
        yearlyLitters = 10;
        System.out.print("and up to ");
        annualMice = litterSize * yearlyLitters;
        System.out.println(annualMice + " mice, in a year");
    }
}
// the second part of the code  is reassigning all 3 variables to give out a different result.
// you can also have assignments where the same variable is on both sides of the =.
//Such as litterSize = litterSize + 1 which would take the value of litterSize and add 1 to it.