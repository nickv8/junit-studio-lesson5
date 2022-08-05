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
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));

    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void singleOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[hello"));
    }

    @Test
    public void singleClosingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("hello]"));
    }


    @Test
    public void balancedBracketsTwoClosingReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]hello]"));
    }

    @Test
    public void balanceBracketsTwoOpeningReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[hello["));
    }

    @Test
    public void balanceBracketsTwoOpenOneClosedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void balanceBracketTwoClosedOneOpenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }


    @Test
    public void openingBracketComesAfterClosingBracketFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void twoSetsOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void fixedBracketSetsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }

    @Test
    public void fixedBracketSetsReturnTrue2(){
        assertEquals(BalancedBrackets.hasBalancedBrackets("[[]][]"), true);
    }



}
