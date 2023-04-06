/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7.BAI2;

/**
 *
 * @author Ngoc Nhi
 */


public class MoveablePoint implements Moveable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public void moveUp(){
        System.out.println("di chuyen len tren");
    }
     @Override
    public void moveDown(){
        System.out.println("di chuyen xuong duoi");
    }
     @Override
    public void moveLeft(){
        System.out.println("di chuyen sang trai");
    }
     @Override
    public void moveRight(){
        System.out.println("di chuyen sang phai");
    }

    @Override
    public String toString() {
        return "MoveablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
    
}