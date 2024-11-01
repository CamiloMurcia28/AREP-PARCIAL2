/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eci.edu.co.camilomurciaparcial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProxyRoundRobin {

    private static final String USER_AGENT = "Mozilla/5.0";
    private List<String> servers;
    private int currentIndex = 0;

    public ProxyRoundRobin() {
        servers = List.of(
//                "http://ec2-54-82-66-237.compute-1.amazonaws.com:9000",
//            "http://ec2-54-196-97-84.compute-1.amazonaws.com:9001"
                
                
                
                
                
                
            "http://localhost:9000",
                "http://localhost:9001"
                
        );
    }

    public String sendRequest(String path) throws IOException {
        String serverUrl = servers.get(currentIndex);
        currentIndex = (currentIndex + 1) % servers.size();
        URL obj = new URL(serverUrl + path);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } else {
            throw new IOException("HTTP error code: " + responseCode);
        }
    }
}
