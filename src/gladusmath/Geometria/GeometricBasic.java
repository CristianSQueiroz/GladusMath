/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladusmath.Geometria;

import Model.Triangle;
import gladusutil.Components.HashMap;

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
        
        Triangle triangle = new Triangle(vectors);
        Trigonometry trigonometry = new Trigonometry();
        trigonometry.calcArea(triangle);
        trigonometry.calcDimension(triangle);
        trigonometry.calcPerimeter(triangle);
        trigonometry.getTypeTriangle(triangle);
        
      
    }
}

