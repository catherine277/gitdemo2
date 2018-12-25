package com.newer.test;

import com.newer.domain.User;
import org.junit.Test;

public class DemoTest {

    @Test
    public void test1(){
        User u =new User();
        u.setUid(1);
        System.out.println(u.getUid());
    }
}
