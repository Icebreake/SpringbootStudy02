package com.example.demo02;


import com.example.bean.Person1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Demo02ApplicationTests {

    @Autowired
    Person1 person1;

    //IOC容器
    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        //校验IOC容器中是否包含组件personService
        boolean b = ioc.containsBean("personService");
        if (b){
            System.out.println("personService 已经添加到IOC 容器中");
        } else {
            System.out.println("personService 没添加到IOC 容器中");
        }
    }

    @Test
    void contextLoads() {
        System.out.println(person1);
    }

}
