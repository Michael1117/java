package com.shoo.test;

import com.impl.ItemsDaoImpl;
import com.shoo.domain.Items;
import org.junit.Test;

import java.util.List;

public class ItemsTest {

    @Test
    public void findAll() {
        ItemsDaoImpl itemsDao = new ItemsDaoImpl();
        List<Items> list = itemsDao.findAll();

        for (Items items : list) {
            System.out.println(items.getName());
        }

    }
}
