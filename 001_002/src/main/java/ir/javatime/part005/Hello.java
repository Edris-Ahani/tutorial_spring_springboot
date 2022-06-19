package ir.javatime.part005;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/16/2022
 * Time: 8:10 PM
 */

public abstract class Hello {

    @Autowired
    private Date date;

    public abstract void sayHello(String username);
}
