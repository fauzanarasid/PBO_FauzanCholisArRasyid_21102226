package COM.FAUZANCHOLIS.PBO.Pertemuan3.unguided2;

public class Buku {

    //Atribut
    private int harga;
    private String judul_buku;
    private int no_buku;
    private String pengarang;
    private int  tahun_terbit;
    int total_harga;

    //Constructor dengan parameter
    public Buku(int harga, String judul_buku, int no_buku, String pengarang, int tahun_terbit) {
        this.harga = harga;
        this.judul_buku = judul_buku;
        this.no_buku = no_buku;
        this.pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
    }

    //Getter and Setter
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public int getNo_buku() {
        return no_buku;
    }

    public void setNo_buku(int no_buku) {
        this.no_buku = no_buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public void beli_buku(int jumlah_buku){
        int total_harga = getHarga() * jumlah_buku;
        this.total_harga = total_harga;
        System.out.println("Total Harga     : " + total_harga);
    }

    public void bayar_buku(int jumlah_bayar, int total_harga){
        int kembali = jumlah_bayar - total_harga;
        System.out.println();
        System.out.println("=== Rincian Pembayaran ===");
        System.out.println("Jumlah Bayar    : " + jumlah_bayar);
        System.out.println("Kembalian       : " + kembali);
        System.out.println("=== Rincian Pembayaran ===");
        System.out.println();
    }
    public void detailBuku(){
        System.out.println("No  Buku        : " + getNo_buku());
        System.out.println("Judul Buku      : " + getJudul_buku());
        System.out.println("Pengarang       : " + getPengarang());
        System.out.println("Tahun Terbit    : " + getTahun_terbit());
        System.out.println("Harga           : " + getHarga());
    }
}
