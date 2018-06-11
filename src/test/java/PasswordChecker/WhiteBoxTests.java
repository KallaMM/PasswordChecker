package PasswordChecker;

import static PasswordChecker.App.checkingFUCNTION;

import org.junit.Assert;
import org.junit.Test;

public class WhiteBoxTests {

  @Test
  public void passwordLengthLessThan6Signs() {
    Assert.assertFalse(checkingFUCNTION("asf"));
  }

  @Test
  public void passwordMoreThan6SignsNoBigLetters() {
    Assert.assertFalse(checkingFUCNTION("qwertyuiop"));
  }

  @Test
  public void longerThan6AndBigAndSmallLettersNoNumber() {
    Assert.assertFalse(checkingFUCNTION("ASDFGjklsadoiu"));
  }

  @Test
  public void longerThan6AndBigAndSmallLettersWithNumberNoSpecialCharacter() {
    Assert.assertFalse(checkingFUCNTION("ASDFGjklsad3oiu"));
  }

  @Test
  public void longerThan6AndBigAndSmallLettersWithNumberWithSpecialCharacter() {
    Assert.assertTrue(checkingFUCNTION("ASDFGjklsad3oi*#u"));
  }

}
