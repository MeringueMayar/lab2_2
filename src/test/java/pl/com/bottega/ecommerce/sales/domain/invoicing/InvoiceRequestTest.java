package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

/**
 *
 * @author karko
 */
public class InvoiceRequestTest {

    static InvoiceRequest invoiceRequest;
    static ClientData clientData;

    @Before
    public void setUp() {
        clientData = new ClientData(Id.generate(), "clientdata");
        invoiceRequest = new InvoiceRequest(clientData);
    }

    /**
     * Test of add method, of class InvoiceRequest.
     */
    @Test
    public void itemsListShouldBeEmpty() {
        assertThat(invoiceRequest.getItems().isEmpty(), is(true));
    }

}
