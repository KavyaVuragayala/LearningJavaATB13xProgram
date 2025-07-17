package ex_34_CollectionFramework_DSA;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Of_Character {
    public static void main(String[] args) {

        String input = "programming";
        Map<Character,Integer> freMap= new HashMap<>();
        // initially freMap is empty

        for(char c : input.toCharArray()){
            // c  ---> p,r,o,g,r,a,m,m,i,n,g
            // default values for each character at first occurance will be 0 + 1 = 1
            freMap.put(c,freMap.getOrDefault(c,0)+1);
        }
        System.out.println(freMap);
    }
}
