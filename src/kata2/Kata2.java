/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author Simon
 */
public class Kata2 {

    
    
    public static void main(String[] args) {
        int[] data = {6,7,0,4,4,7,7,7,4,6,2,4,8,2,2};
        Map<Integer,Integer> histogram = new HashMap<>();
        
        
        for (int i = 0; i < data.length; i++) {
            
            if(histogram.get(data[i]) != null){                
                histogram.put(data[i], histogram.get(data[i])+1);
            }
            else histogram.put(data[i],1);
            
            System.out.println(data[i] + "==>" + histogram.get(data[i]));
        }
    }
    
}
