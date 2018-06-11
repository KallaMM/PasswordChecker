package PasswordChecker;

import static PasswordChecker.App.checkingFUCNTION;

import org.junit.Assert;
import org.junit.Test;

public class BlackBoxTests {

    @Test
    public void TC1_testCase1() {
        Assert.assertFalse(checkingFUCNTION(""));
    }

    @Test
    public void TC2_SmallLetters() {
        Assert.assertFalse(checkingFUCNTION("qwertyuiop"));
    }

    @Test
    public void TC3_OnlyBigLetters() {
        Assert.assertFalse(checkingFUCNTION("BSDUDDS"));
    }

    @Test
    public void TC3_SmallAndBig() {
        Assert.assertFalse(checkingFUCNTION("ASDFGjkloiu"));
    }

    @Test
    public void TC4_LessThan6() {
        Assert.assertFalse(checkingFUCNTION("12we"));
    }

    @Test
    public void TC5_OneNumber() {
        Assert.assertFalse(checkingFUCNTION("2"));
    }

    @Test
    public void TC6_SpecialChar() {
        Assert.assertTrue((checkingFUCNTION("dasjidasDJID7_")
                && (checkingFUCNTION("dashuDSHU23$")
                && (checkingFUCNTION("dsdhuDSHU2#")
                && (checkingFUCNTION("sdhu3hdusDHUS3!")
                && (checkingFUCNTION("JSIAsaji7@")))))));
    }

    @Test
    public void TC7_OnlyBig() {
        Assert.assertFalse(checkingFUCNTION("ZXCVB"));
    }

    @Test
    public void TC8_oneNumberOneChar() {
        Assert.assertFalse(checkingFUCNTION("1@"));
    }

    @Test
    public void TC9_smallLettersAndMoreThan6() {
        Assert.assertFalse(checkingFUCNTION("klaudiamar"));
    }

    @Test
    public void TC10_NumbersAndLongerThan6() {
        Assert.assertFalse(checkingFUCNTION("1234567"));
    }

    @Test
    public void TC11_SpecialAndMore6() {
        Assert.assertFalse(checkingFUCNTION("!@!@#$"));
    }

    @Test
    public void TC12_SmallBigAndOneNumber() {
        Assert.assertFalse(checkingFUCNTION("As1"));
    }

    @Test
    public void TC13_SmallBigSpecialChar() {
        Assert.assertFalse(checkingFUCNTION("Zx!"));
    }

    @Test
    public void TC14_SmallBigLettersLonger6AndNumber() {
        Assert.assertFalse(checkingFUCNTION("ASDgjkhb1"));
    }

    @Test
    public void TC15_SmallBigLonger6AndSpecial() {
        Assert.assertFalse(checkingFUCNTION("ZXCasdf!"));
    }

    @Test
    public void TC16_StrongPasword() {
        Assert.assertTrue(checkingFUCNTION("ASxcvb!!1234"));
    }
}

