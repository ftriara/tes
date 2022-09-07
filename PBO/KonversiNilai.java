import java.util.Scanner;

public class KonversiNilai {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Masukkan nilai anda    : ");
      int nilai = scanner.nextInt();
      if (nilai >= 85 && nilai <= 100)
        System.out.println("A");
      else if (nilai >= 80 && nilai < 85)
        System.out.println("A-");
      else if (nilai >= 75 && nilai < 80)
        System.out.println("B+");
      else if (nilai >= 70 && nilai < 75)
        System.out.println("B");
      else if (nilai >= 65 && nilai < 70)
        System.out.println("C+");
      else if (nilai >= 60 && nilai < 65)
        System.out.println("C");
      else if (nilai >= 55 && nilai < 60)
        System.out.println("D");
      else if (nilai <= 55)
        System.out.println("E");
      else
        System.out.println("Indeks tidak tersedia.");
    }
}
