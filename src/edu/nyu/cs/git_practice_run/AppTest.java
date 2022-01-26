// DO NOT TOUCH THIS FILE!
package edu.nyu.cs.git_practice_run;

// import junit 4 testing framework
import org.junit.Test;
import org.junit.Rule;
import static org.junit.Assert.*;
import org.junit.contrib.java.lang.system.SystemOutRule; // system rules lib - useful for capturing system output

public class AppTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule();

    @Test
    public void testBar() {
        String actual = App.bar();
        String expected = "Hello world!";
        assertEquals(expected, actual);
    }

    @Test
    public void testBaz() {
        systemOutRule.enableLog(); // start capturing System.out
        // systemOutRule.clearLog();
        App.baz();
        assertEquals("Hello world!\n", systemOutRule.getLog());
    }

    @Test
    public void testFoo() {
        // assertion 1
        String actual = App.foo("Hello", "world!");
        String expected = "Hello world!";
        assertEquals(expected, actual);
        // assertion 2
        actual = App.foo("World", "hello!");
        expected = "World hello!";
        assertEquals(expected, actual);

    }

    @Test
    public void testMain() {
        systemOutRule.enableLog(); // start capturing System.out
        String[] args = {};
        systemOutRule.enableLog();
        try {
            App.main(args);
            assertEquals("Hello world!\nHello world!\nHello world!\n", systemOutRule.getLog());
        }
        catch (Exception e) {
            assert false; // fail the test if any exception occurs
        }

    }

}
