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
        
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ?
                    histogram.get(key) +1 : 1);
            System.out.println(data[key] + "==>" + histogram.get(key));
        }
    }
    
}
