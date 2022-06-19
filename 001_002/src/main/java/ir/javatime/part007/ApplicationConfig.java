package ir.javatime.part007;

import org.springframework.context.annotation.*;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/16/2022
 * Time: 8:08 PM
 */

@Configuration
@ComponentScan(basePackages = "ir.javatime")
public class ApplicationConfig {

    @Bean("start")
    public Start getStart(){
        return new Start();
    }

    @Bean("middle")
    @DependsOn({"start","finish"})
    public Middle getMiddle(){
        return new Middle();
    }

    @Bean("finish")
    public Finish getFinish(){
        return new Finish();
    }

    @Bean()
    public Operation getOperation(){
        return new Operation();
    }
}
