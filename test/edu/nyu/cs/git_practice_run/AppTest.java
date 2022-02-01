// DO NOT TOUCH THIS FILE!
package edu.nyu.cs.git_practice_run;

// import junit 4 testing framework
import org.junit.Test;
import org.junit.Rule;
import static org.junit.Assert.*;
import org.junit.contrib.java.lang.system.SystemOutRule; // system rules lib - useful for capturing system output
// import static org.mockito.Mockito.*; // for mocking, stubbing, and spying

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
        String actual = systemOutRule.getLogWithNormalizedLineSeparator();
        assertEquals("Hello world!\n", actual);
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
            String actual = systemOutRule.getLogWithNormalizedLineSeparator();
            assertEquals("Hello world!\nHello world!\nHello world!\n", actual);
        }
        catch (Exception e) {
            assert false; // fail the test if any exception occurs
        }
    }

}
