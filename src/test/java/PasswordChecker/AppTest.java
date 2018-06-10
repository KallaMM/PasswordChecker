package PasswordChecker;

import static PasswordChecker.App.checkingFUCNTION;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCase1() {
        Assert.assertFalse(checkingFUCNTION(""));
    }
}
