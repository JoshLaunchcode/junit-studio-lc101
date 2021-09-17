package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAndStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void mixedStringsAndBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void stringAndThenBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void openBracketAndStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(("[LaunchCode")));
    }

    @Test
    public void stringAndClosingBracketFirstReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void onlyOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void backwardsBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}
