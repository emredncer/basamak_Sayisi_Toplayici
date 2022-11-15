import java.util.Scanner;

public class basamak_Sayisi_Toplayici {
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int tempNumber = number;
        int numCounter = 0, numValue;
        while (number != 0) {
            numValue = number % 10;
            numCounter += numValue;
            number /= 10;
        }
        System.out.print(tempNumber + " Sayısının basamakları toplamı= " + numCounter);
    }
}
