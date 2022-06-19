package ir.javatime.part007;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/16/2022
 * Time: 9:25 PM
 */

public class Operation {

    @Autowired
    private Start start;
    @Autowired
    private Middle middle;
    @Autowired
    private Finish finish;


    public void operation(){
        finish.run();
        start.run();
        middle.run();
    }
}
