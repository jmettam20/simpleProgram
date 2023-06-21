import java.util.Scanner;

class yankChange{
    public static void main(String args[]){
        Scanner myScanner = new Scanner(System.in); //scanning 
        int quaters, dimes, nickels, cents;            //define var
        int leftOver, total; 

        System.out.print("How many cents do you have? ");   //interogate user 
        total = myScanner.nextInt();

        quaters = total / 25;                                       //quaters
        leftOver = total % 25;

        dimes = leftOver / 10;                                      //dimes
        leftOver = leftOver % 10;

        nickels = leftOver / 5;                                      //nickels
        leftOver = leftOver % 5; 

        cents = leftOver;                                           //cents

        System.out.println();                                       //output 
        System.out.println("From " + total + " cents you get");
        System.out.println(quaters + " quaters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(cents + " cents");

    }
}