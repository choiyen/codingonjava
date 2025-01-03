package _05_Class.Practice;

public class Rectangle
{
    private int width;
    private int height;

    public Rectangle(int width) {
        this.width = width;
    }
    public int size ()
    {
        if(height > 0)
        {
            return width * height;
        }
        else
        {
            return width * 0;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width)
    {
        if(width < 0)
        {
            this.width = 1;
        }
        else
        {
            this.width = width;
        }

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height < 0)
        {
            this.height = 1;
        }
        else
        {
            this.height = height;
        }
    }
}
