package ir.javatime.part004;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/16/2022
 * Time: 8:10 PM
 */

public class Hello {

    @Autowired
    private Date date;

    public void sayHello(String username){
        System.out.println("Hello " + username + " " + date.toGMTString());
    }
}
