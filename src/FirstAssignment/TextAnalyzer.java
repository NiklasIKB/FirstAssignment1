package FirstAssignment;

import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {

        TextCounter newCounter = new TextCounter();
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        while (!newCounter.isItTimeToStop()) {

            newCounter.addRow(text);

            if (!newCounter.isItTimeToStop()) {
                text = scan.nextLine();
            }

        }

        System.out.println("Antalet rader: " + newCounter.getRowCount());
        System.out.println("Antalet tecken: " + newCounter.getCharCount());
    }
}
