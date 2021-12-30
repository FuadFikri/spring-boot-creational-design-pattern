package com.fikri.syamsudin.creationalpattern;


import com.fikri.syamsudin.creationalpattern.prototype.Employee;
import com.fikri.syamsudin.creationalpattern.prototype.Position;
import com.fikri.syamsudin.creationalpattern.prototype.PrototypeApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = PrototypeApp.class)
public class PrototypeTest {

    @Autowired
    private ApplicationContext applicationContext;


    @Test
    void createEmployeeTest(){
        Employee employee1 = applicationContext.getBean("employeeManager",Employee.class);
        Employee employee2 = applicationContext.getBean("employeeStaff",Employee.class);

        employee1.setName("Fikri");
        employee2.setName("Frank");

        System.out.println(employee1);
        System.out.println(employee2);

        Assertions.assertEquals(Position.MANAGER, employee1.getPosition());
        Assertions.assertEquals(Position.STAFF, employee2.getPosition());
    }
}
