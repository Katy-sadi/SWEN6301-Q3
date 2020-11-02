/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swen6301;
import java.lang.Math;
/**
 *
 * @author Katy
 */
public class Triangle extends TwoDimensionalShape implements Comparable<Triangle>{
    private double side1,side2,base;
    private int TriangleId;
    private String color;

    public Triangle(double side1, double side2, double base, int TriangleId, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.TriangleId = TriangleId;
        this.color = color;
    }

    public Triangle(double side1, double side2, double base, int TriangleId) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.TriangleId = TriangleId;
        this.color="BLACK";
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getBase() {
        return base;
    }

    public int getTriangleId() {
        return TriangleId;
    }

    public String getColor() {
        return color;
    }

    

    @Override
    public double getArea() {
        double p,res,temp;
        p=(this.getSide1()+this.getSide2()+this.getBase())/2.0;
        temp= (p-this.getSide1())*(p-this.getSide2())*(p-this.getBase());
        res=Math.sqrt(p*temp);
        return res;
    }

    @Override
    public double getPerimeter() {
        double res = this.getBase() + this.getSide1()+this.getSide2();
        return res;
    }
    //Compare between areas of two Triangles, the parameter is an instance of Triangle
    public int compareArea(Triangle o) {
        int cmp;
        double ar2=o.getArea();
        if(this.getArea() > ar2)
            cmp=1;
        else if (this.getArea() == ar2)
            cmp=0;
        else cmp=-1;
        return cmp;
    }
     //Compare between perimeter of two Triangles, the parameter should an instance of triangle    
    public int comparePerimeter(Triangle o) {
        int cmp;
        double Per=o.getPerimeter();
        if(this.getPerimeter()> Per)
            cmp=1;
        else if (this.getPerimeter()== Per)
            cmp=0;
        else cmp=-1;
        return cmp;
    }

    @Override
    public int getNumberOfSides() {
        return 3;
    }
    //Polymorphism | Overloading
    // Method to Find the sum of Areas of two triangles, parameter is an instance of Triangle
    //Stamp Coupling
    public double findSumOfAreasForTwoTriangles(Triangle t){
        double result = this.getArea() + t.getArea();
        return result;
    }
    // Method to Find the sum of Areas of two triangles, parameter is an instance of Triangle
    //Data Coupling
    public double findSumOfAreasForTwoTriangles(double area){
        return area+getArea();
    }

    @Override
    public String toString() {
        return "The Triangle ID is:\t" + this.TriangleId + 
                "\nThe values of Sides are respictivly:\t "+ this.getSide1()+
                ","+this.getSide2()+","+this.getBase()+"\n The Color of The Triangle is:\t"+
                this.getColor()+"\n For More Details You Are Free To Use The Methods";

    }

    @Override
    public int compareTo(Triangle t) {
        int cmp;
        double ar2=t.getArea();
        if(this.getArea() > ar2)
            cmp=1;
        else if (this.getArea() == ar2)
            cmp=0;
        else cmp=-1;
        
        return cmp;
    }
}
