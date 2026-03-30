package Inheritance;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }
    public boolean getjenisKelamin() {
        return jenisKelamin;
    }
    public String getNik() {
        return nik;
    }
    public boolean getMenikah() {
        return menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setjenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    
    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        String jk = jenisKelamin ? "Laki-Laki" : "Perempuan";

        return ("Nama   : " + nama
                + "\nNIK  : " + nik
                + "\nJenis Kelamin   : " + jk
                + "\nJumlah Pendapatan   : " + getPendapatan());

    }
}
