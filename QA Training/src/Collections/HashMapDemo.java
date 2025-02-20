package Collections;

import java.util.*;

class HashMapDemo {

    public static void main(String args[])
    {
  
        HashMap<Integer, String> hm1 = new HashMap<>();


        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        System.out.println(hm1);
        hm1.get(2);
        hm1.remove(1);
        
        System.out.println(hm1.keySet());
        System.out.println(hm1.values());
        System.out.println(hm1.entrySet());
    }
}
