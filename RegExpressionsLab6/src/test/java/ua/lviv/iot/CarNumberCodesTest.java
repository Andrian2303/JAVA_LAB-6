package ua.lviv.iot;

import org.junit.Test;
import ua.lviv.iot.regular.expressions.CarNumberRegularExpressions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;


public class CarNumberCodesTest {

  @Test
  public void findZipCodesTest() {

    String text = "This text contains car numbers:  BC 4212 AP, BC2132WA, 321-12 AD. бардин";
    InputStream in = new ByteArrayInputStream(text.getBytes());
    System.setIn(in);

    Scanner scanner = new Scanner(System.in);
    String myText = scanner.nextLine();
    System.out.println(myText);
    CarNumberRegularExpressions.findZipCodesByPatterns(myText);

  }
}
