package COM.FAUZANCHOLIS.PBO.Pertemuan3.Unguided1;

public class Koperasi {
    // Atributs
    private String nama_barang;
    private int harga_barang;
    private int jumlah_barang;
    private int total_harga;

    // Constractor
    public Koperasi() {}

    // Constrator berparamter
    public Koperasi(String nama_barang, int harga_barang, int jumlah_barang, int total_harga) {
        this.nama_barang = nama_barang;
        this.harga_barang = harga_barang;
        this.jumlah_barang = jumlah_barang;
        this.total_harga = total_harga;
    }

    // Method
    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga () {
        this.total_harga = this.harga_barang * this.jumlah_barang;
    }

    public void showInfo() {
        System.out.println("Nama Barang : " + nama_barang);
        System.out.println("Harga Barang : " + harga_barang);
        System.out.println("Jumlah Barang : " + jumlah_barang);
        System.out.println("Total Harga : " + total_harga);
        System.out.println();
    }
}
