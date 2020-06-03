package CicilanCalculator.src;

import java.text.NumberFormat;

public class CicilanReport {

  private CicilanCalculate calculator;

  public CicilanReport(CicilanCalculate calculator) {
    this.calculator = calculator;
  }

  public void tampilBayaran() {
    System.out.println("---------- PEMBAYARAN SETIAP BULAN ----------");
    System.out.println(NumberFormat.getCurrencyInstance().format(calculator.hitungBayaranPerBulan()));
  }

  public void tampilSisaBayaranPerBulan() {
    System.out.println("---------- SISA BAYARAN PER BULAN ----------");

    for (int bulan = 1; bulan <= calculator.getDurasiCicilan() * App.BULAN_DALAM_TAHUN; bulan++) {
      System.out.println(NumberFormat.getCurrencyInstance().format(calculator.hitungSisaBayaranPerBulan(bulan)));
    }
  }

}