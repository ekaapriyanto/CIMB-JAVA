package OOP.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {
        // Tampilan menu
        // 1. Tambah buah
        // 2. List buah
        // 3. Exit

        tambahBuah();
        tampilMenu();
    }

    public static void tambahBuah() {
        while (true) {
            String inputNama = readInput("Nama buah: ");
            // int inputHarga = readInput("Harga buah: ");
            System.out.print("Stock buah: ");
            int inputStock = scanner.nextInt();

            Buah buah = new Buah(inputNama, inputHarga, inputStock);

            listBuah.add(buah);

            System.out.println("Repeat? (y/n)");
            String option = scanner.next();
            if (option.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static String readInput(String message) {
        System.out.print(message);
        return scanner.next();
    }

    public static void tampilMenu() {
        System.out.println("========== LIST BUAH ==========");
        for (int i = 0; i < listBuah.size(); i++) {
            System.out.println((i + 1) + ". " + listBuah.get(i).getNama() + " || " + listBuah.get(i).getHarga() + " || "
                    + listBuah.get(i).getStock() + " pcs");
        }
    }

}
