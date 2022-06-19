package ir.javatime.part003;


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


        //Error:
        Hello bean = applicationContext.getBean(Hello.class);
        bean.sayHello("Edris");



    }
}
