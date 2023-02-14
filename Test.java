import java.io.Console;
import java.util.Scanner;





public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam=0;
        System.out.print("Lütfen Sayı Giriniz:");
        int sayi = input.nextInt();
        for(int i =1;i<sayi;i++)
        {
            if(sayi%i==0)
                toplam+=i;

        }
        System.out.println(sayi==toplam ? "Mükemmel Sayıdır":"Mükemmel Sayı Değildir");


    }

}















