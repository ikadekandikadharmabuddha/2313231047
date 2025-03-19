// Kelas induk (superclass)
 class Hewan {
     void makan() { 
         System.out.println("Hewan sedang lapar."); 
     }
 }
 
 // Kelas anak (subclass) yang mewarisi dari Hewan
 class Kucing extends Hewan {
     void suara() { 
         System.out.println("Meow!"); 
     }
 }
 
 // Kelas cucu (subclass) yang mewarisi dari Kucing
 class KucingHutan extends Kucing {
     void jenis() { 
         System.out.println("Ini adalah kucing hutan."); 
     }
 }
 
 // Kelas utama untuk menjalankan program
 public class latihan2 {
     public static void main(String[] args) {
         // Membuat objek dari kelas KucingAnggora
         KucingHutan hutan = new KucingHutan();
 
         // Memanggil metode dari berbagai level pewarisan
         hutan.makan();  // Dari kelas Hewan
         hutan.suara();  // Dari kelas Kucing
         hutan.jenis();  // Dari kelas KucingAnggora
     }
 }
