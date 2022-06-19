package ir.javatime.part1;

import org.springframework.stereotype.Component;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/15/2022
 * Time: 9:11 PM
 */

@Component
public class Processor {
    public void process(String input){
        System.out.println(input);
    }
}
