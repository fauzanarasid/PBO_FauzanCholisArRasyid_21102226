package COM.FAUZANCHOLIS.PBO.PERTEMUAN2;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.printf("Masukan sebuah Bilangan:");
        int bilangan= scanner.nextInt();

        if (bilangan > 0){
            System.out.println("Bilangan positif");
        } else if (bilangan < 0) {
            System.out.println("Bilangan Negatif");
        }
        else {
            System.out.printf("Bilangan Nol");
        }
    }
}
