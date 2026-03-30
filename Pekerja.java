
package Inheritance;
import java.time. LocalDate ;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    
    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak){
        super (nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }
    
    public double getGaji(){
        return gaji;
    }
    public LocalDate getTahunmasuk(){
        return tahunMasuk;
    }
    public int getJumlahanak(){
        return jumlahAnak;
    }
    
    
    public void setGaji(double gaji){
        this.gaji= gaji;
    }
    public void setTahunMasuk(LocalDate tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }
    public void setJumlahanak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }
    
    public double getBonus(){
        int waktuKerja = Period.between(tahunMasuk, LocalDate.now()).getYears();
        
        if (waktuKerja >= 0 && waktuKerja <= 5){
            return 0.05 * gaji;
        }else if (waktuKerja > 5 && waktuKerja <= 10){
            return 0.10 *gaji;
        }else{
            return 0.15*gaji;
        }
        
    }
    
    @Override 
    public double getPendapatan(){
        return super.getPendapatan() + getBonus() + (jumlahAnak * 20);
    }
    
    @Override
    public String toString(){
        return super.toString()+
               "\nTahun Masuk : " + tahunMasuk+
               "\nJumlah Anak    : " + jumlahAnak+
               "\nGaji   : " + getGaji();
    }
}

