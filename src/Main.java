/*
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
"Recursive" metot kullanarak yapan programı yazınız.
 */

import java.util.Scanner;

public class Main {
    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        int exponent = input.nextInt();
        int result =1;

        for (int i=1;i<=exponent;i++){
            result *= base;
        }
        System.out.print("Sonuç : " +result);
    }
    public static void main(String[] args) {
        power();
    }
}
