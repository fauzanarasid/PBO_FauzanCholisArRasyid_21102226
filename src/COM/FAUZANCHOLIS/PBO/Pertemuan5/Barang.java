package COM.FAUZANCHOLIS.PBO.Pertemuan5;

public class Barang {
    //atribut
    String nama;
    int harga;
    //constructue
    public Barang(){}
    public Barang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    //Method
    public void showinfo(){
        System.out.println("Nama barang : "+this.nama);
        System.out.println("Harga barang : "+this.harga);
        System.out.println();
    }
}
