package FirstAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestClass {

    @Test
    public void testCountOneRow() { //testar hur många rader som skrivits in

        TextCounter counter = new TextCounter();

        counter.addRow("tjena");

        int actual = counter.getRowCount();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testCountTenCharacters() { //testar om 10 tecken har skrivits in

        TextCounter counter = new TextCounter();

        counter.addRow("tjena");
        counter.addRow("hejdå");

        int actual = counter.getCharCount();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void testForNotCountingStop() { //testar ifall raden med "stop" läses in eller ej

        TextCounter counter = new TextCounter();

        counter.addRow("tjena");
        counter.addRow("ojdå");
        counter.addRow("stop");
        int actual = counter.getRowCount();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testTrimSpaces() { //testar om mellanslagen trimmas bort

        TextCounter counter = new TextCounter();

        counter.addRow("mellanslag ");
        counter.addRow(" slagmellan");

        int actual = counter.getCharCount();
        int expected = 20;

        assertEquals(expected, actual);
    }

}
