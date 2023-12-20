/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nabil
 */
public abstract class GeometricObject {
    private String color;
    private boolean filled;
    protected GeometricObject()
    {
    }
    protected GeometricObject(String color,boolean filled)
    {   
    }
    public abstract double getPerimeter();
    public abstract double getArea();
}
