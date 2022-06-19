package ir.javatime.part006;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;


/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/16/2022
 * Time: 8:08 PM
 */

@Configuration
@ComponentScan(basePackages = "ir.javatime")
public class ApplicationConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Date getDate(){
        return new Date();
    }

    @Bean()
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Hello getHello(){
        return new Hello(){
            @Override
            public void sayHello(String username) {
                System.out.println("Hello " + username + " " + getDate().toGMTString());

            }
        };
    }
}
