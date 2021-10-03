/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.Map;



/**
 *
 * @author Simon
 */
public class Kata2 {
    
    public static void main(String[] args) {
        int[] data = {6,7,0,4,4,7,7,7,4,6,2,4,8,2,2};
        Histogram histo = new Histogram(data);
        
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (int key : data) {
            System.out.println(key + "==>" + histogr.get(key));
        }  
       

    }
    
}
