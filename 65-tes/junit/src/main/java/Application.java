import javax.swing.*;

public class Application {

  public static void main(String[] args) {
    String option = "";
    Triangle triangle = new Triangle();

    while (!option.equals("9")) {
      option = JOptionPane.showInputDialog("1 – Create triangle \n2 – Triangle area \n9 – Exit");
      if (option.equals("1")) {
        triangle.setBase(Double.parseDouble(JOptionPane.showInputDialog("Triangle height:")));
        triangle.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Triangle base:")));
      } else if (option.equals("2")) {
        JOptionPane.showMessageDialog(null,"Area: " + triangle.getArea());
      }
    }
  }

}