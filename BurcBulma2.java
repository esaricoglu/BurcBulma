package KosulluIfadelerveKodBlokları;

import java.util.Scanner;

public class BurcBulma2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı ayda doğduğunuzu giriniz: ");
        int month = input.nextInt();

        System.out.print("Ayın kaçında doğduğunuzu giriniz: ");
        int day = input.nextInt();

        if ((((1 <= day) && (day <= 21)) && month == 1) || (((22 <= day) && (day <= 31)) && (month == 12))) {
            System.out.println("Burcunuz: Oğlak");
        } else if ((((1 <= day) && (day <= 19)) && month == 2) || (((22 <= day) && (day <= 31)) && (month == 1))) {
            System.out.println("Burcunuz : Kova");
        } else if ((((20 <= day) && (day <= 29)) && month == 2) || (((1 <= day) && (day <= 20)) && (month == 3))) {
            System.out.println("Burcunuz: Balık");
        } else if ((((21 <= day) && (day <= 31)) && month == 3) || (((1 <= day) && (day <= 20)) && (month == 4))) {
            System.out.println("Burcunuz: Koç");
        } else if ((((21 <= day) && (day <= 30)) && month == 4) || (((1 <= day) && (day <= 21)) && (month == 5))) {
            System.out.println("Burcunuz: Boğa");
        } else if ((((22 <= day) && (day <= 31)) && month == 5) || (((1 <= day) && (day <= 22)) && (month == 6))) {
            System.out.println("Burcunuz: İkizler");
        } else if ((((23 <= day) && (day <= 30)) && month == 6) || (((1 <= day) && (day <= 22)) && (month == 7))) {
            System.out.println("Burcunuz: Yengeç");
        } else if ((((23 <= day) && (day <= 31)) && month == 7) || (((1 <= day) && (day <= 22)) && (month == 8))) {
            System.out.println("Burcunuz: Aslan");
        } else if ((((23 <= day) && (day <= 31)) && month == 8) || (((1 <= day) && (day <= 22)) && (month == 9))) {
            System.out.println("Burcunuz: Başak");
        } else if ((((23 <= day) && (day <= 30)) && month == 9) || (((1 <= day) && (day <= 22)) && (month == 10))) {
            System.out.println("Burcunuz: Terazi");
        } else if ((((23 <= day) && (day <= 31)) && month == 10) || (((1 <= day) && (day <= 21)) && (month == 11))) {
            System.out.println("Burcunuz: Akrep");
        } else if ((((22 <= day) && (day <= 30)) && month == 11) || (((1 <= day) && (day <= 21)) && (month == 12))) {
            System.out.println("Burcunuz: Yay");
        } else {
            System.out.println("Böyle bir tarih bulunmamaktadır.");
        }
    }
}