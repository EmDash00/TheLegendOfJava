package edu.legendofjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import com.github.lalyos.jfiglet.FigletFont;

public class Banner {

    public static void displayBanner(boolean shouldFlash) throws IOException, InterruptedException {
        final String FONT_PATH = "classpath:/3d.flf";
        Scanner scanner = new Scanner(System.in);
        final String[] COLORS = {
            "\u001B[33m", // yellow
            "\u001B[32m", // green
            "\u001B[36m", // cyan
            "\u001B[37m"  // white
        };

        InputStream file = App.class.getResourceAsStream("/java-cup.ans");
        StringBuilder banner = new StringBuilder();

        try (BufferedReader reader =
                    new BufferedReader(new InputStreamReader(file, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                banner.append(line).append('\n');
            }
        }


        int i = 0;
        String BANNER_LINE1 = FigletFont.convertOneLine(FONT_PATH, "THE LEGEND");
        String BANNER_LINE2 = FigletFont.convertOneLine(FONT_PATH, "       OF JAVA");

        System.out.print("\u001B[0m\u001B[H\u001B[2J");
        System.out.flush();

        while (true) {
            System.out.print(COLORS[i]);
            System.out.println(BANNER_LINE1);
            System.out.println(BANNER_LINE2);
            System.out.println(banner);

            System.out.print("\u001B[0m");

            System.out.println();
            System.out.print("                               Press [enter] to continue...");
            if (!shouldFlash) {
              scanner.nextLine();
              break;
            }

            if (System.in.available() > 0) {
              scanner.nextLine();
              break;
            }

            Thread.sleep(750);
            System.out.print("\u001B[0m\u001B[H\u001B[2J");
            System.out.flush();
            i = (i + 1) % COLORS.length;
          
        }
        scanner.close();
        System.out.print("\u001B[0m\u001B[H\u001B[2J");
        System.out.flush();
    }
}
