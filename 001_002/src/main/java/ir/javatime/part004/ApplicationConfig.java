package ir.javatime.part004;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
    public Date getDate(){
        return new Date();
    }

    @Bean
    public Hello getHello(){
        return new Hello();
    }
}
