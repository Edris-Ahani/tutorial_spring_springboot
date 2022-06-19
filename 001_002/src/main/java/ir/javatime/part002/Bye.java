package ir.javatime.part002;

import org.springframework.stereotype.Component;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/15/2022
 * Time: 9:59 PM
 */

@Component("bye2")
public class Bye {
    public void sayBye(String username){
        System.out.println("Bye " + username);
    }
}
