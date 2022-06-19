package ir.javatime.part010;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/17/2022
 * Time: 8:00 PM
 */

@Component("instituteFactoryBean2")
//@PropertySource("classpath:config.properties") or @PropertySource("classpath:/config.properties")
@PropertySource("classpath:/config.properties")
public class InstituteFactoryBean implements FactoryBean<InstituteDescription> {

    @Value("${name}")
    String name;
    @Value("${address}")
    String address;
    @Value("${activity}")
    String activity;

    @Override
    public InstituteDescription getObject() throws Exception {
        return new InstituteDescription(name, address, activity);
    }

    @Override
    public Class<?> getObjectType() {
        return InstituteDescription.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
