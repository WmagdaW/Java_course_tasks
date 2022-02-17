package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item (new Product("book"), new BigDecimal(20), 1, new BigDecimal(20));
        Item item2 = new Item (new Product("pen"), new BigDecimal(10), 1, new BigDecimal(10));
        Item item3 = new Item (new Product("dictionary"), new BigDecimal(300), 1, new BigDecimal(300));

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Invoice invoice1 = new Invoice ("17/01/2022", items);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //Then
        assertEquals(3, invoice1.getItems().size());

        //CleanUp
//        invoiceDao.deleteAll();
    }

    @Test
    void testFindByNumberThatDoesntExist() {
        //Given

        //When
        Invoice invoice1 = invoiceDao.findByNumber("10/02/2022");

        //Then
        assertNull(invoice1);

    }
}
