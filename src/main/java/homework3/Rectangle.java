package homework3;

public class Rectangle extends Shape
{
    public double GetWidth()
    {
        return m_Width;
    }

    public void SetWidth(double width)
    {
        m_Width = width;
    }

    public double GetLength()
    {
        return m_Length;
    }

    public void SetLength(double length)
    {
        m_Length = length;
    }

    protected double m_Width;
    protected double m_Length;

    public Rectangle(String sColor, boolean bIsFilled, double width, double length)
    {
        super(sColor, bIsFilled);
        m_Width = width;
        m_Length = length;
    }

    public Rectangle(double width, double length)
    {
        m_Width = width;
        m_Length = length;
    }

    @Override
    double GetArea()
    {
        return m_Length * m_Width;
    }

    @Override
    double GetPerimeter()
    {
        return m_Length*2 + m_Width*2;
    }
}
