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
    private String Nama, Tempat, date1;
    private int harga, LamaSewa;
   


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
    public void setLama(int LamaSewa) {
        this.LamaSewa = LamaSewa;
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
    public int getLama() {
        return LamaSewa;
    }
    public int getHarga(){
        if (Tempat.equalsIgnoreCase("Jakarta")){
            harga = 6000*LamaSewa;
        }
        else if (Tempat.equalsIgnoreCase("Bekasi")){
            harga = 5500*LamaSewa;
        }
        else if (Tempat.equalsIgnoreCase("Bandung")){
            harga = 5500*LamaSewa;
        }
        else if (Tempat.equalsIgnoreCase("Malang")){
            harga = 5000*LamaSewa;
        }
        else if (Tempat.equalsIgnoreCase("Semarang")){
        harga = 4500*LamaSewa;
        }
        return harga;
    }
}

