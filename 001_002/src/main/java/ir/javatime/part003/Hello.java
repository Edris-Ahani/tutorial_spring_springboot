package ir.javatime.part003;


/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/15/2022
 * Time: 9:58 PM
 */

public abstract class Hello {

    public void sayHello(String username){
        System.out.println("Hello " + username);
        getBye().sayBye(username);
    }

    //method injection
    public abstract Bye getBye();
}
