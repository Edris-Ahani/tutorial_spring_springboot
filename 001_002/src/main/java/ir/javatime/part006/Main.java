package ir.javatime.part006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/15/2022
 * Time: 9:58 PM
 */

public class Main {
    public static void main(String[] args) {
        /*ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");*/

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Hello bean = applicationContext.getBean(Hello.class);
        bean.sayHello("Edris");
        System.out.println(bean.toString());

        Hello bean2 = applicationContext.getBean(Hello.class);
        bean2.sayHello("Edris");
        System.out.println(bean2.toString());



    }
}
