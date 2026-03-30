
package Inheritance;

import java.time.LocalDate;

public class Main {
    public static void main(String[]args){
        System.out.println("====== MANUSIA ======");
        Manusia p1 = new Manusia("Arya", true, "121314", true);
        System.out.println(p1);
        System.out.println();
        
        Manusia p2 = new Manusia("Angga", false, "151524", true);
        System.out.println(p2);
        System.out.println();
        
        Manusia p3 = new Manusia("Dhamar", false, "123412", false);
        System.out.println(p3);
        System.out.println();
        
        System.out.println();
        System.out.println("====== MAHASISWA FILKOM =====");
        MahasiswaFILKOM m1 = new MahasiswaFILKOM("Sasimi", false, "255158", false, "1234567891012123", 2.7);
        System.out.println(m1);
        System.out.println();
        
        MahasiswaFILKOM m2 = new MahasiswaFILKOM("Dian", false, "255157", false, "2551504099156478", 3.4);
        System.out.println(m2);
        System.out.println();
        
        MahasiswaFILKOM m3 = new MahasiswaFILKOM("Komang", false, "251550", false, "255150701111002", 3.8);
        System.out.println(m3);
        System.out.println();
        
        System.out.println();
        System.out.println("====== PEKERJA ======");
        Pekerja pk1 = new Pekerja("Budi", true, "232415", true, 2000,LocalDate.now().minusYears(2) , 2);
        System.out.println(pk1);
        System.out.println();
        Pekerja pk2 = new Pekerja("Wawan", true, "254156", true, 2500,LocalDate.now().minusYears(9), 0);
        System.out.println(pk2);
        System.out.println();
        Pekerja pk3 = new Pekerja("Jaya", true, "251427", true, 3000, LocalDate.now().minusYears(20), 10);
        System.out.println(pk3);
        System.out.println();
        
        System.out.println();
        System.out.println("====== MANAGER ======");
        Manager mn1 = new Manager("Febri", false, "212225", false, 7500, LocalDate.now().minusYears(15), 0, "Produksi");
        System.out.println(mn1); 
        System.out.println();
    }
}
