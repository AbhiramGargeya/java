import java.util.*;

class Shape
{
    float lenght;
    float breath;
    float height;

    Shape(float l,float b,float h )
    {
        this.breath = b;
        this.height = h;
        this.lenght = l;  
    }
    Shape(float l,float b )
    {
        this.lenght = l;
        this.breath = b;
    }
}

class Test1 extends Shape
{
    Test1(float l,float b,float h)
    {
        super(l, b , h);
    }
    Test1(float l,float b)
    {
        super(l, b);
    }

    float calcuate()
    {
        float vol = lenght*breath*height;
        return vol;
    }

}
public class shapenoverride
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lenght breath and height values:");
        float  l = s.nextFloat();
        float b = s.nextFloat();
        float h = s.nextFloat();
        Test1 t = new Test1(l, b, h);
        t.calcuate();


    }
}
