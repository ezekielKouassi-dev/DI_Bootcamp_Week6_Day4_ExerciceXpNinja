/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.exercicexpninjaweek6day4;

import di.atos.exercicexpninjaweek6day4.exercice1.Matrix;

/**
 *
 * @author ezekielkouassi
 */
public class ExerciceXpNinjaWeek6Day4 {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2,2);
        
        matrix.fillMatrix();
        matrix2.fillMatrix();
        
        matrix.add(matrix2);
        
        
    }
}
