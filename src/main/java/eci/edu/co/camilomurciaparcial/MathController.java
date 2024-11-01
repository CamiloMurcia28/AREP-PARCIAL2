/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eci.edu.co.camilomurciaparcial;
import java.util.*;
import static java.util.Collections.list;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camilo.murcia-e
 */

@RestController
public class MathController {

    @Autowired
    private MathService mathService;
    
    @PostMapping("/linearSearch")
    public ResponseEntity<?> linearSearch(@RequestParam("list") String listStr, @RequestParam("value") int value) {
        try {
            int[] list = parseList(listStr);
            int result = mathService.linealSearch(list, value);
            Map<String, Object> response = new HashMap<>();
            response.put("operation", "linearSearch");
            response.put("inputList", Arrays.toString(list));
            response.put("value", value);
            response.put("output", result);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            Map<String, String> error = new HashMap<>();
            error.put("error", e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
    }
    
   @PostMapping("/binarySearch")
    public ResponseEntity<?> binarySearch(@RequestParam("list") String listStr, @RequestParam("value") int value) {
        try {
            int[] list = parseList(listStr);
            int result = mathService.binarySearch(list, value);
            Map<String, Object> response = new HashMap<>();
            response.put("operation", "binarySearch");
            response.put("inputList", Arrays.toString(list));
            response.put("value", value);
            response.put("output", result);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            Map<String, String> error = new HashMap<>();
            error.put("error", e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
    }
    
    private int[] parseList(String listStr) {
        return Arrays.stream(listStr.split(","))
                    .map(String::trim)
                    .mapToInt(Integer::parseInt)
                    .toArray();
    }
}
