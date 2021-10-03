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
        String[] data = {"Carmen", "Jorge", "Carmen", "Jorge", "Carmen", "Rafa"};
        Histogram histo = new Histogram(data);
        
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (String key : data) {
            System.out.println(key + "==>" + histogr.get(key));
        }  
       

    }
    
}
