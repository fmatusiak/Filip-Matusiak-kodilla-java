package com.kodilla.hibernate.task.dao.com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ItemDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item = new Item(new BigDecimal(50), 7, new BigDecimal(50));
        Item item1 = new Item(new BigDecimal(100), 8, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(200), 9, new BigDecimal(200));

        Invoice invoice = new Invoice("2019");

        Product product = new Product("Fruits");
        Product product1 = new Product("Vegetables");
        Product product2 = new Product("Meat");

        item.setProduct(product);
        item1.setProduct(product1);

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);

        //Then
        List<Invoice> invoiceList = invoiceDao.findByNumber("2019");
        List<Product> productList = productDao.findByName("Fruits");
        List<Item> itemList = itemDao.findByQuantity(7);

        Assert.assertEquals(1, invoiceList.size());
        Assert.assertEquals(1, productList.size());
        Assert.assertEquals(1, itemList.size());

        //CleanUp
        invoiceDao.delete(invoice);
    }

}
