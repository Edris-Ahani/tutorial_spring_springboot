package ir.javatime.part001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/15/2022
 * Time: 9:17 PM
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //first way
        Processor bean = applicationContext.getBean(Processor.class);
        bean.process("running process");

        //second way
        Processor bean2 = (Processor) applicationContext.getBean("processor");
        bean.process("running process");

    }
}
