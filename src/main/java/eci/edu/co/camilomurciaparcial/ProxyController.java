/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eci.edu.co.camilomurciaparcial;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ProxyController {
    
    ProxyRoundRobin proxyRoundRobin;

    @Autowired
    public ProxyController(ProxyRoundRobin proxyRoundRobin) {
        this.proxyRoundRobin = proxyRoundRobin;
    }

    @PostMapping("/proxy/linearSearch")
    public String linealSearch(@RequestParam("list") String list, @RequestParam("value") int value) {
        String encodedList = URLEncoder.encode(list, StandardCharsets.UTF_8);
        String path = "/linearSearch?list=" + encodedList + "&value=" + value;
        try{
            return proxyRoundRobin.sendRequest(path);
        }
        catch(Exception e){
            return e.getMessage();
        }
    }

     @PostMapping("/proxy/binarySearch")
    public String binarySearch(@RequestParam("list") String list, @RequestParam("value") String value) {
        String encodedList = URLEncoder.encode(list, StandardCharsets.UTF_8);
        String path = "/binarySearch?list=" + encodedList + "&value=" + value;
        try {
            return proxyRoundRobin.sendRequest(path);
        } catch(Exception e) {
            return "{\"error\": \"" + e.getMessage() + "\"}";
        }
    }
}

