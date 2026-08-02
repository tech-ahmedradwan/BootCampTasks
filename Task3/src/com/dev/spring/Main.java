package com.dev.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Vehicle bmw = container.getBean("car",Vehicle.class);
        bmw.save("bmw-i6");
        Vehicle f16 = container.getBean("plane",Vehicle.class);
        f16.save("f16-fight");
    }
}
