package homework3;

public class Circle extends Shape
{
    public Circle(String sColor, boolean bIsFilled, double dRadius)
    {
        super(sColor, bIsFilled);
        m_dRadius = dRadius;
    }

    public Circle(double dRadius)
    {
        m_dRadius = dRadius;
    }

    public Circle()
    {
    }

    public double GetRadius()
    {
        return m_dRadius;
    }

    public void SetRadius(double dRadius)
    {
        m_dRadius = dRadius;
    }

    protected double m_dRadius;
    @Override
    double GetArea()
    {
        return Math.PI * (m_dRadius * m_dRadius);
    }

    @Override
    double GetPerimeter()
    {
        return  2. * Math.PI * m_dRadius;
    }

    @Override
    public String toString()
    {
        return "Circle{" +
                "m_dRadius=" + m_dRadius +
                ", m_sColor='" + m_sColor + '\'' +
                ", m_bIsField=" + m_bIsFilled +
                '}';
    }
}
