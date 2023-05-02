package COM.FAUZANCHOLIS.PBO.Pertemuan4;

public class main {
    public static void main(String[] args) {
        Manager manajer = new Manager();
        Pegawai pegawai = new Pegawai();

        manajer.nip = 21102226;
        manajer.nama = "Fauzan Cholis";

        pegawai.nip = 21102227;
        pegawai.nama = "Muhamad Husni";


        manajer.showinfo();
        manajer.extrainfo();
        manajer.bonus(1000000);

        pegawai.showinfo();
        pegawai.extrainfo();
    }
}
