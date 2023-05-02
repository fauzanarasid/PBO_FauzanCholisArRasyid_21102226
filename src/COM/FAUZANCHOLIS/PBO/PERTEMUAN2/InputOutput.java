package COM.FAUZANCHOLIS.PBO.PERTEMUAN2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nama Anda :");
        String nama = scanner.nextLine();

        System.out.printf("Selamat Pagi:" +nama);
    }
}
