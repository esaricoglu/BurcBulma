package KosulluIfadelerveKodBlokları;

import java.util.Scanner;

public class BurcBulma1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı ayda doğduğunuzu giriniz: ");
        int month = input.nextInt();

        System.out.print("Ayın kaçında doğduğunuzu giriniz: ");
        int day = input.nextInt();

        if (month == 1) {
            if ((1 <= day) && (day <= 21)) {
                System.out.println("Burcunuz: Oğlak");
            } else if ((22 <= day) && ((day <= 31))) {
                System.out.println("Burcunuz: Kova");
            } else {
                System.out.println("Ocak ayı 31 gün çeker.");
            }
        } else if (month == 2) {
            if ((1 <= day) && (day <= 19)) {
                System.out.println("Burcunuz: Kova");
            } else if ((20 <= day) && (day <= 29)) {
                System.out.println("Burcunuz: Balık");
            } else {
                System.out.println("Şubat ayı en fazla 29 gün çeker.");
            }
        } else if (month == 3) {
            if ((1 <= day) && (day <= 20)) {
                System.out.println("Burcunuz: Balık");
            } else if ((21 <= day) && (day <= 31)) {
                System.out.println("Burcunuz: Koç");
            } else {
                System.out.println("Mart Ayı 31 gün çeker.");
            }
        } else if (month == 4) {
            if ((1 <= day) && (day <= 20)) {
                System.out.println("Burcunuz: Koç");
            } else if ((21 <= day) && (day <= 30)) {
                System.out.println("Burcunuz: Boğa");
            } else {
                System.out.println("Nisan Ayı 30 gün çeker.");
            }
        } else if (month == 5) {
            if ((1 <= day) && (day <= 21)) {
                System.out.println("Burcunuz: Boğa");
            } else if ((22 <= day) && (day <= 31)) {
                System.out.println("Burcunuz: İkizler");
            } else {
                System.out.println("Mayıs Ayı 31 gün çeker.");
            }
        } else if (month == 6) {
            if ((1 <= day) && (day <= 22)) {
                System.out.println("Burcunuz: İkizler");
            } else if ((23 <= day) && (day <= 30)) {
                System.out.println("Burcunuz: Yengeç");
            } else {
                System.out.println("Haziran Ayı 30 gün çeker.");
            }
        } else if (month == 7) {
            if ((1 <= day) && (day <= 22)) {
                System.out.println("Burcunuz: Yengeç");
            } else if ((23 <= day) && (day <= 31)) {
                System.out.println("Burcunuz: Aslan");
            } else {
                System.out.println("Temmuz Ayı 31 gün çeker.");
            }
        } else if (month == 8) {
            if ((1 <= day) && (day <= 22)) {
                System.out.println("Burcunuz: Aslan");
            } else if ((23 <= day) && (day <= 31)) {
                System.out.println("Burcunuz: Başak");
            } else {
                System.out.println("Ağustos Ayı 31 gün çeker.");
            }
        } else if (month == 9) {
            if ((1 <= day) && (day <= 22)) {
                System.out.println("Burcunuz: Başak");
            } else if ((23 <= day) && (day <= 30)) {
                System.out.println("Burcunuz: Terazi");
            } else {
                System.out.println("Eylül Ayı 30 gün çeker.");
            }
        } else if (month == 10) {
            if ((1 <= day) && (day <= 22)) {
                System.out.println("Burcunuz: Terazi");
            } else if ((23 <= day) && (day <= 31)) {
                System.out.println("Burcunuz: Akrep");
            } else {
                System.out.println("Ekim Ayı 31 gün çeker.");
            }
        } else if (month == 11) {
            if ((1 <= day) && (day <= 21)) {
                System.out.println("Burcunuz: Akrep");
            } else if ((22 <= day) && (day <= 30)) {
                System.out.println("Burcunuz: Yay");
            } else {
                System.out.println("Kasım Ayı 30 gün çeker.");
            }
        } else if (month == 12) {
            if ((1 <= day) && (day <= 21)) {
                System.out.println("Burcunuz: Yay");
            } else if ((22 <= day) && (day <= 31)) {
                System.out.println("Burcunuz: Oğlak");
            } else {
                System.out.println("Aralık Ayı 31 gün çeker.");
            }
        }else{
            System.out.println("Bir yıl 12 aydan oluşur.");
        }
    }
}