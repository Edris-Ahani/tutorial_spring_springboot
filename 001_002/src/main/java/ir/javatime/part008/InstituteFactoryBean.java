package ir.javatime.part008;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/17/2022
 * Time: 8:00 PM
 */

@Component
public class InstituteFactoryBean implements FactoryBean<InstituteDescription> {

    @Override
    public InstituteDescription getObject() throws Exception {
        return new InstituteDescription("Name", "Address", "Activity");
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
