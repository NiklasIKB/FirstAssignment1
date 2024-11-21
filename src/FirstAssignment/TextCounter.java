package FirstAssignment;

public class TextCounter {

    private int rowCount;
    private int charCount;
    private boolean stopCheck;
    //private String[] wordCount;


    public TextCounter() {
        rowCount = 0;
        charCount = 0;
        stopCheck = false;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getCharCount() {
        return charCount;
    }


    public void addRow(String row) {

        if (row.equalsIgnoreCase("stop")) {
            stopCheck = true;
            return; //för att avbryta metoden efter "stop"
        }
        rowCount++;
        charCount += row.trim().length(); //Ifall man råkar skriva ett mellanslag före eller efter ordet tas det bort
    }

    public boolean isItTimeToStop() {
        return stopCheck;
    }
}
