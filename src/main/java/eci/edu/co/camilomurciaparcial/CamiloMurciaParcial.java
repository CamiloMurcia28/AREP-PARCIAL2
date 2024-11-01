package eci.edu.co.camilomurciaparcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;

@SpringBootApplication
public class CamiloMurciaParcial {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CamiloMurciaParcial.class);
        
        // Configurar el puerto
        app.setDefaultProperties(Collections.singletonMap("server.port", getPort()));
        
        app.run(args);
    }
    
    private static int getPort() {
        String port = System.getenv("PORT");
        if (port != null) {
            return Integer.parseInt(port);
        }
        return 8080; // Puerto por defecto
    }
}