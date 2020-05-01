/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yosef
 */
public class TugasModul8 {
    //deklarasi atribut
    private String Nama, Tempat, date1, date2;
    private int harga;

    //membuat setter
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public void setTempat(String Tempat) {
        this.Tempat = Tempat;
    }
    public void setDate1(String date1) {
        this.date1 = date1;
    }
    public void setDate2(String date2) {
        this.date2 = date2;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    //membuat getter
    public String getNama(){
        return Nama;
    }
    public String getTempat(){
        return Tempat;
    
    }
    public String getDate1(){
        return date1;
    }
    public String getDate2() {
        return date2;
    }
    public int getHarga(){
        return harga;
    }
}

