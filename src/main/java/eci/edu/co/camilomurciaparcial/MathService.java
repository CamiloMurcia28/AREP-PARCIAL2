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
    
    public boolean linealSearch(int[] list, int value){
        boolean flag = false;
        if(list.length > 0){
            for(int i=0; i < list.length; i++){
                if(list[i]==value){
                    flag = true;
                }
            }
        }
        else{
            System.out.println("No hay lista");
            flag = false;
        }
        return flag;
    }
    
    public boolean binarySearch(int[] list, int value){
        int left = 0;
        int right = list.length - 1;
        boolean flag = false;
        
        while(left <= right){
            int mid = left + (right-left);
            
            if(list[mid] == value){
                flag = true;
                return flag;
            }else if(list[mid] < value){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return flag;
    }
    
}
