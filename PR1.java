import java.util.Scanner;

public class PR1 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nama anda: ");
    String name = scanner.nextLine();
    System.out.print("Umur anda: ");
    byte age = scanner.nextByte();
    System.out.print("Tempat tinggal anda: ");
    scanner.nextLine();
    String address = scanner.nextLine();
    System.out.print("Tahun lahir anda: ");
    int year = scanner.nextInt();

    String template = "Nama anda adalah %s, berumur %s tahun, tinggal di %s, lahir tahun %s";

    String result = String.format(template, name, age, address, year);

    System.out.println(result);
  }
}