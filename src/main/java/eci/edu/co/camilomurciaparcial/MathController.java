/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eci.edu.co.camilomurciaparcial;
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
    
    @GetMapping("/linearSearch")
    public ResponseEntity<?> linearSearch(@RequestParam String list, @RequestParam int value){
        String[] listt = list.split(",");
        int[] valueList = new int[listt.length];
        for(int i=0;i<list.length();i++){
            valueList[i] = Integer.parseInt(listt[i]);
        }
        return new ResponseEntity( mathService.linealSearch(valueList, value), HttpStatus.OK);
    }
    
   @GetMapping("/binarySearch")
    public ResponseEntity<?> binarySearch(@RequestParam String[] list, @RequestParam String value){
        int[] valueList = new int[list.length];
        for(int i=0;i<list.length;i++){
            valueList[i] = Integer.parseInt(list[i]);
        }
        int valor = Integer.parseInt(value);
        return new ResponseEntity( mathService.binarySearch(valueList, valor), HttpStatus.OK);
    } 
}
