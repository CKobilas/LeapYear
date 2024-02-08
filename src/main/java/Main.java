import java.util.*;

public class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

    //prompt user to enter the month of the year
    
    System.out.print("Enter a month as an integer: ");
    int month = input.nextInt();
    
     //prompt user to enter the year
    
    System.out.println("Enter a year as an integer: ");
    int year = input.nextInt();

    //Write the LeapYear method to determine if the year is a leap year

    boolean LeapYear = 
      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    //Display the number of days in the month

    if (month < 1 || month > 12) {
      System.out.println("Invalid month");
    } 
    else     
    switch (month)
      {
          case 1: System.out.println(
             "January " + year + " had 31 days"); break;
          case 2: System.out.println("February " + year + " had" +
              ((LeapYear) ? " 29 days" : " 28 days")); break;
          case 3: System.out.println(
             "March " + year + " had 31 days"); break;
          case 4: System.out.println(
             "April " + year + " had 30 days"); break;
          case 5: System.out.println(
             "May " + year + " had 31 days"); break;
          case 6: System.out.println(
             "June " + year + " had 30 days"); break;
          case 7: System.out.println(
             "July " + year + " had 31 days"); break;
          case 8: System.out.println(
             "August " + year + " had 31 days"); break;
          case 9: System.out.println(
             "September " + year + " had 30 days"); break;
          case 10: System.out.println(
             "October " + year + " had 31 days"); break;
          case 11: System.out.println(
             "November " + year + " had 30 days"); break;
          case 12: System.out.println(
             "December " + year + " had 31 days");
      }
  }
}