import java.util.Scanner;

public class celciusToFarenheight {
    public static void main(String args[]){
        Scanner myScanner = new Scanner(System.in);
        double celcius, farenheight; 

        System.out.print("Enter the temprature in degrees celsius: ");
        celcius = myScanner.nextDouble();

        farenheight = 9.0/5.0 * celcius + 32.00;

        System.out.print("Temprature is ");
        System.out.println(farenheight);
    }
}
