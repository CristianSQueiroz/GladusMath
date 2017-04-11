/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import gladusutil.Components.HashMap;

/**
 *
 * @author csqueiroz
 */
public class Triangle {

    private int posX1;
    private int posX2;
    private int posY1;
    private int posY2;
    private int posZ1;
    private int posZ2;

    public Triangle(Triangle triangle) {
        posX1 = triangle.getPosX1();
        posX2 = triangle.getPosX2();
        posY1 = triangle.getPosY1();
        posY2 = triangle.getPosY2();
        posZ1 = triangle.getPosZ1();
        posZ2 = triangle.getPosZ2();
    }

    public Triangle(HashMap vector) {
        if (vector.size() == 6) {
            posX1 = vector.getValueAsInt("X1");
            posX2 = vector.getValueAsInt("X2");
            posY1 = vector.getValueAsInt("Y1");
            posY2 = vector.getValueAsInt("Y2");
            posZ1 = vector.getValueAsInt("Z1");
            posZ2 = vector.getValueAsInt("Z2");
        }
    }

    public int getPosX1() {
        return posX1;
    }

    public void setPosX1(int posX1) {
        this.posX1 = posX1;
    }

    public int getPosX2() {
        return posX2;
    }

    public void setPosX2(int posX2) {
        this.posX2 = posX2;
    }

    public int getPosY1() {
        return posY1;
    }

    public void setPosY1(int posY1) {
        this.posY1 = posY1;
    }

    public int getPosY2() {
        return posY2;
    }

    public void setPosY2(int posY2) {
        this.posY2 = posY2;
    }

    public int getPosZ1() {
        return posZ1;
    }

    public void setPosZ1(int posZ1) {
        this.posZ1 = posZ1;
    }

    public int getPosZ2() {
        return posZ2;
    }

    public void setPosZ2(int posZ2) {
        this.posZ2 = posZ2;
    }

}
