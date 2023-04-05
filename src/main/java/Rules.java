abstract class  Vehicle{
    abstract void wheel();
    abstract void streeing();
    void colour()
    {
        System.out.println("red");
    }
}
class Tata extends Vehicle
{
    void wheel()
    {
        System.out.println("i have wheel");
    }
    void streeing()
    {
        System.out.println("have streeing");
    }
}
public class Rules
{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Tata t = new Tata();
        t.wheel();
        t.streeing();


    }
}