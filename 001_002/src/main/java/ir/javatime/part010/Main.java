package ir.javatime.part010;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/15/2022
 * Time: 9:58 PM
 */

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        InstituteDescription bean = applicationContext.getBean(InstituteDescription.class);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(bean.toString());
            }
        }, 0, 1000);//wait 0 ms before doing the action and do it evry 1000ms (1second)

        //timer.cancel();//stop the timer
    }
}
