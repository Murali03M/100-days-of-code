// A simple enum example where enum is declared
// outside any class (Note enum keyword instead of
// class keyword)

public class Enum
{
    enum Color
    {
        RED, GREEN, BLUE;
    }
  
    // Driver method
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
