package InheritancePolymorphism.src;

public class PajakReport {
  private PajakCalculator calculator;

  public PajakReport(PajakCalculator calculator) {
    this.calculator = calculator;
  }

  public void show() {
    double pajak = calculator.hitungPajak();
    System.out.println(pajak);
  }
}
