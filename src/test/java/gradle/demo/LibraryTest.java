/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testSomeOtherLibraryMethod() {
        Library classUnderTest = new Library();
        assertEquals("someLibraryMethod should return 'Hello, World!'", "Hello, World!", classUnderTest.someOtherMethod());
    }
}
