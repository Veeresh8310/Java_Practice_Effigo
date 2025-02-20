package Collections;
import java.util.*;

class Collec1 {

    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            al.add(i);
        System.out.println(al);// printing array list values using for loop

        al.remove(3);//Removing element using index position

        al.add(2, 3);//To add elements at particular position using index position
        System.out.println(al);
        
        al.set(3, 4);// modifying the value using index position

        for (Integer x:al)
            System.out.println(x);// printing using for each
        System.out.println(" ");
        
        al.get(4);//to get value using index
        
        Iterator it=al.iterator();// storing list into it of Iterator type
        while(it.hasNext())
        {
        	System.out.println(it.next());//printing the list items using next() method
        }
        
        ArrayList<Integer> al1=new ArrayList<Integer>();//removing multiple elements using removeAll()
        		al1.add(2);
        		al1.add(1);
        		al.removeAll(al1);
        		System.out.println(al);
        		al.clear();
        		al.isEmpty();
        }
}
