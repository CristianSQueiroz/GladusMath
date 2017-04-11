/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladusmath.Geometria;

import Model.Triangle;

/**
 *
 * @author csqueiroz
 */
public class Trigonometry {

    public void calcArea(Triangle triangle) {

        int posX1 = triangle.getPosX1();
        int posX2 = triangle.getPosX2();
        int posY1 = triangle.getPosY1();
        int posY2 = triangle.getPosY2();
        int posZ1 = triangle.getPosZ1();
        int posZ2 = triangle.getPosZ2();

        int d1 = (posX1 * posY2);
        int d2 = (posX2 * posZ1);
        int d3 = (posY1 * posZ2);
        int d4 = (posX1 * posZ2);
        int d5 = (posX2 * posY1);
        int d6 = (posY2 * posZ1);

        d1 = d1 + d2 + d3;
        d2 = d4 + d5 + d6;
        d1 = d1 - d2;
        if (d1 < 0) {
            d1 *= -1;
        }

        System.out.println("Area: " + d1 / 2);

    }

    public void calcDimension(Triangle triangle) {

        int posX1 = triangle.getPosX1();
        int posX2 = triangle.getPosX2();
        int posY1 = triangle.getPosY1();
        int posY2 = triangle.getPosY2();
        int posZ1 = triangle.getPosZ1();
        int posZ2 = triangle.getPosZ2();

        int d1 = (posX1 * posY2);
        int d2 = (posX2 * posZ1);
        int d3 = (posY1 * posZ2);
        int d4 = (posX1 * posZ2);
        int d5 = (posX2 * posY1);
        int d6 = (posY2 * posZ1);

        d1 = d1 + d2 + d3;
        d2 = d4 + d5 + d6;
        d1 = d1 - d2;
        if (d1 < 0) {
            d1 *= -1;
        }
        System.out.println("Dimensão :" + d1);

    }

    public void calcPerimeter(Triangle triangle) {

        int posX1 = triangle.getPosX1();
        int posX2 = triangle.getPosX2();
        int posY1 = triangle.getPosY1();
        int posY2 = triangle.getPosY2();
        int posZ1 = triangle.getPosZ1();
        int posZ2 = triangle.getPosZ2();

        double v1 = Math.sqrt(Math.pow((posY1 - posX1), 2d) + Math.pow((posY2 - posX2), 2d));
        double v2 = Math.sqrt(Math.pow((posZ1 - posY1), 2d) + Math.pow((posZ2 - posY2), 2d));
        double v3 = Math.sqrt(Math.pow((posX1 - posZ1), 2d) + Math.pow((posX2 - posZ2), 2d));

        double result = v1 + v2 + v3;
        System.out.println("Perimetro: " + result);

    }

    public void calcCosTriangle(Triangle triangle) {

    }

    public void calcAngleTriangle(Triangle triangle) {

    }

    public void getTypeTriangle(Triangle triangle) {

        int posX1 = triangle.getPosX1();
        int posX2 = triangle.getPosX2();
        int posY1 = triangle.getPosY1();
        int posY2 = triangle.getPosY2();
        int posZ1 = triangle.getPosZ1();
        int posZ2 = triangle.getPosZ2();

        double v1 = Math.sqrt(Math.pow((posY1 - posX1), 2d) + Math.pow((posY2 - posX2), 2d));
        double v2 = Math.sqrt(Math.pow((posZ1 - posY1), 2d) + Math.pow((posZ2 - posY2), 2d));
        double v3 = Math.sqrt(Math.pow((posX1 - posZ1), 2d) + Math.pow((posX2 - posZ2), 2d));

        if (v1 == v2 && v1 == v3) {
            System.out.println("Triangulo equilátero");
        } else if ((v1 == v2 && v1 != v3)
                || (v1 != v2 && v2 == v3)
                || (v1 != v2 && v1 == v3)) {
            System.out.println("Triangulo isósceles");
        } else if ((v1 != v2 && v2 != v3)) {
            System.out.println("Triangulo escaleno");
        }

    }

}
