package COM.FAUZANCHOLIS.PBO.Pertemuan3.unguided2;

import java.util.Scanner;

public class main_buku {
    public static void main(String[] args) {
        System.out.println("Nama : Fauzan Cholis Ar Rasyid");
        System.out.println("NIM  : 21102226");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        Buku satu = new Buku(70000, "Pemrograman Berbasis Objek dengan Java", 1, "Indrajani", 2007);
        Buku dua = new Buku(30000, "Dasar Pemrograman Java", 2, "Abdul Kadir", 2004);

        System.out.println("=== List Buku === ");
        satu.detailBuku();
        System.out.println();
        dua.detailBuku();
        System.out.println("=== List Buku === ");

        System.out.println();
        System.out.print("Masukkan no buku yang ingin dibeli : ");
        int no_buku = scanner.nextInt();
        System.out.print("Masukkan jumlah buku yang ingin dibeli : ");
        int jumlah_buku = scanner.nextInt();

        if (no_buku == 1){
            satu.beli_buku(jumlah_buku);
        }else{
            dua.beli_buku(jumlah_buku);
        }

        System.out.print("Masukkan Jumlah Uang : ");
        int jumlah_bayar = scanner.nextInt();
        System.out.println();


        System.out.println("=== Rincian Pembelian Buku === ");
        if (no_buku == 1){
            satu.detailBuku();
            System.out.println("=== Rincian Pembelian Buku === ");
            satu.bayar_buku(jumlah_bayar, satu.getHarga() * jumlah_buku);
        }else{
            dua.detailBuku();
            System.out.println("=== Rincian Pembelian Buku === ");
            dua.bayar_buku(jumlah_bayar, dua.getHarga() * jumlah_buku);
        }
    }

}
