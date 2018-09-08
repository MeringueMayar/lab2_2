/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.util.Date;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 *
 * @author karko
 */
public class InvoiceLineTest {

    double price;
    int quantity;
    double net;
    double tax;
    ProductData productData;
    InvoiceLine invoiceLine;

    public InvoiceLineTest() {
    }

    @Before
    public void setUp() {
        price = 1.00;
        quantity = 1;
        net = 10.00;
        tax = 1.00;
        productData = new ProductData(Id.generate(), new Money(price), "product",
                ProductType.DRUG, new Date());
        invoiceLine = new InvoiceLine(productData, quantity, new Money(net),
                new Tax(new Money(tax), "desc"));
    }

    @Test
    public void invoiceLineConstructorCorrectlyCreatedNet() {
        assertThat(invoiceLine.getNet(), is(new Money(net)));
    }

    @Test
    public void invoiceLineCalculateGrosTest() {
        assertThat(invoiceLine.getGros(), is(new Money(net + tax)));
    }

}
