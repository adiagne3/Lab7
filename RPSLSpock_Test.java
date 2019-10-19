package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Abdou Latif Diagne
 * Purpose: test the RPSLSpock class
 */

public class RPSLSpock_Test {

    @Before
    public void testRPSLSpock(){
    }

    //Testing the isValickPick method
    @Test
    public void isValidPickTest() {
        Assert.assertTrue(RPSLSpock.isValidPick("rock"));
        Assert.assertTrue(RPSLSpock.isValidPick("paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("scissors"));
        Assert.assertTrue(RPSLSpock.isValidPick("lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("spock"));
        Assert.assertFalse(RPSLSpock.isValidPick("hulk"));
    }

    //Testing the generatePick method
    @Test
    public void generatePickTest() {
        String pickTest;
        boolean testValue;
        for (int i = 0; i < 1000000; i++) {
            pickTest= RPSLSpock.generatePick();
            if (pickTest.equals(RPSLSpock.ROCK) || pickTest.equals(RPSLSpock.PAPER) || pickTest.equals(RPSLSpock.SCISSORS) ||
                    pickTest.equals(RPSLSpock.LIZARD) || pickTest.equals(RPSLSpock.SPOCK)) {
                testValue = true;
            } else {
                testValue = false;
            }
            Assert.assertTrue(testValue==true);
        }
    }

    //Testing the isComputerWin method
    @Test
    public void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.SCISSORS));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.PAPER));

    }
}