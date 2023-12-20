/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nabil
 */
public class Rectangle extends GeometricObject {
    private double width;
    private double height;
    public Rectangle(double width,double height)
    {
     this.height = height;
     this.width = width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getPerimeter()
    {
        return ((width + height) * 2);
    }
    public double getArea()
    {
        return (width * height);
    }
}
