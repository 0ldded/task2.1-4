public class Shape
{
    private String type;

    public Shape(String dtype)
    {
        type = dtype;
    }

    public String toString()
    {
        return "Type of figure: " + type;
    }
}