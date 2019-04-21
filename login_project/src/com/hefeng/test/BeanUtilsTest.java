package com.hefeng.test;

import com.hefeng.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;


public class BeanUtilsTest {
    @Test
    public void test() {
        User user = new User();

        try {
            BeanUtils.setProperty(user, "hehe", "male");
            String gender = null;
            try {
                gender = BeanUtils.getProperty(user, "hehe");
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            System.out.println(gender);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //System.out.println(user);



    }
}
