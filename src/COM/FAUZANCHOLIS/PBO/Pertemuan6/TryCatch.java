package COM.FAUZANCHOLIS.PBO.Pertemuan6;

public class TryCatch {

    //Membuat method main
    public static void main(String[] args) {
        //membuat Array
        int[] angka = {
                1, 2, 3, 4, 5
        };

        try {
            //memanggil array berdasarkan index
            System.out.println(
                    angka[4]
            );
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Index yang anda masukkan melebihi batas"
            );
        }

        System.out.println("Index ke 6 nggak ada : ");
        try {
            //memanggil array berdasarkan index
            System.out.println(
                    angka[6]
            );
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Index yang anda masukkan melebihi batas"
            );
        }
    }
}
