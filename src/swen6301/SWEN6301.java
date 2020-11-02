/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swen6301;

import java.util.Scanner;

/**
 *
 * @author Katy
 */
public class SWEN6301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double sum1,sum2,area1,area2,area3;
        Triangle T1= new Triangle(3.0,4.0, 5.0,0);
        Triangle T2= new Triangle(6.0,8.0,10.0,1,"RED");
        Triangle T3= new Triangle(5.0,12.0, 13.0,2,"PINK");
        //Display basic Information
        System.out.println("The Information for each Triangle:");
        System.out.println(T1.toString());
        System.out.println(T2.toString());
        System.out.println(T3.toString());
        System.out.println("*******************************");
        area1=T1.getArea();
        area2=T2.getArea();
        area3=T3.getArea();
        System.out.println("The Area of T1 is:\t"+area1);
        System.out.println("The Area of T2 is:\t"+area2);
        System.out.println("The Area of T3 is:\t"+area3);
        //Using Compare Methods
        System.out.println("\nComparing Between T3 & T2"+T3.compareTo(T2)+"\n *******************************\n");
        //Use Sum of two areas
        
        sum1=T1.findSumOfAreasForTwoTriangles(T3);
        sum2=T3.findSumOfAreasForTwoTriangles(area2);
        System.out.println("The First Result Using Instance of Object\t"+sum1);
        System.out.println("The First Result Using the value from the object\t"+sum2);
        
    }
    
}
