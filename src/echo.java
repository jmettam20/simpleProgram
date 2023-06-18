import java.util.Scanner;

public class echo {
    public static void main(String args[]){
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println(myScanner.nextLine()); //prints input 
        }
    }
}
