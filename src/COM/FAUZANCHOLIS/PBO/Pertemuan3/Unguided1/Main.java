package COM.FAUZANCHOLIS.PBO.Pertemuan3.Unguided1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama : Fauzan Cholis Ar Rasyid");
        System.out.println("NIM  : 21102226");
        System.out.println();
        // pembuatan class
        Koperasi Buku_sekolah = new Koperasi();
        Koperasi Pensil = new Koperasi();

        System.out.println();
        // Setter Barang Buku Tulis
        Buku_sekolah.setNama_barang("Buku Tulis");
        System.out.println(
                "Nama Barang : " + Buku_sekolah.getNama_barang()
        );

        Buku_sekolah.setHarga_barang(5000);
        System.out.println(
                "Harga Barang : " + Buku_sekolah.getHarga_barang()
        );

        Buku_sekolah.setJumlah_barang(10);
        System.out.println(
                "Jumlah Barang : " + Buku_sekolah.getJumlah_barang()
        );

        Buku_sekolah.setTotal_harga();
        System.out.println(
                "Total Harga : " + Buku_sekolah.getTotal_harga()
        );


        System.out.println();
        // Setter Koperasi Sekolah barang Pensil
        Pensil.setNama_barang("Pensil");
        System.out.println(
                "Nama Barang : " + Pensil.getNama_barang()
        );

        Pensil.setHarga_barang(3000);
        System.out.println(
                "Harga Barang : " + Pensil.getHarga_barang()
        );

        Pensil.setJumlah_barang(20);
        System.out.println(
                "Jumlah Barang : " + Pensil.getJumlah_barang()
        );

        Pensil.setTotal_harga();
        System.out.println(
                "Total Harga : " + Pensil.getTotal_harga()
        );

        System.out.println();
        System.out.println(
                "Total Harga Semua Barang : " + (Pensil.getTotal_harga() + Buku_sekolah.getTotal_harga())
        );

    }
}
