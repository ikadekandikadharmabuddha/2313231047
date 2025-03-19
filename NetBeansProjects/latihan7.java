class Hewan {
     void bersuara() {
         System.out.println("Hewan bersuara...");
     }
 }
 
 // Subclass Kucing
 class Kucing extends Hewan {
     @Override
     void bersuara() {
         System.out.println("Auungg!");
     }
 }
 
 // Subclass Anjing
 class Anjing extends Hewan {
     @Override
     void bersuara() {
         System.out.println("Auungg!");
     }
 }
 
 // Main class
 public class latihan7 {
     public static void main(String[] args) {
         Hewan hewan1 = new Kucing(); // Polimorfisme
         Hewan hewan2 = new Anjing(); // Polimorfisme
 
         hewan1.bersuara(); // Memanggil metode bersuara() dari Kucing
         hewan2.bersuara(); // Memanggil metode bersuara() dari Anjing
     }
 }