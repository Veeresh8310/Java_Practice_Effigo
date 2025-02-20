public class Main 
{ 
    public static void main(String[] args) 
    { 
        MathOperations math = new MathOperations(); 
        System.out.println(math.add(5, 10));         
        System.out.println(math.add(5, 10, 15));   
        System.out.println(math.add(5.5, 10.5));      
    } 
} 