import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Input a number!");
        int n = scnr.nextInt(); 
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        
        if (count == 2) {
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
}