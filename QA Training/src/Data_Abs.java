abstract class Animal2 
{
public abstract void sound();
public void eat()
{
System.out.println("This animal is eating.");
}
}
class Dog2 extends Animal2
{
public void sound() 
{
System.out.println("The dog barks.");
}
} 