package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Product;
import java.util.List;
import junit.framework.TestCase;

public class ProductDaoJdbcTest extends TestCase {
    
    public ProductDaoJdbcTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCreate() {
        System.out.println("create");
        Product product = new Product();
        product.setProductId(1);
        product.setName("Bruce Springsteen - Born to Run");
        ProductDaoJdbc instance = new ProductDaoJdbc();
        Product expResult = product;
        //Product result = instance.create(product);
        //assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        Product product = null;
        ProductDaoJdbc instance = new ProductDaoJdbc();
        Product expResult = null;
        //Product result = instance.update(product);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testDelete() {
        System.out.println("delete");
        Product product = null;
        ProductDaoJdbc instance = new ProductDaoJdbc();
        //instance.delete(product);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindById() {
        System.out.println("findById");
        Integer productId = null;
        ProductDaoJdbc instance = new ProductDaoJdbc();
        Product expResult = null;
        //Product result = instance.findById(productId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        ProductDaoJdbc instance = new ProductDaoJdbc();
        List expResult = null;
       // List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
