import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double a,b,c,u,alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz :");
        a = inp.nextDouble();
        System.out.print("İkinci kenarı giriniz :");
        b = inp.nextDouble();
        System.out.print("Üçüncü kenarı giriniz :");
        c = inp.nextDouble();
        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgen alanı :" + alan);

    }
}
