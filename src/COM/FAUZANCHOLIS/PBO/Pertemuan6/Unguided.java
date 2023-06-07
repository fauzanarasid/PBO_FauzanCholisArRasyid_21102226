package COM.FAUZANCHOLIS.PBO.Pertemuan6;

import java.security.spec.ECField;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Unguided {
    public static int jumlahbilangan(int bilangan1, int bilangan2) throws Exception {
        if (bilangan2 == 0) {
            throw new Exception("Penambahan dengan nol tidak di perbolehkan.");
        }
        return bilangan1 + bilangan2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.printf("Masukan Bilangan pertama : ");
            int bilangan1 = scanner.nextInt();

            System.out.printf("Masukan Bilangan kedua :");
            int bilangan2 = scanner.nextInt();

            int hasil = jumlahbilangan(bilangan1, bilangan2);
            System.out.println("Hasil penjumlahan :" + hasil);
        } catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan : Input tidak valid, Harap masukan bilangan bulat.");
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

