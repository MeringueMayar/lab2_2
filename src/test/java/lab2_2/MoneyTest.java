package lab2_2;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Currency;

import org.hamcrest.Matchers;
import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;

//test dla multiplyBy, add, subtract, greaterThan, LessThan, EqualTo...
public class MoneyTest {

    @Test
    public void multiplyByTestWithArgumentDouble() {
    	 Money money=new Money(new BigDecimal(10));
    	 assertThat(money.multiplyBy(5.0), Matchers.is(new Money(new BigDecimal(50))));
    }
    
}
