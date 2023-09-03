package org.example.homework1;

public class Ball
{
    private double m_X;
    private double m_Y;

    public double GetX() {return m_X;}
    public double GetY() {return m_Y;}

    public void SetX(double val) {m_X = val;}
    public void SetY(double val) {m_Y = val;}

    public void setXY(double x, double y)
    {
        m_X = x;
        m_Y = y;
    }
    public void move( double xDisp, double yDisp)
    {
        m_X += xDisp;
        m_Y += yDisp;
    }
    @Override
    public String toString()
    {
        return "Ball @ ("+this.m_X+", "+this.m_Y+").";
    }
    public Ball() {}

    public Ball(double x, double y)
    {
        m_X = x;
        m_Y = y;
    }
}
