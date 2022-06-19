package ir.javatime.part003;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/16/2022
 * Time: 8:08 PM
 */

@Configuration
public class ApplicationConfig {

    @Bean
    public Bye getBye(){
        return  new Bye();
    }

    @Bean
    public Hello getHello(){
        return new Hello(){
            @Override
            public Bye getBye() {
                return new Bye();
            }
        };
    }
}
