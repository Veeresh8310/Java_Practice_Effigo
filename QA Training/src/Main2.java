class Counter
{
    static int count = 0;
    Counter() {
        count++;
    }
    void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.displayCount(); 
        c2.displayCount(); 
    }
}