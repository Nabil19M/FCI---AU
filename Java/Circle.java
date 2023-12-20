/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nabil
 */
public class Circle extends GeometricObject {
    private double radius;
    public Circle()
    {
    }
   public Circle(double radius)
   {
       this.radius = radius;
   }
   public void setRadius(double radius)
   {
       this.radius = radius;
   }
  public double getPerimeter()
    {
        return (Math.round((Math.PI * 2 * radius) * 100));
    }
    public double getArea()
    {
        return (Math.round(Math.PI * Math.pow(radius, 2) * 100));
    }
}