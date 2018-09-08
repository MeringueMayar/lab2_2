/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sharedkernel;

import java.math.BigDecimal;
import java.util.Currency;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author karko
 */
public class MoneyTest {

    /**
     * Test of multiplyBy method, of class Money.
     */
    @Test
    public void testMultiplyBy_double() {
        System.out.println("multiplyBy");
        double multiplier = 0.5;
        Money instance = new Money(10);
        Money expResult = new Money(5.0);
        Money result = instance.multiplyBy(multiplier);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplyBy method, of class Money.
     */
    @Test
    public void testMultiplyBy_BigDecimal() {
        System.out.println("multiplyBy");
        BigDecimal multiplier = new BigDecimal("0.5");
        Money instance = new Money(10);
        Money expResult = new Money(5);
        Money result = instance.multiplyBy(multiplier);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Money.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Money money1 = new Money(2.0, Currency.getInstance("USD"));
        Money money2 = new Money(3.0, Currency.getInstance("USD"));
        Money expResult = new Money(5.0, Currency.getInstance("USD"));
        Money result = money1.add(money2);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtract method, of class Money.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Money money1 = new Money(5.0, Currency.getInstance("USD"));
        Money money2 = new Money(3.0, Currency.getInstance("USD"));
        Money expResult = new Money(2.0, Currency.getInstance("USD"));
        Money result = money1.subtract(money2);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Money.
     */
    @Test
    public void testAddAddingDifferentCurrenciesThrowsException() {
        System.out.println("subtract");
        Money money1 = new Money(2.0, Currency.getInstance("PLN"));
        Money money2 = new Money(3.0, Currency.getInstance("USD"));
        try {
            money1.add(money2);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

}
