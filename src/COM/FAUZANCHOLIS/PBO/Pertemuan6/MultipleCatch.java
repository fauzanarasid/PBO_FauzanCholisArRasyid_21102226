package COM.FAUZANCHOLIS.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan Angka : ");
            int angka1 = input.nextInt();

            System.out.println("Masukkan Angka Pembagi : ");
            int angka2 = input.nextInt();

            int hasil = angka1/angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil + "(dibulatkan) ");
        }

//        catch (ArithmeticException | InputMismatchException e) {
//            System.out.println("Error : " + e);
//        }
        //Multiple Catch
        catch (ArithmeticException e){
            System.out.println("Error : Kesalahan dalam perhiitungan!");
        }
        catch (InputMismatchException e){
            System.out.println("Error : Kesalahan dalam Input!");
        }
        finally {
            System.out.println(
                    "finnaly akan selalu dijalankan"
            );
        }

        System.out.println("Akhir dari Program");

    }

}
