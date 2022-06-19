package ir.javatime.part002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/15/2022
 * Time: 9:58 PM
 */

@Component
public class Hello {

    @Autowired
    private Bye bye;

    public void sayHello(String username){
        System.out.println("Hello " + username);
        bye.sayBye(username);
    }
}
