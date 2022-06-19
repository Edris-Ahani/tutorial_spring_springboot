package ir.javatime.part002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/15/2022
 * Time: 9:58 PM
 */

@Component("hello2")
public class Hello {

    @Qualifier("bye2")
    private Bye bye;

    //constructor injection
    @Autowired
    public Hello(Bye bye) {
        this.bye = bye;
    }

    public void sayHello(String username){
        System.out.println("Hello " + username);
        bye.sayBye(username);
    }
}
