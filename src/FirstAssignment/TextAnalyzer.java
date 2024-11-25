package FirstAssignment;

import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {

        TextCounter newCounter = new TextCounter();
        Scanner scan = new Scanner(System.in);


        while (!newCounter.isItTimeToStop()) {
           String text = scan.nextLine();
            newCounter.addRow(text);

        }

        System.out.println("Antalet rader: " + newCounter.getRowCount());
        System.out.println("Antalet tecken: " + newCounter.getCharCount());
    }
}
