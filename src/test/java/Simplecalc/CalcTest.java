package Simplecalc;

import org.junit.Assert;
import org.junit.Test;

// Простой тест, если я все правильно понял.

public class CalcTest {

    @Test
    public void calc() {
        Calc calc1 = new Calc();
        int act = calc1.calc(5,6);
        int exp = 11;
        Assert.assertEquals(exp,act);
    }

}