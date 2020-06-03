package CicilanCalculator.src;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    static final int BULAN_DALAM_TAHUN = 12;

    public static void main(String[] args) throws Exception {
        // Harga Awal = P
        // Durasi Cicilan = D (tahun)
        // Bunga = B
        // Bayaran per bulan = M

        // M = [P + (P * B / 100)] / D * 12

        int hargaAwal = (int) Console.readInputNumber("Harga Awal: ", 1_000_000, 100_000_000);
        int durasiCicilan = (int) Console.readInputNumber("Durasi Cicilan: ", 1);
        double bunga = Console.readInputNumber("Bunga: ", 0);

        CicilanCalculate calculator = new CicilanCalculate(hargaAwal, durasiCicilan, bunga);
        CicilanReport report = new CicilanReport(calculator);

        report.tampilBayaran();
        report.tampilSisaBayaranPerBulan();
    }
}
