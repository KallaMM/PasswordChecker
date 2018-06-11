package PasswordChecker;

import static PasswordChecker.App.checkingFUCNTION;

import org.junit.Assert;
import org.junit.Test;

public class BlackBoxTestDriver {

  @Test
  public void testSuite(){
    TC1_testCase1();
    TC2_SmallLetters();
    TC3_OnlyBigLetters();
    TC3_SmallAndBig();
    TC4_LessThan6();
    TC5_OneNumber();
    TC6_SpecialChar();
    TC7_OnlyBig();
    TC8_oneNumberOneChar();
    TC9_smallLettersAndMoreThan6();
    TC10_NumbersAndLongerThan6();
    TC11_SpecialAndMore6();
    TC12_SmallBigAndOneNumber();
    TC13_SmallBigSpecialChar();
    TC14_SmallBigLettersLonger6AndNumber();
    TC15_SmallBigLonger6AndSpecial();
    TC16_StrongPasword();
  }

  private void TC1_testCase1() {
    Assert.assertFalse(checkingFUCNTION(""));
  }

  private void TC2_SmallLetters() {
    Assert.assertFalse(checkingFUCNTION("qwertyuiop"));
  }

  private void TC3_OnlyBigLetters() {
    Assert.assertFalse(checkingFUCNTION("BSDUDDS"));
  }

  private void TC3_SmallAndBig() {
    Assert.assertFalse(checkingFUCNTION("ASDFGjkloiu"));
  }


  private void TC4_LessThan6() {
    Assert.assertFalse(checkingFUCNTION("12we"));
  }


  private void TC5_OneNumber() {
    Assert.assertFalse(checkingFUCNTION("2"));
  }


  private void TC6_SpecialChar() {
    Assert.assertTrue((checkingFUCNTION("dasjidasDJID7_")
        && (checkingFUCNTION("dashuDSHU23$")
        && (checkingFUCNTION("dsdhuDSHU2#")
        && (checkingFUCNTION("sdhu3hdusDHUS3!")
        && (checkingFUCNTION("JSIAsaji7@")))))));
  }


  private void TC7_OnlyBig() {
    Assert.assertFalse(checkingFUCNTION("ZXCVB"));
  }


  private void TC8_oneNumberOneChar() {
    Assert.assertFalse(checkingFUCNTION("1@"));
  }


  private void TC9_smallLettersAndMoreThan6() {
    Assert.assertFalse(checkingFUCNTION("klaudiamar"));
  }


  private void TC10_NumbersAndLongerThan6() {
    Assert.assertFalse(checkingFUCNTION("1234567"));
  }


  private void TC11_SpecialAndMore6() {
    Assert.assertFalse(checkingFUCNTION("!@!@#$"));
  }


  private void TC12_SmallBigAndOneNumber() {
    Assert.assertFalse(checkingFUCNTION("As1"));
  }


  private void TC13_SmallBigSpecialChar() {
    Assert.assertFalse(checkingFUCNTION("Zx!"));
  }


  private void TC14_SmallBigLettersLonger6AndNumber() {
    Assert.assertFalse(checkingFUCNTION("ASDgjkhb1"));
  }


  private void TC15_SmallBigLonger6AndSpecial() {
    Assert.assertFalse(checkingFUCNTION("ZXCasdf!"));
  }


  private void TC16_StrongPasword() {
    Assert.assertTrue(checkingFUCNTION("ASxcvb!!1234"));
  }

}
