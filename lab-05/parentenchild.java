class parent
{
    void dispparent()
    {
        System.out.println("This is a parent class");
    }

}

class child extends parent
{
    void dispchild()
    {
        System.out.println("This is the child class");
    }
}

public class parentenchild
{
    public static void main(String args[])
    {
        parent p = new parent();
        child c = new child();
        p.dispparent();
        c.dispchild();
        c.dispparent();
}
}