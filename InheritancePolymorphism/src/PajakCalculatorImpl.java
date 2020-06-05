package InheritancePolymorphism.src;

public class PajakCalculatorImpl implements PajakCalculator {
  private double pendapatan;

  public PajakCalculatorImpl(double pendapatan) {
    this.pendapatan = pendapatan;
  }

  public double hitungPajak() {
    return pendapatan * 0.2;
  }

  public void testing() {
    System.out.println("TESTING INTERFACE");
  }
}