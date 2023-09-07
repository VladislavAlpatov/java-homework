package homework3;

public abstract class Shape
{
    public Shape(String sColor, boolean bIsFilled)
    {
        m_sColor = sColor;
        m_bIsFilled = bIsFilled;
    }

    public String GetColor()
    {
        return m_sColor;
    }

    public void SetsColor(String sColor)
    {
        m_sColor = sColor;
    }

    protected String m_sColor = "#FFFFFF";
    protected boolean m_bIsFilled = false;

    public boolean IsField()
    {
        return m_bIsFilled;
    }
    public void SetFilled(boolean bSetFilled)
    {
        m_bIsFilled = bSetFilled;
    }
    Shape()
    {

    }

    abstract double GetArea();
    abstract double GetPerimeter();
}
