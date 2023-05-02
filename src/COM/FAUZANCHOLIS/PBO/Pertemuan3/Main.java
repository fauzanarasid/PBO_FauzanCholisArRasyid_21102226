package COM.FAUZANCHOLIS.PBO.Pertemuan3;

public class Main {
    public static void main(String[] args) {
//        //pembuatan class
//        Sepedamotor suzuki = new Sepedamotor("suzuki","GSX150R",20000000);
//        Sepedamotor yamaha = new Sepedamotor("Yamaha", "YZF R15", 25000000);
//        Sepedamotor honda = new Sepedamotor("Honda", "CBR150R", 23500000);
//        //menjalankan method showinfo
//        suzuki.showInfo();
//        yamaha.showInfo();
//        honda.showInfo();

        Sepedamotor vespa = new Sepedamotor("Vespa", "Vespa Matic", 40000000);

        //sebelum perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek()+
                        "Dengan Tipe (Before): "+vespa.getTipe()
        );

        //melakukan proses perubahan tipe motor
        vespa.setTipe("sprint");

        //Lihat hasil perubahan
        System.out.println(
                "Motor Merk : " +vespa.getMerek() +
                "Dengan tipe (After) : "+ vespa.getTipe()
        );
    }
}
