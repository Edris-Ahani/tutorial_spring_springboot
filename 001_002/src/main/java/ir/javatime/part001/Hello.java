package ir.javatime.part001;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/15/2022
 * Time: 9:58 PM
 */


@Component("hello1")
public class Hello {


    //setter injection  ==> the first way
    /*@Autowired*/
    @Qualifier("bye1")
    private Bye bye;

    public void sayHello(String username){
        System.out.println("Hello " + username);
        bye.sayBye(username);
    }

    //setter injection ==> the second way
    @Autowired
    public void setBye(Bye bye) {
        this.bye = bye;
    }
}
