package ir.javatime.part2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/15/2022
 * Time: 9:58 PM
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //first way
        Hello bean = applicationContext.getBean(Hello.class);
        bean.sayHello("Edris");


    }
}
