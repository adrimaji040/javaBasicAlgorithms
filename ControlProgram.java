import java.util.Scanner;

public class ControlProgram {
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter de number: ");
        int number = scan.nextInt(); 

        UtilBasicAlgorithms uba = new UtilBasicAlgorithms();
        String result = uba.EvenOrOdd(number);
        System.out.println("The number is: " + result);

        String PrimeStr = uba.numberPrimeString(number);
        System.out.println("The number is:" + PrimeStr);


    }
}
