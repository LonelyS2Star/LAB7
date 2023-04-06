/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7.BAI2;

/**
 *
 * @author Ngoc Nhi
 */
public class Main { 
    public static void main(String[] args)
    {
        Moveable m1 = new MoveablePoint(5, 6, 10, 10);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
          
    }
}

