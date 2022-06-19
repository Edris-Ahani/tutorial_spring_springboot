package ir.javatime.part009;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/17/2022
 * Time: 8:12 PM
 */

public class Hello {

    @Value("classpath:files/app.cert")
    private Resource cert;

    @Value("classpath:files/app.json")
    private Resource data;

    @Value("https://www.google.com/")
    private URL searchEngine;

    public void sayHello(){
        System.out.println(cert.exists());
        try {
            System.out.println(cert.contentLength());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(data.toString());
        try {
            System.out.println(
                    new BufferedReader(
                    new InputStreamReader(data.getInputStream(), StandardCharsets.UTF_8))
                    .lines()
                    .collect(Collectors.joining("\n"))
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(data.exists());
        System.out.println(searchEngine.toString());
    }
}
