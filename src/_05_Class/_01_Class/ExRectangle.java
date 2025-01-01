package _05_Class._01_Class;

public class ExRectangle
{
        private int width;
        private int height;
        public ExRectangle(int width, int height)
        {
            this.width = width;
            this.height = height;
        }
        public int area()
        {
            return height*width;
        }
}
