package homework3;

public class Square extends Rectangle
{
    public Square(String sColor, boolean bIsFilled, double size)
    {
        super(sColor, bIsFilled, size, size);
    }
    public void SetSide(double side)
    {
        m_Length = side;
        m_Width = side;
    }
    public double GetSide()
    {
        return m_Width;
    }

    @Override
    public void SetWidth(double width)
    {
        SetSide(width);
    }


    @Override
    public void SetLength(double length)
    {
        SetSide(length);
    }

    @Override
    double GetArea()
    {
        return GetSide()*GetSide();
    }

    @Override
    double GetPerimeter()
    {
        return GetSide() * 4;
    }

    public Square(double size)
    {
        super(size, size);
    }
}
