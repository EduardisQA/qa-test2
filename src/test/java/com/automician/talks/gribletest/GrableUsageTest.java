package com.automician.talks.gribletest;

import com.automician.talks.gribletest.testConfigs.BaseTest;
import com.automician.talks.gribletest.widgets.Products;

import org.junit.Test;

public class GrableUsageTest extends BaseTest {

    @Test
    public void createTestTableBasedOnDataStorageForNewProduct() {
        Products products = new Products();

        products.open();
        products.add("gridle");
    }
}