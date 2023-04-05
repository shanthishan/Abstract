

interface  Car
{
    void light();
    void wheel();
    void colour();
}
class Honda {
    void light()
    {
        System.out.println("i have light");
    }
    void wheel()
    {
        System.out.println("i have wheel");

    }
    void colour()
    {
        System.out.println("yellow");
    }
}
public class Interface  {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Honda H=new Honda();
        H.light();
        H.wheel();
        H.colour();
    }

}
