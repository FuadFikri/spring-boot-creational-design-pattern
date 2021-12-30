package com.fikri.syamsudin.creationalpattern;


import com.fikri.syamsudin.creationalpattern.singleton.Counter;
import com.fikri.syamsudin.creationalpattern.singleton.SingletonApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = SingletonApp.class)
public class SingletonTest {

    @Autowired
    private ApplicationContext applicationContext;


    @Test
    public void singletonTest(){
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);
        Counter counter3 = applicationContext.getBean(Counter.class);

//        akan mendapatkan object yang sama

        counter1.increment(); // value : 1
        counter2.increment(); // value : 2
        counter3.increment(); // value : 3

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
        System.out.println(counter3.getValue());

        Assertions.assertEquals(3,counter1.getValue());
        Assertions.assertEquals(3,counter2.getValue());
        Assertions.assertEquals(3,counter3.getValue());
    }

    private void incrementCounterAsync(Counter counter, int total){
        new Thread(() -> {
            for (int i = 0; i < total; i++) {
                counter.increment();
            }
        }).start();
    }

    @Test
    void incrementRaceCondition() throws InterruptedException {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);

        incrementCounterAsync(counter1, 100_000);
        incrementCounterAsync(counter2, 100_000);


        Thread.sleep(5_000);

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
    }
}
