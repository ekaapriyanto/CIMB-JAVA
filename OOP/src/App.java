package OOP.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // gaji pokok
        // lembur (jam)
        // gajiPerJam
        // int salary = 50_000;
        // int overtime = 5;
        // int payPerHour = 100;

        // hitung jumah gaji -> gaji pokok + (gajiPerJam * lembur)
        Scanner scanner = new Scanner(System.in);
        Employee orang = new Employee();

        orang.setSalary(scanner.nextInt());
        orang.setOvertime(scanner.nextInt());
        orang.setPayPerHour(scanner.nextInt());

        System.out.println(orang.calculateWage());

    }

    public static int calculateWage(int salary, int overtime, int payPerHour) {
        return salary + (overtime * payPerHour);
    }

    public static void testing() {
        System.out.println("Testing 123");
    }
}
