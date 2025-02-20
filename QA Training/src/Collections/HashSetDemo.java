package Collections;

import java.util.*;

class HashSetDemo 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> hs = new HashSet<>();

          // Adding elements using add() method
        hs.add(100);
        hs.add(200);
        hs.add(300);

        System.out.println("HashSet Size: " + hs.size());//printing HashSet size
        System.out.println("Elements in HashSet: " + hs);//printing HashSet elements
        
        hs.remove(100);
        
        for(int x:hs)
        	System.out.println(x);
        System.out.println(" ");
        hs.add(400);
        
        ArrayList a=new ArrayList (hs);// converting HashSet into ArrayList
        System.out.println(a);//printing
        a.get(2);
        
        Iterator it=hs.iterator();// storing list into it of Iterator type
        while(it.hasNext())
        {
        	System.out.println(it.next());//printing the list items using next() method
        }
        hs.isEmpty();
   
   
    }
}
