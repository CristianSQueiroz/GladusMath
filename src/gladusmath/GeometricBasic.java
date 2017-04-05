/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladusmath;

import gladusutil.Components.HashMap;import java.awt.Polygon;
import javax.swing.JFrame;
;
import javax.swing.JOptionPane;

/**
 *
 * @author csqueiroz
 */
public class GeometricBasic {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Informe a posição dos vertices divididos por virgulas");
        String[] vetorA = JOptionPane.showInputDialog("A: ").split(",");
        String[] vetorB = JOptionPane.showInputDialog("B: ").split(",");
        String[] vetorC = JOptionPane.showInputDialog("C: ").split(",");
        HashMap vectors = new HashMap();
        vectors.put("X1", vetorA[0]);
        vectors.put("X2", vetorA[1]);
        vectors.put("Y1", vetorB[0]);
        vectors.put("Y2", vetorB[1]);
        vectors.put("Z1", vetorC[0]);
        vectors.put("Z2", vetorC[1]);

        new GeometricBasic().calcAreaTri(vectors);
    }

    public void calcAreaTri(HashMap vectors) {
        if (vectors.size() == 6) {
            int posX1 = vectors.getValueAsInt("X1");
            int posX2 = vectors.getValueAsInt("X2");
            int posY1 = vectors.getValueAsInt("Y1");
            int posY2 = vectors.getValueAsInt("Y2");
            int posZ1 = vectors.getValueAsInt("Z1");
            int posZ2 = vectors.getValueAsInt("Z2");
            System.out.println("Dadas os vertices A("+posX1+","+posX2+") B("+posY1+","+posY2+") C("+posZ1+","+posZ2+")");
            System.out.println("");

            String line1 = "| " + posX1 + " " + posX2 + " 1 |";
            String line2 = "|  " + posY1 + " " + posY2 + " 1 |";;
            String line3 = "|  " + posZ1 + " " + posZ2 + " 1 |";;
            System.out.println(line1);
            System.out.println(line2);
            System.out.println(line3);
            System.out.println("");

            int d1 = (posX1 * posY2);
            int d2 = (posX2 * posZ1);
            int d3 = (posY1 * posZ2);
            int d4 = (posX1 * posZ2);
            int d5 = (posX2 * posY1);
            int d6 = (posY2 * posZ1);

            System.out.println("Dimensão : ("+d1+") + ("+d2+") + ("+d3+") -( ("+d4+") + ("+d5+") + ("+d6+") )");
            d1 = d1 + d2 + d3;
            d2 = d4 + d5 + d6;
            System.out.println("Dimensão :"+d1+" - ("+d2+")");
            d1 = d1-d2;
            System.out.println("Dimensão :"+d1);
            if(d1<0){
                System.out.println("Dimensão :"+d1+".(-1) //Como não existe area negativa");
                d1 *= -1;
            }
            System.out.println("Dimensão :" + d1);
            System.out.println("Area: dimensão/ 2");
            System.out.println("Area: "+d1+"/ 2");
            System.out.println("Area: "+d1/2);

            double v1 = Math.sqrt(Math.pow((posY1 - posX1), 2d) + Math.pow((posY2 - posX2), 2d));
            double v2 = Math.sqrt(Math.pow((posZ1 - posY1), 2d) + Math.pow((posZ2 - posY2), 2d));
            double v3 = Math.sqrt(Math.pow((posX1 - posZ1), 2d) + Math.pow((posX2 - posZ2), 2d));

            System.out.println("Distancia 1: " + v1);
            System.out.println("Distancia 2: " + v2);
            System.out.println("Distancia 3: " + v3);

            double result = v1 + v2 + v3;
            System.out.println("Perimetro: distancia 1 + distancia 2 + distancia 3");
            System.out.println("Perimetro: "+v1+" + "+v2+" + "+v3);
            System.out.println("Perimetro: " + result);

        } else {
            System.out.println("Vectors invalid");
        }
    }
    
    public void drawPoligon(){
        JFrame frame = new JFrame();
        
    }
}

