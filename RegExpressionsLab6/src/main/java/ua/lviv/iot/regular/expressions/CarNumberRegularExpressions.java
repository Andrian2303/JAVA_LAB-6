package ua.lviv.iot.regular.expressions;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarNumberRegularExpressions {


  public static void findZipCodesByPatterns(String textToCheck) {
    List<String> stringList = new LinkedList<>();
    String patternString = "(\\w{2} \\d{4} \\w{2})|(\\w{2}\\d{4}\\w{2})|(\\d{3}-\\d{2} \\w{2})";
    Pattern pattern = Pattern.compile(patternString);
    Matcher matcher = pattern.matcher(textToCheck);
    while (matcher.find()) {
      stringList.add(matcher.group());
    }
    System.out.println(stringList);
  }


}
