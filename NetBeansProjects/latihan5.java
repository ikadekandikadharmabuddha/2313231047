class Hewan {
     String nama;
 
     Hewan(String nama) {
         this.nama = nama;
     }
 
     void info() {
         System.out.println("Nama: " + nama);
     }
 }
 
 class Anjing extends Hewan {
     Anjing(String nama) {
         super(nama); // Memanggil konstruktor superclass
     }
 
     void suara() {
         System.out.println(nama + " mengaung: Aungg!");
     }
 }
 
 public class latihan5 {
     public static void main(String[] args) {
         // Membuat objek Kucing
         Anjing anjingSaya = new Anjing("popi");
 
         // Memanggil method yang dimiliki oleh objek Kucing
         anjingSaya.info(); // Dari superclass Hewan
         anjingSaya.suara(); // Method khusus Kucing
     }
 }