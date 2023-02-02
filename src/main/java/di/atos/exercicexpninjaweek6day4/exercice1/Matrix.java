/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpninjaweek6day4.exercice1;

import java.util.Scanner;

/**
 *
 * @author ezekielkouassi
 */
public class Matrix {

    private int row;
    private int column;
    private double[][] matrix;

    public Matrix() {
        super();
        this.row = 2;
        this.column = 2;
        this.matrix = new double[2][2];
    }

    public Matrix(int row, int column) {
        super();
        this.row = row;
        this.column = column;
        this.matrix = new double[row][column];
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public double[][] getMatrix() {
        return this.matrix;
    }

    public double getCell(int i, int j) {
        return this.matrix[i][j];
    }

    public void setCell(int i, int j, double value) {
        this.matrix[i][j] = value;
    }

    public void fillMatrix() {
        double[][] matrixToFill = new double[this.row][this.column];
        Scanner sc = new Scanner(System.in);
        System.out.println("vous devez enregistrer votre matrice : ");
        try {
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.column; j++) {
                    System.out.printf("rentrer la valeur : (%d,%d) ---->>>>> ", i, j);
                    matrixToFill[i][j] = sc.nextDouble();
                }
            }
            this.matrix = matrixToFill;
        } catch (Exception e) {
            throw new Error("erreur : veuillez rentrer des nombres réel : " + e.getMessage());
        }

    }

    public void add(Matrix matrixToAdd) {

        if (this.getRow() != matrixToAdd.getRow()) {
            System.out.println("impossible de faire l'addition");
            return;
        }

        Matrix matrixResult = new Matrix(this.row, this.column);

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                double sum = this.matrix[i][j] + matrixToAdd.getMatrix()[i][j];
                matrixResult.getMatrix()[i][j] = sum;
            }
        }

        String displayMatrix = "";

        System.out.println("le résultat de votre addition de matrix est : ----->>>>>>>>>>>");

        for (int i = 0; i < matrixResult.getRow(); i++) {
            for (int j = 0; j < matrixResult.getRow(); j++) {
                displayMatrix += String.valueOf(matrixResult.getCell(i, j)) + " ";
            }
            System.out.println("[ " + displayMatrix + "]");
            displayMatrix = "";
        }

    }
}
