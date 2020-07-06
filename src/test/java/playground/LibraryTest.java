package playground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LibraryTest {
    @Test @DisplayName("Start here.") void someLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
}
