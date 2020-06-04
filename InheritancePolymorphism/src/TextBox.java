package InheritancePolymorphism.src;

public class TextBox extends Input {
  private String text = "";

  public TextBox(
  // boolean isEnabled,
  // String text
  ) {
    // super(isEnabled);
    // this.text = text;
    // System.out.println("Ini class TextBox");
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    this.text = "";
  }

  public void render() {
    System.out.println("Render TextBox");
  }

  @Override
  public String toString() {
    return this.text;
  }
}