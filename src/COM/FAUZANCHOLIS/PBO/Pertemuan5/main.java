package COM.FAUZANCHOLIS.PBO.Pertemuan5;

public class main {
    public static void main(String[] args) {
        Barang[] keranjang = new Barang[10];
        Barang[] etalase ={
                new Barang ( "Indomie", 2000),
                new Barang ("Mie sedap",2000),
                new Barang("Beras", 12000),
                new Barang("Gula", 15000),
        };
        //Melihat Panjang Array
        System.out.println(
                "Banyak Barang di etalase :"
                +etalase.length
        );
        //Menampilkan daftar Barang dalam array
        etalase[0].showinfo();
        System.out.println("Daftar Barang di etalase : ");

        int i=1;
        for (Barang barang : etalase){
            System.out.println("Barang ke : "+i);
            barang.showinfo();
            i++;
            //Atau
            for(int j=0; j<etalase.length; j++){
                System.out.println("Barang ke- " + (j+1));
                etalase[j].showinfo();
            }

            //Memasukkan barang ke keranjang
            keranjang[0] = etalase[0];
            System.out.println("Barang di keranjang : ");
            keranjang[0].showinfo();

        }
    }
}
