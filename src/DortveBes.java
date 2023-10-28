import java.util.Scanner;

public class DortveBes {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi ; i*=4){
            System.out.println("Dördün kuvvetleri : " + i);
        }
        for (int k = 1; k <= sayi ; k*=5){
            System.out.println("Beşin kuvvetleri : " + k);
        }
    }
}
