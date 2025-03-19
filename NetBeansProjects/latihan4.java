interface Hewan {
     void makan();
 }
 
 interface Mamalia {
     void menyusui();
 }
 
 class Kucing implements Hewan, Mamalia {
     public void makan() {
         System.out.println("Kucing makan ikan.");
     }
 
     public void menyusui() {
         System.out.println("Kucing menyusui anaknya.");
     }
 }
 
 public class latihan4 {
     public static void main(String[] args) {
         // Membuat objek Kucing
         Kucing kucing = new Kucing();
 
         // Memanggil method-method yang dimiliki oleh Kucing
         kucing.makan();
         kucing.menyusui();
     }
 }