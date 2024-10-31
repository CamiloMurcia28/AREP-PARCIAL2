/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eci.edu.co.camilomurciaparcial;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author camilo.murcia-e
 */

@SpringBootApplication
public class CamiloMurciaParcial {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CamiloMurciaParcial.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", getPort()));
        app.run(args);
    }
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 33025;
    }

}
