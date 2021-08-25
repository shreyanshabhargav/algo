package algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {
    @Test
    public void testBasic() {
        String input = "hello";
        String expectedOutput = "olleh";
        verify(input, expectedOutput);
    }

    @Test
    public void testReverseWithMultipleWords() {
        String input = "hello there how are you";
        String expectedOutput = "uoy era woh ereht olleh";
        verify(input, expectedOutput);
    }

    @Test
    public void testReverseWithEmptyInput() {
        String input = "";
        String expectedOutput = "";
        verify(input, expectedOutput);
    }

    private void verify(String input, String expectedOutput) {
        StringReverse reverseObj = new StringReverse();
        assertEquals(expectedOutput, reverseObj.reverse(input));
    }
}