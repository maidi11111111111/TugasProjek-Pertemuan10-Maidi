package model;
import java.util.Date;
public class kendaraan {
    //atribut
    private String merk;
    private String namaMotor;
    private String transmisi;
    private String jenisMesin;
    private String harga;
    private String noMesin;
    private String warna;
    private String jenisBahanBakar;

    //method
    public void merk(){
        System.out.println("Menentukan merk kendaraan");
    }

    public void warna(){
        System.out.println("Memilih warna kendaraan");
    }

    public void transmisi(){
        System.out.println("Memilih transmisi kendaraan");
    }

    public void harga(){
        System.out.println("Harga per unit kendaraan");
    }

    //constructor
    public kendaraan(){
    }

    public kendaraan(String merk, String namaMotor, String transmisi, String jenisMesin, String harga, String noMesin, String warna, String jenisBahanBakar) {
        this.merk = merk;
        this.namaMotor = namaMotor;
        this.transmisi = transmisi;
        this.jenisMesin = jenisMesin;
        this.harga = harga;
        this.noMesin = noMesin;
        this.warna = warna;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public kendaraan(String merk, String namaMotor, String transmisi) {
        this.merk = merk;
        this.namaMotor = namaMotor;
        this.transmisi = transmisi;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNamaMotor() {
        return namaMotor;
    }

    public void setNamaMotor(String namaMotor) {
        this.namaMotor = namaMotor;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }

    public String getJenisMesin() {
        return jenisMesin;
    }

    public void setJenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getNoMesin() {
        return noMesin;
    }

    public void setNoMesin(String noMesin) {
        this.noMesin = noMesin;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }

    public void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }
    public void printkendaraan(){
        System.out.println("merk                : " + this.getMerk());
        System.out.println("Nama Motor          : " + this.getNamaMotor());
        System.out.println("Transmisi           : " + this.getTransmisi());
        System.out.println("Jenis Mesin         : " + this.getJenisMesin());
        System.out.println("Harga               : " + this.getHarga());
        System.out.println("No Mesin            : " + this.getNoMesin());
        System.out.println("Warna               : " + this.getWarna());
        System.out.println("Jenis Bahan Bakar   : " + this.getJenisBahanBakar());
        System.out.println();
    }
}
