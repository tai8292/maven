package tantai;

public class Drawing {

    private Shape shape;

    public Drawing(Shape shape)
    {
        this.shape = shape;
    }

    public void setShape(Shape shape)
    {
        this.shape = shape;
    }

    public void prepating()
    {
        System.out.println("Preparing...");
    }

    public void draw()
    {
        this.shape.draw();
    }
}
