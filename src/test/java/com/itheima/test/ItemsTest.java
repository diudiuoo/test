package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void findById(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
/*        ItemsDao itemsDao = context.getBean(ItemsDao.class);
        Items id = itemsDao.findById(2);
        System.out.println(id.getName());*/


        ItemsService itemsService = context.getBean(ItemsService.class);
        Items byId = itemsService.findById(3);
        System.out.println(byId.getName());
    }
}
