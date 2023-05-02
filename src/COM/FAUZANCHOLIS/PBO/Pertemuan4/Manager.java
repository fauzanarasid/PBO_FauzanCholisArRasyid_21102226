package COM.FAUZANCHOLIS.PBO.Pertemuan4;

public class Manager extends Pegawai{
    public void bonus (int bonus){
        System.out.println("Pegawai dengan nama : "+nama+ " Dengan Nip: "+nip+ " Mendapatkan Bonus :"+bonus);
    }
    public void extrainfo(){
        System.out.println("Jabatan Pegawai Manager");
    }
    public void bonus(){
        System.out.println("Harap Masukan jenis bonusnya");
    }
}
