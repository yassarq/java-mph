/* (Average speed in miles) Assume that a runner runs 14 kilometers in 45
minutes and 30 seconds. Write a program that displays the average speed in miles per hour.
(Note 1 mile is equal to 1.6 kilometers.) */

// create a class with the same name as the file name.
public class assignment_1 {
    // create a starting point for java with public static void main (manditory)
    public static void main(String[] args) {
         //define varible type 
        //convert given kilometers value in to miles 
        double miles = 14 / 1.6;
        //convert given minutes and seconds value in to hours
        double hour = 60 / 45.5;
        // create a basic mph formular 
        double avgSpeed = miles/hour;
        // print the output value on the console
        System.out.println("The average speed is " + avgSpeed + " mph");
    }
}
