import java.util.Scanner;

public class gumballCalc {
    public static void main(String args[]){
        Scanner myScanner = new Scanner(System.in); //add scanner
        int gumballs;                              //set veriables 
        int kids;
        int gumballsPerKid; 

        System.out.print("How many gumballs? How many kids? "); //talk to user

        gumballs = myScanner.nextInt();     //scanning
        kids = myScanner.nextInt();

        gumballsPerKid = gumballs/kids;         //results 


        System.out.print("Each kid gets ");     //talk to user
        System.out.print(gumballsPerKid);
        System.out.println(" gumbaalls.");
    }
}
