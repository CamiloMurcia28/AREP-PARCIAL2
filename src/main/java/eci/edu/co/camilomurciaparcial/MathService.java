/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eci.edu.co.camilomurciaparcial;

import org.springframework.stereotype.Service;

/**
 *
 * @author camilo.murcia-e
 */
@Service
public class MathService {
    
    public MathService(){
        
    }
    
    public int linealSearch(int[] list, int value){
        if(list.length > 0){
            for(int i=0; i < list.length; i++){
                if(list[i]==value){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public int binarySearch(int[] list, int value){
        int left = 0;
        int right = list.length - 1;
        
        while(left <= right){
            int mid = left + (right-left);
            
            if(list[mid] == value){
                return mid;
            }else if(list[mid] < value){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }
    
}
