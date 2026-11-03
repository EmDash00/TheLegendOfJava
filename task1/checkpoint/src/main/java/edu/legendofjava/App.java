package edu.legendofjava;

import static edu.legendofjava.Banner.*;

import java.util.Scanner;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
      final boolean FLASH_ENABLED = true;
      displayBanner(FLASH_ENABLED);
      System.out.println("""
The LEGEND
==========

Long ago, the programming nations lived in harmony, but everything changed when
the HACKERs attacked. Only the DEVELOPER, master of all programming languages, 
could stop them. But when the world needed them most, the vanished.

Without the DEVELOPER to keep the peace, the HACKERs took over and they world, 
descended into DARK AGE. 

Despite everything, the legend of the DEVELOPER survived on the wind's breath.
To this day, the people still believe that the DEVELOPER will return.

Only time will tell if they do...
""");
      Scanner scanner = new Scanner(System.in);

      System.out.println("Traveler, I have not seen you before. What is your name?");
      System.out.print("Your name: ");
      String playerName = scanner.nextLine();
      System.out.println("It is nice to meet you, " + playerName + ".");

      System.out.println(playerName + ", how many miles have you travelled?");
      System.out.print("> ");
      String input = scanner.nextLine();
      double distance = Double.parseDouble(input);
      System.out.println("Oh, you've travelled " + distance + " miles..?");

      scanner.close();
    }
}
