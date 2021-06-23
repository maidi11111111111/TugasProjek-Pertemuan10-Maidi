package model;

import java.util.Date;

public class motor extends kendaraan{
    //atribut
    private String kecepatan;
    private String asalPembuatan;
    private Date thnPembuatan;

    //method
    public void pilihKecepatan(){
        System.out.println("Memilih kecepatan Motor");
    }

    public void AsalPembuatan(){
        System.out.println("Melihat asal pembuatan Motor");
    }

    //getter and setter

    public String getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(String kecepatan) {
        this.kecepatan = kecepatan;
    }

    public String getAsalPembuatan() {
        return asalPembuatan;
    }

    public void setAsalPembuatan(String asalPembuatan) {
        this.asalPembuatan = asalPembuatan;
    }

    public Date getThnPembuatan() {
        return thnPembuatan;
    }

    public void setThnPembuatan(Date thnPembuatan) {
        this.thnPembuatan = thnPembuatan;
    }
    //Override
    @Override
    public void merk() {
        super.merk();
    }

    @Override
    public void warna() {
        super.warna();
    }


    //cetak
    public void printmotor(){
        System.out.println("kecepatan"+  this.getKecepatan());
        System.out.println("asal pembuatan"+  this.getAsalPembuatan());
        System.out.println("tahun pembuatan"+  this.getThnPembuatan());

    }
}
