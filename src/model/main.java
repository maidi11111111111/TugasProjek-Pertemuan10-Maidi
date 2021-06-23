package model;

public class main {
    public static void main(String[] args) {
        kendaraan k1 = new kendaraan();
        k1.setMerk("honda");
        k1.setNamaMotor("Vario");
        k1.setTransmisi("Matic");
        k1.setJenisMesin("125cc");
        k1.setHarga("18.000.000");
        k1.setNoMesin("AC23433DF");
        k1.setWarna("Putih");
        k1.setJenisBahanBakar("Premium");
        k1.printkendaraan();

        kendaraan k2 = new kendaraan();
        k2.setMerk("honda");
        k2.setNamaMotor("Vario");
        k2.setTransmisi("Matic");
        k2.setJenisMesin("150cc");
        k2.setHarga("18.000.000");
        k2.setNoMesin("AC2343RR");
        k2.setWarna("Merah");
        k2.setJenisBahanBakar("Premium");
        k2.printkendaraan();

        motor m1 = new motor();
        m1.getKecepatan();
        m1.getAsalPembuatan();
        m1.getThnPembuatan();
        m1.printmotor();
    }
}
