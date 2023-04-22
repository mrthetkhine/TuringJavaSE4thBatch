public class HelloWorld
{
    public static void main(String[]args)
    {
        System.out.println("Hello World");
        for(String str : args)
        {
            System.out.println("Arg " +str);
        }
    }
}